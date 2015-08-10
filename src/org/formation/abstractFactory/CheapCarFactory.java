package org.formation.abstractFactory;

import org.formation.factoryMethod.model.AbstractCar;
import org.formation.factoryMethod.model.CheapCar;

public class CheapCarFactory implements ICarFactory {

	private String brand;
	private String model;
	private int enginePower;
	
	
	
	public CheapCarFactory(String brand, String model, int enginePower) {
		super();
		this.brand = brand;
		this.model = model;
		this.enginePower = enginePower/2;
	}



	@Override
	public AbstractCar getCar() {
		// TODO Auto-generated method stub
		return new CheapCar(brand, model, enginePower);
	}

}
