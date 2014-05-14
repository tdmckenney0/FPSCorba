/*

Shield Class

@author: Tanner Mckenney

*/

package Client;

import java.util.Random; 

public class Shield {

	private String name; 			/* name of the shield */
	private WeaponType type; 		/* WeaponType reflects */
	private Integer resistance;		/* base resistance of the shield */
	private Integer maxLevel; 		/* Ceiling the level can be set at. */
	private Integer level;			/* Current level of the weapon; cannot be greater than maxLevel; randomly generated */
	private Integer splashResist;	/* Resist damage afflicted randomly to players */
	private Double rarity; 			/* Percent chance a weapon will appear in the pool */
	
	public Shield(String name, WeaponType type, Integer resistance, Integer maxLevel, Integer splashResist, Double rarity) {
	
		Random rand = new Random(); 
	
		this.name = name;
		this.type = type;
		this.maxLevel = maxLevel;
		this.rarity = rarity;
		
		this.level = (rand.nextInt(this.maxLevel) + 1); // 0 Is inclusive and maxLevel is exclusive, so shift right by one. 
		
		this.resistance = (resistance * this.level); // calculate the resistance
		this.splashResist = (splashResist * this.level); // calculate the splash
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
	
	public Integer getResistance() {
		return this.resistance; 
	}
	
	public Integer getSplashResistance() {
		return this.splashResist; 
	}
}