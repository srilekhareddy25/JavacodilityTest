package code;
//Write a java program to create three threads T1, T2 and T3 
//and ensure sequence T1,T2,T3 in java.

public class Q16 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread Thread1 = new Thread(new T1());
		Thread Thread2 = new Thread(new T2());
		Thread Thread3 = new Thread(new T3());
	
		Thread1.start(); 
		Thread1.join();
		Thread2.start();
		Thread2.join();
		Thread3.start();
		Thread3.join();
		
	}

}
 class T1 implements Runnable{
	 
	 public  synchronized void method1() { 
		 
		 System.out.println("T1");
	 
	 }
	public void run() {
		method1();
		
	}
	
	 
 }
 
class T2 implements Runnable{
	 
	 public synchronized void method2() { 
		 
		 System.out.println("T2");
		 System.out.println("T22");
	 }
	 
	public void run() {
		method2();
		
	}
	 
	 
 }

class T3 implements Runnable{
	 
	 public synchronized void method3() { 
		 
		 System.out.println("T3");
	 }
	 
	public void run() {
		method3();
		
	}
	 
	 
}