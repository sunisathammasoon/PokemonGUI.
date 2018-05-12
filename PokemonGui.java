/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongamee;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
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
import javax.swing.SwingConstants;
/*
 *
 * @author ASUS-PC
 */
public class PokemonGui extends JFrame {
      ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
    JLabel Image,pokemonIcon;
    Icon eeveeIcon,picachuIcon,chamanderIcon,pokemongoIcon;
    JButton select,eat,exercise,battle;
    JComboBox selectPokemon; 
    JTextArea printProperty;
    int memberChamander,memberPicachu,memberEevee;
    
       public static String printPokemons(ArrayList<Pokemon> pokemons,int member){
        String hp = "======== Pokemon List ======== \n"+"Pokemon "+
                pokemons.get(member).getName()+" health: "+pokemons.get(member).getHealth()
                +"/"+pokemons.get(member).maxHealth;
        String weight = "\n======== Pokemon Weight ======== \n"+" Weight: "+
                pokemons.get(member).getWeight();
        return hp+weight;
    }
       
         /* public void Eat(int mumber){
            eat eatt = new Berry(0);
            pokemons.get(mumber).eat(berry);
            printProFile.setText(printPokemons(pokemons,mumber));
    }*/
       
       
    public PokemonGui(){
         super ("Pokemon");
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
    //*********************************    
        JPanel p = new JPanel();
        p.setBackground(Color.PINK);
        p.setLayout(new FlowLayout());
        
    //**********************************    
         String allpokemons[] ={"--------Pokemon--------","Charmander","Eevee","Pikachu"};
        selectPokemon = new JComboBox(allpokemons);
        selectPokemon.setPreferredSize(new Dimension(150,20));
        
        printProperty  = new JTextArea ("",10,20);
        eeveeIcon  = new ImageIcon(getClass().getResource("Eevee.png"));
        picachuIcon = new ImageIcon(getClass().getResource("picachu.gif"));
        chamanderIcon = new ImageIcon(getClass().getResource("chamander.png"));
        pokemongoIcon = new ImageIcon(getClass().getResource("pokemongo.png"));
        pokemonIcon   = new JLabel("");
        pokemonIcon.setIcon(pokemongoIcon);
        
        select = new JButton("SelectPokemon:");
     //******************************************   
      printProperty.setText('\n' +"- - - - - - - - - - W E L C O M E - - - - - - - - - " +'\n' +'\n' +'\n' +"SelectPokemon NOW!!!!!!! ====> >> ");
     //******************************************
     eat = new JButton("Eat");
     exercise = new JButton("Exercise");
     battle = new JButton("Battle");
     
     pokemons.add(new Chamander());
     pokemons.add(new Eevee());
     pokemons.add(new Pikachu());
            
        
        select.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    switch (selectPokemon.getSelectedIndex()) {
                        
                    
                         case 0:
                         pokemonIcon.setIcon(pokemongoIcon);
                         printProperty.setText('\n' +"- - - - - - - - - - W E L C O M E - - - - - - - - - " +'\n' +'\n' +'\n' +"SelectPokemon NOW!!!!!!! ====> >> ");
                         
                         break;
                         case 1:
                         pokemonIcon.setIcon(chamanderIcon);
                         memberChamander = 0;
                         printProperty.setText(printPokemons(pokemons,memberChamander));
                        
                          break;
                          
                         case 2:
                         pokemonIcon.setIcon(eeveeIcon);
                         memberEevee = 1;
                         printProperty.setText(printPokemons(pokemons,memberEevee));
                          break;
                         
                         case 3: 
                         pokemonIcon.setIcon(picachuIcon);
                         memberPicachu = 2;
                         printProperty.setText(printPokemons(pokemons,memberPicachu));
                          break;
                          default:
                          break;
                    } 
            }
                
        });
        
        
        eat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (selectPokemon.getSelectedIndex()) {
                    
                
                         case 1:
                         pokemonIcon.setIcon(chamanderIcon);
                         pokemons.get(memberChamander).eat((int) pokemons.get(memberChamander).getWeight());
                         printProperty.setText(printPokemons(pokemons,memberChamander));
                        
                          break;
                          
                         case 2:
                         pokemonIcon.setIcon(eeveeIcon);
                          pokemons.get(memberEevee).eat((int) pokemons.get(memberEevee).getWeight());
                         printProperty.setText(printPokemons(pokemons,memberEevee));
                          break;
                         
                         case 3: 
                         pokemonIcon.setIcon(picachuIcon);
                          pokemons.get(memberPicachu).eat((int) pokemons.get(memberPicachu).getWeight());
                         printProperty.setText(printPokemons(pokemons,memberPicachu));
                          break;
                          default:
                          break;
                    } 
            }
                
        });
        
         exercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (selectPokemon.getSelectedIndex()) {
                    
                
                         case 1:
                         pokemonIcon.setIcon(chamanderIcon);
                         pokemons.get(memberChamander).exercise((int) pokemons.get(memberChamander).getWeight());
                         printProperty.setText(printPokemons(pokemons,memberChamander));
                        
                          break;
                          
                         case 2:
                         pokemonIcon.setIcon(eeveeIcon);
                          pokemons.get(memberEevee).exercise((int) pokemons.get(memberEevee).getWeight());
                         printProperty.setText(printPokemons(pokemons,memberEevee));
                          break;
                         
                         case 3: 
                         pokemonIcon.setIcon(picachuIcon);
                          pokemons.get(memberPicachu).exercise((int) pokemons.get(memberPicachu).getWeight());
                         printProperty.setText(printPokemons(pokemons,memberPicachu));
                          break;
                          default:
                          break;
                    } 
            }
                
        });
        
        battle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (selectPokemon.getSelectedIndex()) {
                    
                
                         case 1:
                         pokemonIcon.setIcon(chamanderIcon);
                         pokemons.get(memberChamander).reducedHealth( pokemons.get(memberChamander).getHealth());
                         printProperty.setText(printPokemons(pokemons,memberChamander));
                        
                          break;
                          
                         case 2:
                         pokemonIcon.setIcon(eeveeIcon);
                          pokemons.get(memberEevee).reducedHealth((int) pokemons.get(memberEevee).getHealth());
                         printProperty.setText(printPokemons(pokemons,memberEevee));
                          break;
                         
                         case 3: 
                         pokemonIcon.setIcon(picachuIcon);
                          pokemons.get(memberPicachu).reducedHealth((int) pokemons.get(memberPicachu).getHealth());
                         printProperty.setText(printPokemons(pokemons,memberPicachu));
                          break;
                          default:
                          break;
                    } 
            }
                
        });
        
        

        p.add(pokemonIcon);
        p.add(printProperty); 
        p.add(select);
        p.add(selectPokemon);
        
        p.add(eat);
        p.add(exercise);
        p.add(battle);
       
       
        c.add(p, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(770,590);
        setVisible(true);
    }
     
        
    
    
}
