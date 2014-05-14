/* 
	Player Class
	
	@author: Tanner Mckenney
	@email: tmckenney7@outlook.com
*/

package Client;

public class Player {

	private static final int INIT_HEALTH = 100;

	private String name; 
	private Weapon weapon;
	private Shield shield; 
	private Integer health;
	
	public Player(String name) {
		this.name = name; 
		this.health = INIT_HEALTH; 
	}
	
	/* Used during setup */
	
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon; 
	}
	
	public void setShield(Shield shield) {
		this.shield = shield;
	}
	
	public void setHealth(Integer health) {
		this.health = health;
	}
	
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
	
	/* Used in Attacking */
	
	public void attack(Player enemy) {

		enemy.defend();
		
	}
	
	/* Used in Defending */
	
	public void defend() {
	
	
	}

}