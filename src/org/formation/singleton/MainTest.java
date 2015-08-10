package org.formation.singleton;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vendeur v1 = Vendeur.Instance();
		
		System.out.println(v1);
				
		Vendeur v2 = Vendeur.Instance();
		
		System.out.println(v2);
		
		SingletonWithHelper s1 = SingletonWithHelper.getInstance();		
		System.out.println(s1);
	
		SingletonWithHelper s2 = SingletonWithHelper.getInstance();		
		System.out.println(s2);
		
		EnumSingleton.INSTANCE.singletonMethod();
	}

}
