class Test {

    public static void main(String[] args) {
	
		Player player1 = new Player("MakAttack");
		Player player2 = new Player("BallerNova");
		
		Integer round = 1; 
		
		while(true) {
		
			System.out.println("Round " + round++); 
		
			player1.setShield(new Shield("Basic Shield", WeaponType.MELEE, 5, 2, 0, 0.90));
			player2.setShield(new Shield("Adv Shield", WeaponType.ENERGY, 10, 2, 0, 0.90));
			
			player1.setWeapon(new Weapon("Ion Cannon", WeaponType.ENERGY, 20, 3, 0, 0.90));
			player2.setWeapon(new Weapon("Big Ol' Sword", WeaponType.MELEE, 10, 3, 0, 0.90));
			
			System.out.println(player2.attack(player1));
			
			if(!player1.isAlive()) {
				System.out.println(player2.getName() + " Killed " + player1.getName() + "!");
				System.out.println(" -- Game Over -- ");
				break; 
			}
			
			System.out.println(player1.attack(player2));
			
			if(!player2.isAlive()) {
				System.out.println(player1.getName() + " Killed " + player2.getName() + "!");
				System.out.println(" -- Game Over -- ");
				break; 
			}
			
			System.out.println(); 
			
		}
		
    }
}