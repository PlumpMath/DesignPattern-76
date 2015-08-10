package org.formation.observerJava;

import java.util.Observable;
import java.util.Observer;

public class Screen implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof DataStore) {
			System.out.println("Nouvelle valeur: " + ((DataStore) o).getData());
		}

	}

}
