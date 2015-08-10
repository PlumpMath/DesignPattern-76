package org.formation.builder;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ComplexeObject complexObject = new ComplexeObject.ComplexObjectBuilder("Objet1", "codeName1")
		.setAuto(true)
		.setBig(true)
		.build();
		
		System.out.println(complexObject);
	}

}
