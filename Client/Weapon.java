/* 
	@author: Tanner Mckenney	
	@email: tmckenney7@outlook.com
	
	Weapon class for FPS CORBA
	
*/

public class Weapon {

	private String name; 			/* name of the weapon */
	private WeaponType type; 		/* WeaponType determine */
	private Integer baseDamage;		/* base Damage of the weapon */
	private Integer maxLevel; 		/* Ceiling the level can be set at. */
	private Integer level;			/* Current level of the weapon; cannot be greater than maxLevel; randomly generated */
	private Integer splashDamage;	/* Damage afflicted randomly to other players */
	private Double rarity; 			/* Percent chance a weapon will appear in the pool */
	

	public Weapon(String name, WeaponType type, Integer baseDamage, Integer maxLevel, Integer splashDamage, Double rarity) {
	
		
	}
}