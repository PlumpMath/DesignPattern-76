package org.formation.templateMethod;

public class PizzaDeuxFromage extends PizzaTemplate {
	
	public PizzaDeuxFromage() {
		super();
	}

	@Override
	void ajouterFromage() {
		System.out.println("Je met deux formage sur la pizza");
	}

}
