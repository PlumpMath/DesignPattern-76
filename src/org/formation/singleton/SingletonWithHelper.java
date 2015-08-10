package org.formation.singleton;

public class SingletonWithHelper {

	private SingletonWithHelper(){}
	
	private static class SingletonHolder{
		private static final SingletonWithHelper INSTANCE = new SingletonWithHelper();
	}
	
	public static SingletonWithHelper getInstance(){
		return SingletonHolder.INSTANCE;
	}
	
	public void singletonMethode(){
		System.out.println("Je suis " + this);
	}
}
