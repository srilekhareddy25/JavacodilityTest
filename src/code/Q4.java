package code;

import java.util.TreeSet;

//Write a java program to store 5 unique elements in sorted order. 
//Error should exist if user tries to add duplicates.


public class Q4 {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();
		String s1[] = {"aa","cc","ee","bb","ss","aa"};
		
		for(int i = 0; i <s1.length; i++) {
			
			if (set.contains(s1[i]))
		System.out.println(s1[i]+" already exists duplicate elements cannot be entered");
			else 
				set.add(s1[i]); 
		      
		}
	   
		//System.out.println(set.toString()); 
		
//		set.add("aaa");
//		set.add("eee");
//		set.add("bbb");
//		set.add("ddd");
//		set.add("ccc");
//		set.add("aaa");
//		set.contains("aaa");
//		
		for(String str:set)  
	        System.out.println(str.toString());  
		

	}

}
