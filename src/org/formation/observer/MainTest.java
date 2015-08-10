package org.formation.observer;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteSubject subject = new ConcreteSubject();
		Observer obs1 = new ConcreteObserver();
		Observer obs2 = new ConcreteObserver();
		Observer obs3 = new ConcreteObserver();
		Observer vue = new ConcreteObserver2();
		
		subject.register(obs1);
		subject.register(obs2);
		subject.setValue(24);
		subject.register(obs3);
		subject.register(vue);
		
		subject.setValue(24);
		
	}

}
