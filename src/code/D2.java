package code;

public class D2 implements Runnable{

	public void method2() { 
		synchronized (Integer.class) {
			
		System.out.println("Aquired lock on Integer.class object"); 
		synchronized (String.class) { 
			System.out.println("Aquired lock on String.class object"); 
			}
		} 
		}

	
	public void run() {
		method2() ;
		
	}
	
}
