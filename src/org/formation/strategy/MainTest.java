package org.formation.strategy;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personnage hero = new Personnage(new ArcStrategy());
		
		System.out.println("Notre héro est dans un champ de bataille : \n");
		
		System.out.println("Le héro trouve un arc");
		hero.attaque();
		
		hero.changeStrategy(new BatonStrategy());
		System.out.println("\n Il laisse tomber l'arc au profit d'un baton");
		hero.attaque();
		
		hero.changeStrategy(new MagieStrategy());
		System.out.println("\n Il apprend la magie");
		hero.attaque();
		
		
		
	}

}
