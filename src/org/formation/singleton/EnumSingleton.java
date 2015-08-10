package org.formation.singleton;

public enum EnumSingleton {

	INSTANCE;
	
	public void singletonMethod(){
		System.out.println("Je suis la seule instance " + INSTANCE);
	}
}
