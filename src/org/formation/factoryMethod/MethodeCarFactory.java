package org.formation.factoryMethod;

import org.formation.factoryMethod.model.AbstractCar;
import org.formation.factoryMethod.model.CheapCar;
import org.formation.factoryMethod.model.LuxuryCar;

public class MethodeCarFactory {

	public static final int LUXURY = 0;
	public static final int CHEAP = 1;
	
	private MethodeCarFactory(){}
	
	public static AbstractCar getCar(int type, String brand, String model, int power){
		switch (type){
			case LUXURY:
				return new LuxuryCar(brand, model, power);
			case CHEAP:
				return new CheapCar(brand, model, power);
			default:
				return null;
		}
	}
	
}
