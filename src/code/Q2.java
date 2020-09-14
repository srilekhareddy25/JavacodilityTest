package code;
//Write a java program to store 5 student information and award the students with 1st rank, 
//2nd rank and 3rd rank according to marks obtained where each student has student name, 
//student marks and student reg no information

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q2 implements Comparable<Q2>  {
		
		String Sname;
		int Smarks;
		int regno;
		
		Q2(String Sname,int Smarks,int regno){
			
			this.Sname = Sname;
			this. Smarks = Smarks;
			this.regno = regno;
			
		}

		public int compareTo(Q2 o) {
			
		return o.Smarks-this.Smarks;	
		}

	public static void main(String[] args) {
		
		List<Q2> cl = new ArrayList<>();
		
		cl.add(new Q2("ad",100,11));
		cl.add(new Q2("aj",120,44));
		cl.add(new Q2("al",130,55));
		cl.add(new Q2("am",90,88));
		cl.add(new Q2("ak",80,66));
		
		
		Collections.sort(cl);
		
		int k = 1;
		for(Q2 c: cl) {
			System.out.print(c.Sname+","+c.regno+","+c.Smarks+" ");
			System.out.println(k+" Rank");
			k++;
			
		}
		
	}

}
