/* 
	@author: Tanner Mckenney	
	@email: tmckenney7@outlook.com
	
	Weapon class for FPS CORBA
	
*/

package Client;

import java.util.Random; 

public class Weapon {

	private String name; 			/* name of the weapon */
	private WeaponType type; 		/* WeaponType determine */
	private Integer damage;		/* base Damage of the weapon */
	private Integer maxLevel; 		/* Ceiling the level can be set at. */
	private Integer level;			/* Current level of the weapon; cannot be greater than maxLevel; randomly generated */
	private Integer splashDamage;	/* Damage afflicted randomly to other players */
	private Double rarity; 			/* Percent chance a weapon will appear in the pool */
	

	public Weapon(String name, WeaponType type, Integer damage, Integer maxLevel, Integer splashDamage, Double rarity) {
	
		Random rand = new Random(); 
	
		this.name = name;
		this.type = type;
		this.maxLevel = maxLevel;
		this.rarity = rarity;
		
		this.level = (rand.nextInt(this.maxLevel) + 1); // 0 Is inclusive and maxLevel is exclusive, so shift right by one. 
		
		this.damage = (damage * this.level); // calculate the damage
		this.splashDamage = (splashDamage * this.level); // calculate the splash
	}

	/* Getters and Setters */
	
	public String getName() {
		return this.name; 
	}
	
	public WeaponType getType() {
		return this.type; 
	}
	
	public Integer getLevel() {
		return this.level; 
	}
	
}