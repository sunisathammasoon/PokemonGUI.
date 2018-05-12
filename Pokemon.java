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
abstract class Pokemon {
    	public final double maxHealth;
	protected double health;
	protected String name;
	protected PokemonSkill attackSkill;
	protected PokemonSkill untimatedSkill;
        protected double weight;

	public Pokemon(String name, double maxHealth,double weight){
		this.name = name;
		this.health = maxHealth;
		this.maxHealth = maxHealth;
                this.weight=weight;
	}

	public double getHealth(){
		return this.health;
	}

	public String getName(){
		return this.name;
	}
        public double getWeight(){
		return this.weight;
	}
	
	public void eat( int weight){
              this.weight++;
            
                
        }
        public void exercise( int weight){
              this.weight--; 
               if(this.weight < 0)
                 this.weight = 0;
        }

	public void attack(Pokemon rival){
		rival.injure(this.attackSkill);
	}

	public void untimate(Pokemon rival){
		rival.injure(this.untimatedSkill);
	}

	public void injure(PokemonSkill skill){
		this.reducedHealth(skill.getDamage());
	}

	public void reducedHealth(double value){
		this.health --;
		if(this.health < 0)
			this.health = 0;
	}

	abstract public void move();

   /* String getWeight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
}
