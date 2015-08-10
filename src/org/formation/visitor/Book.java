package org.formation.visitor;

public class Book implements ItemElement{
	private int price;
	private String titre;
	
	public Book(int price, String titre) {
		super();
		this.price = price;
		this.titre = titre;
	}
	
	public int getPrice() {
		return price;
	}
	public String getTitre() {
		return titre;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}
	
	

}
