package code;
//What is the cause of deadlock in java multithreading. 
//Write a program to create deadlock between two threads

public class Q18 {
	
public static void main(String[] args) {
	
	Thread Thread1 = new Thread(new D1());
	Thread Thread2 = new Thread(new D2());
	
	Thread1.start(); 
	Thread2.start() ;
	
}

}