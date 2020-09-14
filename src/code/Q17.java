package code;
//Implement ticket reservation application using multithreading 
//where it has available seats information. Create 4 threads to access this data 
//to book tickets and ensure data consistency Ex available seats=10 
//T1 requires 6 seats T2 requires 3 seats T2 requires 4 seats If available 
//seats < seats required proper error message should get printed

import java.util.HashMap;
import java.util.Map;

public class Q17 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread Thread1 = new Thread(new TT1());
		Thread Thread2 = new Thread(new TT2());
		Thread Thread3 = new Thread(new TT3());
	
		Thread1.start(); 
		Thread1.join();
		Thread2.start();
		Thread2.join();
		Thread3.start();
		Thread3.join();
		
	}

}

class TT1 implements Runnable{
	 
	 public  synchronized void method1() { 
		 
		 int numberOfbookings = 6;
			
			Seat sea = Seat.getInstance();
			
			sea.getSeats();
			
			if (sea.getSeats().get("seats") != null && numberOfbookings < sea.getSeats().get("seats")) {
				sea.updateSeats("seats", sea.getSeats().get("seats") - numberOfbookings);
				
				System.out.println("seats reserved");
				System.out.println("remaing seats: "+sea.getSeats().get("seats"));
			} 
			else {
				System.out.println("seats are not available");
			}
	 
	 }
	public void run() {
		method1();
		
	}
	
	 
}

class TT2 implements Runnable{
	 
	 public synchronized void method2() { 
		 
		 int numberOfbookings = 3;
			
			Seat sea = Seat.getInstance();
			
			sea.getSeats();
			
			if (sea.getSeats().get("seats") != null && numberOfbookings < sea.getSeats().get("seats")) {
				sea.updateSeats("seats", sea.getSeats().get("seats") - numberOfbookings);
				
				System.out.println("seats reserved");
				System.out.println("remaing seats: "+sea.getSeats().get("seats"));
			} 
			else {
				System.out.println("seats are not available");
			}
	 }
	 
	public void run() {
		method2();
		
	}
	 
	 
}

class TT3 implements Runnable{
	 
	 public synchronized void method3() { 
		 
		 int numberOfbookings = 4;
			
			Seat sea = Seat.getInstance();
			
			sea.getSeats();
			
			if (sea.getSeats().get("seats") != null && numberOfbookings < sea.getSeats().get("seats")) {
				sea.updateSeats("seats", sea.getSeats().get("seats") - numberOfbookings);
				
				System.out.println("seats reserved");
				System.out.println("remaing seats: "+sea.getSeats().get("seats"));
			} 
			else {
				System.out.println("seats are not available");
			}
	 }
	 
	public void run() {
		method3();
		
	}
	 
	 
}

class Seat {
	private Map<String,Integer> SeatsAvail = new HashMap<>();
	private static Seat single_instance = null; 
	
	private Seat() {
		SeatsAvail.put("seats", 10);	
	}
	
	
	public static Seat getInstance() {
		if(single_instance == null)
			single_instance = new Seat();
		
		return single_instance;
	}
	
	public Map<String,Integer> getSeats() {
		
		return SeatsAvail;
	}
	
	public void addSeats(Map<String,Integer> updatedseatings) {
		SeatsAvail.putAll(updatedseatings);
	}
	
	public  synchronized void updateSeats(String seat, Integer count) {
		SeatsAvail.put(seat, count);
	}
	

}

