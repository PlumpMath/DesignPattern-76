package org.formation.templateMethod;

public class PizzaUnFromage extends PizzaTemplate {
	
	public PizzaUnFromage() {
		super();
	}

	@Override
	void ajouterFromage() {
		System.out.println("Je met un formage sur la pizza");
	}

}
