package org.formation.facade;

public class FacadeJeux {

	private Ordinateur monOrdi = new Ordinateur();
	private Logiciels monSteam = new Logiciels();
	private Jeu monJeu = new Jeu();

	public void jouerJeu() {
		System.out.println("On souhaite jouer");
		monOrdi.allumer();
		monOrdi.connection();
		monSteam.lancementSteam();
		monSteam.lancementJeu();
		monJeu.menu();
		monJeu.jouer();
	}
	
	public void arretJeu() {
		System.out.println("On ne veut plus jouer");
		monJeu.quitter();
		monSteam.quitterSteam();
		monOrdi.deconnection();
		monOrdi.eteindre();
	}
}
