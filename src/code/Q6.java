package code;
//Write a program to insert "tekarch" into vector then insert user inputed number(N) 
//of Z's from 3rd position.delete N charactors from 6th position from vector
//Example:if user input =5Then vector stores="tekZZZZZarch"Delete 5 character 
//from 6th position so final string="tekZZZh"

import java.util.Vector;

public class Q6 {

	public static void main(String[] args) {
		
		Vector<Character> vec = new Vector<Character>();
	      vec.add('t');
	      vec.add('e');
	      vec.add('k');
	      vec.add('a');
	      vec.add('r');
	      vec.add('c');
	      vec.add('h');

	      System.out.println("Added characters are :- "); 
	      
	      for (Character ch : vec) {         
	         System.out.print(ch);
	      }
	      System.out.println();
	      
          int i,j=6,n =5, k = 3;
          
	      for( i=0;i<n;i++) {
	    	  vec.add(k, 'Z');
	    	  k++;  	  
	      }
	      
        System.out.println("After insertion added characters are :- "); 
	      
	      for (Character ch : vec) {         
	         System.out.print(ch);
	      }
	      System.out.println();
	      
	      for( i=0;i<n-1;i++) {
	    	  vec.remove(j);
	    	  j++;  	  
	      }
	      
        System.out.println("After deletion characters are :- "); 
	      
	      for (Character ch : vec) {         
	         System.out.print(ch);
	      }
      
	      
	      }
	   }  
	
