package code;
//Write a java program to store 5 student information in a treeMapNote: 
//student object has student name and student reg no

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Q1 implements Comparable<Q1>{
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + regno;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Q1 other = (Q1) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (regno != other.regno)
			return false;
		return true;
	}

	int regno; 
    String name; 
	
	public Q1(int regno, String name) 
    { 
        this.regno = regno; 
        this.name = name; 
        
    } 
	
	public String toString() {
		return this.name + "-" + this.regno;
	}
	
	
	public int compareTo(Q1 o) {
		
		
		return this.regno-o.regno;
	}
	
	public static void main(String[] args) 
    { 
	//TreeMap<Q1, Integer> tm = new TreeMap<Q1, Integer>(); 
	
	HashMap<Q1, Integer> tm = new HashMap<Q1, Integer>(); 
	  
	        
	        tm.put(new Q1(11, "cc"), 1);
	        tm.put(new Q1(22, "aa"), 2);
	        tm.put(new Q1(33, "bb"), 3);
	        tm.put(new Q1(44, "dd"), 4);
	        tm.put(new Q1(55, "ee"), 5);
	        tm.put(new Q1(11, "cc"), 8);
	                      
	        for(Map.Entry m:tm.entrySet())  
	        {  
	            System.out.println(m.getKey().toString()+" "+m.getValue());      
	        }  
			
	       System.out.println(tm.get(new Q1(11,"cc"))); 
	    
	  
	    
	  
	       
	    
	
//	TreeMap<Integer, String> student 
//    = new TreeMap<Integer, String>();	
//student.put(666,"latha");
//student.put(555,"rita");
//student.put(333, "gita"); 
//student.put(222, "jon"); 
//student.put(111, "krish"); 
//System.out.println(student); 
		
		

}

	
}
