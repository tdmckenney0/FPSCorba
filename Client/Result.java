/* 
	@author: Tanner Mckenney 
	@email: tmckenney7@outlook.com
*/

package Client;

public class Result {

	public Player attacker;
	public Player defender;
	public Integer damageDealt;
	public Weapon weaponUsed; 
	public Shield shieldUsed;
	
	public String toString() {
		return attacker.getName() + " [" + attacker.getHealth() + "] (" + weaponUsed.getName() + " Level " + weaponUsed.getLevel() + ") ----> " + defender.getName() + " [" + defender.getHealth() + "] (" + shieldUsed.getName() + " Shield Level " + shieldUsed.getLevel() + ") : Dealt " + damageDealt + " Damage.";
	}
}