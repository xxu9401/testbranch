package net.antra.design.singleton;

public class SingletonB {
	private static SingletonB instance = null;

	private SingletonB(){
	}
	
	public static SingletonB getInstance(){
			if(instance == null){
				instance = new SingletonB();
			}
		return instance;
	}
	
}
// second way 
// not thread safe
// may each thread will create new object
