package org.formation.visitor;

public class Fruit implements ItemElement {

	private int prixKilos;
	private int poids;
	private String name;
	public Fruit(int prixKilos, int poids, String name) {
		super();
		this.prixKilos = prixKilos;
		this.poids = poids;
		this.name = name;
	}
	public int getPrixKilos() {
		return prixKilos;
	}
	public int getPoids() {
		return poids;
	}
	public String getName() {
		return name;
	}
	@Override
	public int accept(ShoppingCartVisitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}
	
	
}
