package org.formation.abstractFactory;

import org.formation.factoryMethod.model.AbstractCar;

public class CarFactory {

	private CarFactory(){}
	
	public static AbstractCar getCar(ICarFactory factory){
		return factory.getCar();
	}
}
