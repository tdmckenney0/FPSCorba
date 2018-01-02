/* 
	@author: Tanner Mckenney 
	@email: tmckenney7@outlook.com
*/

public class Result {

	public Player attacker;
	public Player defender;
	public Integer damageDealt;
	public Weapon weaponUsed; 
	public Shield shieldUsed;
	
	public Result(Player attacker, Player defender, Integer damageDealt, Weapon weaponUsed, Shield shieldUsed) {
		this.attacker = attacker;
		this.defender = defender;
		this.damageDealt = damageDealt;
		this.weaponUsed = weaponUsed; 
		this.shieldUsed = shieldUsed;
	}
	
	public String toString() {
		return attacker.getPlayerName() + " [" + attacker.getHealth() + "] (" + weaponUsed.getName() + ") ----> " + defender.getPlayerName() + " [" + defender.getHealth() + "] (" + shieldUsed.getName() + ") : Dealt " + damageDealt + " Damage.";
	}
}