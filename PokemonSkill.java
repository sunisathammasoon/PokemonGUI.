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
public class PokemonSkill {
    private String name;
	private float damage;

	public PokemonSkill(String name, float damage){
		this.name = name;
		this.damage = damage;
	}

	public String getName(){
		return this.name;
	}

	public float getDamage(){
		return this.damage;
	}

	public static PokemonSkill getPokemonSkill(String name){
		PokemonSkill skill = null;
		switch(name.toLowerCase()){
			case "thunder shock":
				skill = new PokemonSkill("Thunder Shock", 10);
				break;
			case "thunderbolt":
				skill = new PokemonSkill("Thunderbolt", 30);
				break;
			case "tail whip":
				skill = new PokemonSkill("Tail Whip", 10);
				break;
			case "water pulse":
				skill = new PokemonSkill("Water Pulse", 30);
				break;
                        
                        case "quickattack":
				skill = new PokemonSkill("Quickattack", 10);
				break;
                          case "tackle":
				skill = new PokemonSkill("Tackle", 30);
				break;      
                                
		}
		return skill;
	}

}
