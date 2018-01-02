/* 
	@author: Tanner Mckenney	
	@email: tmckenney7@outlook.com
	
	Weapon class for FPS Java
	
*/

import java.util.Random; 

public class Weapon {

	/* Properties */

		private String name; 			/* name of the weapon */
		private WeaponType type; 		/* WeaponType determine */
		private Integer damage;		/* base Damage of the weapon */
		private Integer maxLevel; 		/* Ceiling the level can be set at. */
		private Integer level;			/* Current level of the weapon; cannot be greater than maxLevel; randomly generated */
		private Integer splashDamage;	/* Damage afflicted randomly to other players */
		private Double rarity; 			/* Percent chance a weapon will appear in the pool */
		
	/* Constructor */
	
		public Weapon(String name, WeaponType type, Integer damage, Integer maxLevel, Integer splashDamage, Double rarity) {
		
			Random rand = new Random(); 
		
			this.name = name;
			this.type = type;
			this.maxLevel = maxLevel;
			this.rarity = rarity;
			
			this.level = (rand.nextInt(this.maxLevel) + 1); // 0 Is inclusive and maxLevel is exclusive, so shift right by one. 
			
			this.damage = (damage * this.level); // calculate the damage
			this.splashDamage = (splashDamage * this.level); // calculate the splash
			
			// Shitty way to do this. But Pressed for time. 
			
			switch(this.level) {
				case 1:
					this.name = name + " I";
				break; 
				
				case 2:
					this.name = name + " II";
				break; 
				
				case 3:
					this.name = name + " III";
				break; 
				
				case 4:
					this.name = name + " IV";
				break; 
				
				case 5:
					this.name = name + " V";
				break; 
				
				default:
					// You shouldn't be here. 
				break;
			}
		}

	/* Getters */
	
		public String getName() {
			return this.name; 
		}
		
		public WeaponType getType() {
			return this.type; 
		}
		
		public Integer getDamage() {
			return this.damage; 
		}
		
		public Integer getLevel() {
			return this.level; 
		}

		public Integer getSplashDamage() {
			return this.splashDamage; 
		}
		
		public Double getRarity() {
			return this.rarity; 
		}
	
		public String toString() {
			return this.getName();
		}

}