package org.formation.builder;

public class ComplexeObject {

	private String name;
	private String codeName;
	private boolean isBig;
	private boolean isAuto;
	private int number;
	public String getName() {
		return name;
	}
	public String getCodeName() {
		return codeName;
	}
	public boolean isBig() {
		return isBig;
	}
	public boolean isAuto() {
		return isAuto;
	}
	public int getNumber() {
		return number;
	}
	
	private ComplexeObject(ComplexObjectBuilder complexObjectBuilder) {
		this.name = complexObjectBuilder.name;
		this.codeName = complexObjectBuilder.codeName;
		this.isAuto = complexObjectBuilder.isAuto;
		this.isBig = complexObjectBuilder.isBig;
		this.number = complexObjectBuilder.number;
	}
	
	public static class ComplexObjectBuilder {
		private String name;
		private String codeName;
		private boolean isBig;
		private boolean isAuto;
		private int number;
		
		public ComplexObjectBuilder(String name, String codeName){
			this.name = name;
			this.codeName = codeName;
		}
		
		public ComplexObjectBuilder setBig(boolean isBig) {
			this.isBig = isBig;
			return this;
		}
		public ComplexObjectBuilder setAuto(boolean isAuto) {
			this.isAuto = isAuto;
			return this;
		}
		public ComplexObjectBuilder setNumber(int number) {
			this.number = number;
			return this;
		}
		public ComplexeObject build() {
			return new ComplexeObject(this);
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "les différents paramètres : " + name + " " + codeName + " " + isBig + " " + isAuto + " " + number;
	}
}
