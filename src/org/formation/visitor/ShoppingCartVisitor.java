package org.formation.visitor;

public interface ShoppingCartVisitor {

	int visit (Book book);
	int visit (Fruit fruit);
}
