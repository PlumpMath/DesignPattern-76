package org.formation.templateMethod;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaUnFromage pz1 = new PizzaUnFromage();
		PizzaDeuxFromage pz2 = new PizzaDeuxFromage();
		
		System.out.println("Premi�re pizza : ");
		pz1.creerPizza();
		System.out.println("\nDeuxi�me pizza : ");
		pz2.creerPizza();
	}

}
