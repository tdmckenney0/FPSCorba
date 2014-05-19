/* 
	Player Class
	
	@author: Tanner Mckenney
	@email: tmckenney7@outlook.com
*/

public class Player {

	/* Constants */

		private static final int INIT_HEALTH = 100;
		
	/* Properties */

		private Boolean isAlive; 
		private String name; 
		private Weapon weapon;
		private Shield shield; 
		private Integer health;
		
	/* Constructor */
	
		public Player(String name) {
			this.name = name; 
			this.isAlive = true;
			this.health = INIT_HEALTH; 
		}
	
	/* Setters */
	
		public void setWeapon(Weapon weapon) {
			this.weapon = weapon; 
		}
		
		public void setShield(Shield shield) {
			this.shield = shield;
		}

		
	/* Getters */
	
		public Weapon getWeapon() {
			return this.weapon;
		}
		
		public Shield getShield() {
			return this.shield;
		}
		
		public String getName() {
			return this.name;
		}
		
		public Integer getHealth() {
			return this.health;
		}
		
	/* Checkers */
	
		public Boolean isAlive() {
			return this.isAlive; 
		}
		
	/* Gameplay Methods */
	
		/*
			You Failed.
		*/
	
			public void killPlayer() {
				this.isAlive = false;
			}
		
		/* 
			Damage is dealt using this method
		*/
	
			public void dealDamage(Integer damageDealt) {
				this.health = health - damageDealt;
				
				if(this.health <= 0) {
					this.killPlayer();
				}
			}
		
		/*
			Stamina is boosted when you shrug off 100% of your damage
		*/
		
			public void boostStamina() {
				if(this.health < 150) {
					this.health += 5; 
				}
			}
		
		/* 
			Knock-back is dealt when an enemy defends 100% of the damage 
		*/
		
			public void knockBack() {
				this.health -= 5; 
			}
			
		/* 
			Attack is the standard attack logic 
		*/

			public Result attack(Player enemy) {
			
				Integer damageDealt = 0; 
				Shield enemyShield = enemy.getShield();
				
				if(enemyShield.getType() == this.weapon.getType()) {
					damageDealt = (this.weapon.getDamage() - enemyShield.getResistance());
				} else {
					damageDealt = this.weapon.getDamage();
				}
				
				if(damageDealt == 0) {
					enemy.boostStamina();
					this.knockBack();
				} else {
					enemy.dealDamage(damageDealt);
				}
				
				return new Result(this, enemy, damageDealt, this.weapon, enemy.getShield());
			}
}