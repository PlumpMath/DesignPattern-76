package org.formation.observer;

public class ConcreteObserver implements Observer {

	private static int id = 0;
	
	public ConcreteObserver() {
		id++;
	}
	
	@Override
	public void update(int v) {
		// TODO Auto-generated method stub
		System.out.println("Observer " + id + " reçoit une nouvelle valeur : " + v);
	}

}
