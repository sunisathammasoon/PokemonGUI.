/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongamee;

/**
 *
 * @author ASUS-PC
 */
public class Start extends Pokemon implements Runnable {
    private static final int maxGroupHealth = 0;
    public Start(){
        super("XXXXXXXXXXX",
		      0,0);

		this.attackSkill = PokemonSkill.getPokemonSkill("Quickattack");
		this.untimatedSkill = PokemonSkill.getPokemonSkill("Tackle");
    }
    
    public void move(){
		this.run();
	}
    public void run(){
		this.reducedHealth(15);
	}

    public void walk(){
		this.reducedHealth(3);
	}
   

    
}
