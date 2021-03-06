
package pokemongamee;

import pokemongamee.Movable.Swimmable;





/**
 *
 * @author ASUS-PC
 */

    
public class Chamander extends Pokemon implements Swimmable{
	private static final int maxGroupHealth = 270;
	public Chamander(){
		super("Chamander",
		      (int)(Math.random()*1000) % (maxGroupHealth+1),15);

		this.attackSkill = PokemonSkill.getPokemonSkill("Tail Whip");
		this.untimatedSkill = PokemonSkill.getPokemonSkill("Water Pulse");
	}

	public void move(){
		this.swim();
	}

	public void swim(){
		this.reducedHealth(10);
	}
}
    

