package org.formation.visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	@Override
	public int visit(Book book) {
		int prix = 0;
		prix = book.getPrice();
		System.out.println("Le livre " + book.getTitre() + " coûte " + prix);
		return prix;
	}

	@Override
	public int visit(Fruit fruit) {
		int prix = fruit.getPrixKilos() * fruit.getPoids();
		System.out.println(fruit.getName() + " coûte " + prix);
		return prix;
	}
	

}
