package org.formation.observerJava;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataStore dS1 = new DataStore();
		Screen screen = new Screen();
		
		dS1.addObserver(screen);
		dS1.setData("Premi�re valeur");
		dS1.setData("Deuxi�me valeur");
		
	}

}
