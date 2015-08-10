package org.formation.templateMethod;

public abstract class PizzaTemplate {

	public final void creerPizza(){
		preparerPate();
		ajouterSauce();
		ajouterFromage();
		cuire();
		System.out.println("La pizza est bonne !");
	}

	private void cuire() {
		System.out.println("La pizza cuit");
		
	}

	abstract void ajouterFromage();

	private void ajouterSauce() {
		System.out.println("Je met la sauce sur la pizza");
	}

	private void preparerPate() {
		System.out.println("Je prépare la pâte");
	}
	
	
}
