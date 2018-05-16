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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;


public class PokemonGui extends JFrame {
    ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
    JLabel Image,pokemonIcon,totalberryIcon;
    Icon eeveeIcon,picachuIcon,chamanderIcon,pokemongoIcon,
         fruitIcon,berryIcon,goldberryIcon,pinapberryIcon,eatChamanderIcon,
         eatEeveeIcon,eatPicachuIcon,picachurunIcon,eeveerunIcon,chamanderrunIcon;
    JButton select,eat,exercise,battle;
    JComboBox selectPokemon,selectBerry; 
    JTextArea printProperty;
    int memberChamander,memberPicachu,memberEevee;
    
    private int temp = 0;
    
    public String printPokemonstotal(int memberIndex){
        String hp = "======== Pokemon Profile ======== \n"+"Pokemon "+
                this.pokemons.get(memberIndex).getName()+" health: "+this.pokemons.get(memberIndex).getHealth()
                +"/"+this.pokemons.get(memberIndex).maxHealth;
        
        String weight = "\n======== Pokemon Weight ======== \n"+" Weight: "+
                this.pokemons.get(memberIndex).getWeight();
        return hp+weight;
    }
    public void eatBerry(int member, int berryType){
            Berry berry = new Berry(berryType);
            this.pokemons.get(member).eat(berry);
            printProperty.setText(printPokemonstotal(member));
    }
          
    public PokemonGui(){
        
        super ("Pokemon");
        
        //set initial value
        this.memberChamander =0;
        this.memberEevee = 1;
        this.memberPicachu = 2;
        
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
        
    //text area for output
        printProperty  = new JTextArea ("",6,40);
    
    //setting Icons and init picture
        eeveeIcon  = new ImageIcon(getClass().getResource("Eevee.png"));
        picachuIcon = new ImageIcon(getClass().getResource("picachu.gif"));
        chamanderIcon = new ImageIcon(getClass().getResource("chamander.png"));
        pokemongoIcon = new ImageIcon(getClass().getResource("pokemongo.png"));
        pokemonIcon   = new JLabel("");
        pokemonIcon.setIcon(pokemongoIcon);
        
        //set berry icons
        fruitIcon  = new ImageIcon(getClass().getResource("fruit.png"));
        berryIcon = new ImageIcon(getClass().getResource("Berry.png"));
        goldberryIcon = new ImageIcon(getClass().getResource("goldBerry.png"));
        pinapberryIcon = new ImageIcon(getClass().getResource("pinapBerry.png"));
        eatChamanderIcon = new ImageIcon(getClass().getResource("eatChamander.png"));
        eatEeveeIcon = new ImageIcon(getClass().getResource("eatEevee.png"));
        eatPicachuIcon = new ImageIcon(getClass().getResource("eatPikachu.png"));
        totalberryIcon = new JLabel("");
      
        //set run
        picachurunIcon=new ImageIcon(getClass().getResource("runpikachu.gif"));
        eeveerunIcon=new ImageIcon(getClass().getResource("runeevee.gif"));
        chamanderrunIcon=new ImageIcon(getClass().getResource("runcahsmander.gif"));
        
        
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
            
    // เลือกกกกก    
        select.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    switch (selectPokemon.getSelectedIndex()) {
                        
                    
                         case 0:
                         pokemonIcon.setIcon(pokemongoIcon);
                         printProperty.setText('\n' +"- - - - - - - - - - W E L C O M E - - - - - - - - - " +'\n' +'\n' 
                                 +"SelectPokemon NOW!!!!!!! ====> >> ");
                         
                         break;
                         case 1:
                         pokemonIcon.setIcon(chamanderIcon);
                         printProperty.setText(printPokemonstotal(selectPokemon.getSelectedIndex()-1
                         ));
                    
                          break;
                          
                         case 2:
                         pokemonIcon.setIcon(eeveeIcon);
                         printProperty.setText(printPokemonstotal(selectPokemon.getSelectedIndex()-1));
                    
                          break;
                         
                         case 3: 
                         pokemonIcon.setIcon(picachuIcon);
                         printProperty.setText(printPokemonstotal(selectPokemon.getSelectedIndex()-1));
                        
                          break;
                        default:
                          break;
                    } 
            }
                
        });
        
        
        selectBerry.addActionListener(new ActionListener() {
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
                    break;
                          
                    case 2:;
                            totalberryIcon.setIcon(goldberryIcon);
                            if(selectPokemon.getSelectedIndex()==1)
                                 pokemonIcon.setIcon(eatChamanderIcon);
                            else if(selectPokemon.getSelectedIndex()==2)
                                 pokemonIcon.setIcon(eatEeveeIcon);
                            else if(selectPokemon.getSelectedIndex()==3)
                                 pokemonIcon.setIcon(eatPicachuIcon);
                    break;
                         
                    case 3: 
                            totalberryIcon.setIcon(pinapberryIcon);
                            if(selectPokemon.getSelectedIndex()==1)
                                 pokemonIcon.setIcon(eatChamanderIcon);
                            else if(selectPokemon.getSelectedIndex()==2)
                                 pokemonIcon.setIcon(eatEeveeIcon);
                            else if(selectPokemon.getSelectedIndex()==3)
                                 pokemonIcon.setIcon(eatPicachuIcon);
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
                          eatBerry(selectPokemon.getSelectedIndex()-1,0);
            
                          break;
  
                         case 2:;
                         eatBerry(selectPokemon.getSelectedIndex()-1,1);
                          break;
                         
                         case 3: 
                         eatBerry(selectPokemon.getSelectedIndex()-1,2);
 
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
                         pokemonIcon.setIcon(chamanderrunIcon);
                         pokemons.get(memberChamander).exercise((int) pokemons.get(memberChamander).getWeight());
                         printProperty.setText(printPokemonstotal(memberChamander));
                        
                          break;
                          
                         case 2:
                         pokemonIcon.setIcon(eeveerunIcon);
                          pokemons.get(memberEevee).exercise((int) pokemons.get(memberEevee).getWeight());
                         printProperty.setText(printPokemonstotal(memberEevee));
                          break;
                         
                         case 3: 
                         pokemonIcon.setIcon(picachurunIcon);
                          pokemons.get(memberPicachu).exercise((int) pokemons.get(memberPicachu).getWeight());
                         printProperty.setText(printPokemonstotal(memberPicachu));
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
                         JOptionPane.showMessageDialog(new BattleMode(pokemons,selectPokemon.getSelectedIndex()-1) ,"Start Battle");
                          break;
                          
                         case 2:
                         
                         JOptionPane.showMessageDialog(new BattleMode(pokemons,selectPokemon.getSelectedIndex()-1),"Start Battle");
                          break;
                         
                         case 3: 
                         
                         JOptionPane.showMessageDialog(new BattleMode(pokemons,selectPokemon.getSelectedIndex()-1) ,"Start Battle");
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
