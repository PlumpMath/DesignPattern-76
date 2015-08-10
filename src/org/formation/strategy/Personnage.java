package org.formation.strategy;

public class Personnage {

	private LancerAttaqueStrategy strategy;
	
	public Personnage(LancerAttaqueStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void changeStrategy (LancerAttaqueStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void attaque() {
		strategy.attaquer();
	}
	
}
