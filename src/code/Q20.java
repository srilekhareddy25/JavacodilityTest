package code;

import java.util.HashMap;
import java.util.Map;

//Write a java code for the following Store n number of drinktype with quantity. 
//If user wants a drink, user should enter drinktype. 
//If drink quantity is greater than one then request should be served and decrease 
//the corresponding quantity by one else no availability message should be printed on screen

public class Q20 {

	public static void main(String[] args) {
		
		int numberOfOrders = 2;
		
		InventoryS inv = InventoryS.getInstance();
		
		inv.getInventory();
		
		if (inv.getInventory().get("coke") != null && numberOfOrders < inv.getInventory().get("coke")) {
			inv.updateInventory("coke", inv.getInventory().get("coke") - numberOfOrders);
			
			System.out.println("drink served");
			System.out.println("remaing stock: "+inv.getInventory().get("coke"));
		} 
		else {
			System.out.println("out of stock");
		}

	}

}

//class Inventory {
//	static Map<String,Integer> drinkInventory;
//	
//	static {
//		drinkInventory.put("coke", 6);
//	}
//	
//}

class InventoryS {
	private Map<String,Integer> drinkInventory = new HashMap<>();
	private static InventoryS single_instance = null; 
	
	private InventoryS() {
		drinkInventory.put("coke", 20);
		drinkInventory.put("fanta", 30);
		drinkInventory.put("mango", 65);
		drinkInventory.put("orange", 39);
		drinkInventory.put("sprite", 50);
		
	}
	
	public static InventoryS getInstance() {
		if(single_instance == null)
			single_instance = new InventoryS();
		
		return single_instance;
	}
	
	public Map<String,Integer> getInventory() {
		
		return drinkInventory;
	}
	
	public void addInventory(Map<String,Integer> updatedInventory) {
		drinkInventory.putAll(updatedInventory);
	}
	
	public  synchronized void updateInventory(String name, Integer count) {
		drinkInventory.put(name, count);
	}
	

}

