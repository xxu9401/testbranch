package net.antra.design.singleton;

public class SingletonD {
	private static volatile SingletonD instance= null;
	private SingletonD(){}
	public static SingletonD getInstance(){
		if(instance == null){ // first check
			synchronized(SingletonD.class){  // String.class
				if(instance == null){
					instance = new SingletonD();
				}
			}
		}
		return instance;
	}
}

// thread safe
// double check lock
// better than C
