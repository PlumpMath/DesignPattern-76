package org.formation.factoryMethod.model;

public abstract class AbstractCar {
	
	public abstract String getBrand();
	public abstract String getModel();
	public abstract int getPower();
	
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Marque : " + getBrand() + "\nModel : " + getModel() + "\nPower : " + getPower() + "\n";
	}
	
}
