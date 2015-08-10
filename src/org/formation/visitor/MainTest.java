package org.formation.visitor;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemElement[] items = new ItemElement[] { new Book(20, "Les d�veloppeurs"), new Fruit(10,2,"Pomme")};
		
		int total = calculatePrice(items);
		
		System.out.println("Co�t total du panier : " + total);
	}

	private static int calculatePrice(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum =0;
		for( ItemElement item : items) {
			sum += item.accept(visitor);
		}
		return sum;
	}

}
