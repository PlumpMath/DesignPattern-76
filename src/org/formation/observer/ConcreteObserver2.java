package org.formation.observer;

public class ConcreteObserver2 implements Observer {

	private static int id;
	
	public ConcreteObserver2() {
		id++;
	}
	
	@Override
	public void update(int v) {
		// TODO Auto-generated method stub
		System.out.println("Observer reçoit une nouvelle valeur : ");
		System.out.println("***** " + v + " *****");
	}

}
