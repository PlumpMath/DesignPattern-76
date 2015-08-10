package org.formation.factoryMethod.model;

public class CheapCar extends AbstractCar {

	private String brand;
	private String model;
	private int power;

	public CheapCar ( String brand, String model, int power){
		super();
		this.brand = brand;
		this.model = model;
		this.power = power;
	}
	
	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return brand;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return model;
	}

	@Override
	public int getPower() {
		// TODO Auto-generated method stub
		return power;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setPower(int power) {
		this.power = power;
	}

}
