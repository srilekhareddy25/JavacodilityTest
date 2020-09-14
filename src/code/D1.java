package code;

public class D1 implements Runnable{
	
	 public void method1() { 
			synchronized (String.class) { 
				
			System.out.println("Aquired lock on String.class object"); 
			synchronized (Integer.class) { 
			System.out.println("Aquired lock on Integer.class object"+ this.getClass().getName()); 
			}
			}
			}

	
	public void run() {
		method1();		
	} 

}
