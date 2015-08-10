package org.formation.factoryMethod;

import org.formation.abstractFactory.CarFactory;
import org.formation.abstractFactory.LuxuryCarFactory;
import org.formation.factoryMethod.model.AbstractCar;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractCar porsche = MethodeCarFactory.getCar(MethodeCarFactory.LUXURY, "Porsche", "911", 600);
		AbstractCar twingo = MethodeCarFactory.getCar(MethodeCarFactory.CHEAP, "Renault", "twingo", 55);
	
		System.out.println(porsche.toString());
		System.out.println(twingo.toString());
		
		AbstractCar porshe = CarFactory.getCar(new LuxuryCarFactory("porsche", "911", 300));
	
		System.out.println(porshe);
	}

}
