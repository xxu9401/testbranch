package net.antra.design.singleton;

public class SingletonC {
	private static SingletonC instance= null;
	private SingletonC(){}
	
	public synchronized static SingletonC getInstance(){
		if(instance == null){
			instance = new SingletonC();
		}
		return instance;
	}
}
// thread safe
// slower

// static synchronized == synchronized(A.class), in this class don't worry since only have one instance in singleton
