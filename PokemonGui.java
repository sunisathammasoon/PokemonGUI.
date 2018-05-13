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
    JLabel Image,pokemonIcon,totalberryIcon;
    Icon eeveeIcon,picachuIcon,chamanderIcon,pokemongoIcon,
         fruitIcon,berryIcon,goldberryIcon,pinapberryIcon,eatChamanderIcon,
         eatEeveeIcon,eatPicachuIcon;
    JButton select,eat,exercise,battle;
    JComboBox selectPokemon,selectBerry; 
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
       
         public void eatBerry(int mumber){
            Berry berry = new Berry(mumber);
            pokemons.get(mumber).eat(berry);
            printProperty.setText(printPokemons(pokemons,mumber));
    }
       
       
    public PokemonGui(){
         super ("Pokemon");
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
    //*********************************    
        JPanel p = new JPanel();
        p.setBackground(Color.PINK);
        p.setLayout(new FlowLayout());
        
    //**********************************    
         String allpokemons[] ={"------All Pokemon------","Charmander","Eevee","Pikachu"};
        selectPokemon = new JComboBox(allpokemons);
        selectPokemon.setPreferredSize(new Dimension(150,20));
        
        String allBerry[]={"--------All Berry--------","Berry","GoldBerry","PinapBerry"};
        selectBerry = new JComboBox(allBerry);
        selectBerry.setPreferredSize(new Dimension(150,20));
        
        printProperty  = new JTextArea ("",6,40);
        eeveeIcon  = new ImageIcon(getClass().getResource("Eevee.png"));
        picachuIcon = new ImageIcon(getClass().getResource("picachu.gif"));
        chamanderIcon = new ImageIcon(getClass().getResource("chamander.png"));
        pokemongoIcon = new ImageIcon(getClass().getResource("pokemongo.png"));
        pokemonIcon   = new JLabel("");
        pokemonIcon.setIcon(pokemongoIcon);
        
        fruitIcon  = new ImageIcon(getClass().getResource("fruit.png"));
        berryIcon = new ImageIcon(getClass().getResource("Berry.png"));
        goldberryIcon = new ImageIcon(getClass().getResource("goldBerry.png"));
        pinapberryIcon = new ImageIcon(getClass().getResource("pinapBerry.png"));
        eatChamanderIcon = new ImageIcon(getClass().getResource("eatChamander.png"));
        eatEeveeIcon = new ImageIcon(getClass().getResource("eatEevee.png"));
        eatPicachuIcon = new ImageIcon(getClass().getResource("eatPikachu.png"));
        totalberryIcon = new JLabel("");
       
        
        select = new JButton("SelectPokemon:");
     //******************************************   
      printProperty.setText('\n' +"- - - - - - - - - - W E L C O M E - - - - - - - - - " +'\n' +'\n'  +"SelectPokemon NOW!!!!!!! ====> >> ");
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
                switch (selectBerry.getSelectedIndex()) {
                    
                    
                      
                         
                         case 1:
                         totalberryIcon.setIcon(berryIcon);
                            if(selectPokemon.getSelectedIndex()==1)
                                 pokemonIcon.setIcon(eatChamanderIcon);
                            else if(selectPokemon.getSelectedIndex()==2)
                                 pokemonIcon.setIcon(eatEeveeIcon);
                            else if(selectPokemon.getSelectedIndex()==3)
                                 pokemonIcon.setIcon(eatPicachuIcon);
                            
                         eatBerry(memberChamander);
                         //pokemons.get(memberChamander).eat((int) pokemons.get(memberChamander).getWeight());
                       //  printProperty.setText(printPokemons(pokemons,memberChamander));
                        
                          break;
                          
                         case 2:
                         totalberryIcon.setIcon(goldberryIcon);
                         if(selectPokemon.getSelectedIndex()==1)
                                 pokemonIcon.setIcon(eatChamanderIcon);
                            else if(selectPokemon.getSelectedIndex()==2)
                                 pokemonIcon.setIcon(eatEeveeIcon);
                            else if(selectPokemon.getSelectedIndex()==3)
                                 pokemonIcon.setIcon(eatPicachuIcon);
                         eatBerry(memberEevee);
                         // pokemons.get(memberEevee).eat((int) pokemons.get(memberEevee).getWeight());
                        // printProperty.setText(printPokemons(pokemons,memberEevee));
                          break;
                         
                         case 3: 
                         totalberryIcon.setIcon(pinapberryIcon);
                         if(selectPokemon.getSelectedIndex()==1)
                                 pokemonIcon.setIcon(eatChamanderIcon);
                            else if(selectPokemon.getSelectedIndex()==2)
                                 pokemonIcon.setIcon(eatEeveeIcon);
                            else if(selectPokemon.getSelectedIndex()==3)
                                 pokemonIcon.setIcon(eatPicachuIcon);
                         eatBerry(memberPicachu);
                        //  pokemons.get(memberPicachu).eat((int) pokemons.get(memberPicachu).getWeight());
                        // printProperty.setText(printPokemons(pokemons,memberPicachu));
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
                          pokemons.get(memberPicachu).reducedHealth((int) pokemons.get(memberPicachu).getHealth ());
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
        p.add(totalberryIcon);
        p.add(selectBerry);
        
        p.add(eat);
        p.add(exercise);
        p.add(battle);
       
       
        c.add(p, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(770,615);
        setVisible(true);
    }
     
        
    
    
}
