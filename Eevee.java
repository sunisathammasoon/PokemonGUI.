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
public class Eevee extends Pokemon implements Runnable {
    private static final int maxGroupHealth = 220;
    public Eevee(){
        super("Eevee",
		      (int)(Math.random()*1000) % (maxGroupHealth+1),8);

		this.attackSkill = PokemonSkill.getPokemonSkill("Quick attack");
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
