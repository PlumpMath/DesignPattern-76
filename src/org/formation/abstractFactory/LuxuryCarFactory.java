package org.formation.abstractFactory;

import org.formation.factoryMethod.model.AbstractCar;
import org.formation.factoryMethod.model.LuxuryCar;

public class LuxuryCarFactory implements ICarFactory {

	private String brand;
	private String model;
	private int enginePower;
	
	public LuxuryCarFactory(String brand, String model, int enginePower) {
		super();
		this.brand = brand;
		this.model = model;
		this.enginePower = enginePower;
	}

	@Override
	public AbstractCar getCar() {
		// TODO Auto-generated method stub
		return new LuxuryCar(brand, model, enginePower);
	}

}
