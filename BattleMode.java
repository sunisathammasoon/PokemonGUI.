
package pokemongamee;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class BattleMode extends JFrame{
    JPanel p1,p2,p3;
    JButton attackButton,untimateButton;
    JTextArea redText,blueText;
    JComboBox selectBox;
    int indexR;
    Pokemon redPlayer,bluePlayer;
    JLabel Image,pokemonIcon;
    Icon eeveeIcon,picachuIcon,chamanderIcon;
    ArrayList<Pokemon> pokemones = new ArrayList<Pokemon>();
     
    public static String printPokemons(ArrayList<Pokemon> pokemons,int member){
        String hp = "========== Pokemon List ========== \n"+"Name: "+
                pokemons.get(member).getName()+"\nHealth: "+pokemons.get(member).getHealth()
                +"/"+pokemons.get(member).maxHealth;
        String weight = " Weight: "+ pokemons.get(member).getWeight();
        
        return hp+weight;

    }
     public static String printPokemones(ArrayList<Pokemon> pokemones,int member){
        String hp = "========== Pokemon List ========== \n"+"Name: "+
                pokemones.get(member).getName()+"\nHealth: "+pokemones.get(member).getHealth()
                +"/"+pokemones.get(member).maxHealth;
        String weight = " Weight: "+ pokemones.get(member).getWeight();
        
        return hp+weight;
     }
        public static String printStart(){
        
        
        return "=======================\n =======================\n =======================\n";

    }
    
    
    public BattleMode(ArrayList<Pokemon> pokemons,int member){
        super("Battle_Royale");
        
        
        this.indexR = member;
        String namePokemon[] = {"Chamnder","Eevee","Pikachu"};
        
        pokemones.add(new Chamander());
        pokemones.add(new Eevee());
        pokemones.add(new Pikachu());
        pokemones.add(new Start());
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        Pokemon redPlayer = pokemons.get(indexR);
        
        p1 = new JPanel(); p1.setLayout(new FlowLayout());
        p2 = new JPanel(); p2.setLayout(new FlowLayout());
        p3 = new JPanel(); p3.setLayout(new FlowLayout());
        
        
        selectBox = new JComboBox(namePokemon);
        selectBox.setPreferredSize(new Dimension(120,20));
       
        
    
        
        attackButton = new JButton("Attack");
        untimateButton = new JButton("Untimate");
        
        redText = new JTextArea(printPokemons(pokemons,indexR),5,5);
        blueText = new JTextArea(printPokemones(pokemones,3),5,5);
        bluePlayer = pokemons.get(indexR);
        //Event attack
        attackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
       
        
                Pokemon redPlayer = pokemons.get(indexR);
                switch (selectBox.getSelectedIndex()) {
                    case 0:
                         bluePlayer = pokemones.get(selectBox.getSelectedIndex());
                         redPlayer.attack(bluePlayer);
                         redText.setText(printPokemons(pokemons,indexR));
                         blueText.setText(printPokemones(pokemones,selectBox.getSelectedIndex()));
                        break;
                    case 1:
                        bluePlayer = pokemones.get(selectBox.getSelectedIndex());
                        redPlayer.attack(bluePlayer);
                        redText.setText(printPokemons(pokemons,indexR));
                        blueText.setText(printPokemones(pokemones,selectBox.getSelectedIndex()));
                        break;
                    case 2:
                         bluePlayer = pokemones.get(selectBox.getSelectedIndex());
                         redPlayer.attack(bluePlayer);
                         redText.setText(printPokemons(pokemons,indexR));
                         blueText.setText(printPokemones(pokemones,selectBox.getSelectedIndex()));
                        break;
                    default:
                        break;
                }
            }
        });
        untimateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 switch (selectBox.getSelectedIndex()) {
                    case 0:
                         bluePlayer = pokemones.get(selectBox.getSelectedIndex());
                         redPlayer.untimate(bluePlayer);
                         redText.setText(printPokemons(pokemons,indexR));
                         blueText.setText(printPokemones(pokemones,selectBox.getSelectedIndex()));
                        break;
                    case 1:
                        bluePlayer = pokemones.get(selectBox.getSelectedIndex());
                        redPlayer.untimate(bluePlayer);
                        redText.setText(printPokemons(pokemons,indexR));
                        blueText.setText(printPokemones(pokemones,selectBox.getSelectedIndex()));
                        break;
                    case 2:
                         bluePlayer = pokemones.get(selectBox.getSelectedIndex());
                         redPlayer.untimate(bluePlayer);
                         redText.setText(printPokemons(pokemons,indexR));
                         blueText.setText(printPokemones(pokemones,selectBox.getSelectedIndex()));
                        break;
                    default:
                        break;
                }
                
            }
        });
       
        
        p2.add(attackButton);
        p2.add(untimateButton);
        p2.add(selectBox);
        
        p3.add(redText);
        p3.add(blueText);

        c.add(p1, BorderLayout.PAGE_START);
        c.add(p2, BorderLayout.CENTER);
        c.add(p3, BorderLayout.PAGE_END);
        //set others
        
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        c.setSize(700,800);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
       