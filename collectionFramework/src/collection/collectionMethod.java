package collection;

import java.util.ArrayList;

public class collectionMethod {

	public static void main(String[] args) {
			
		/*	ArrayList al=new ArrayList();
			al.add(100);
			al.add("Anmol");
			al.add('A');
			
			System.out.println(al);
			
			ArrayList al2=new ArrayList();
			al2.add(200);
			al2.add("Rashi");
			al2.add('R');
			System.out.println(al2);
			
			al.addAll(al2);
			System.out.println(al);
			
			System.out.println(al.add("Akshat"));   // write true gives boolean value
			System.out.println(al);
			
			System.out.println(al.contains(100));   // contains 
			
			System.out.println(al.isEmpty());  //empty  rue or false
			
			System.out.println(al.size());  //size of an array  ex-  7 or 3
		
			al.remove(0);                     // remove the object using index position ex 0,1,2 
			System.out.println(al);
		*/
			
			ArrayList al3=new ArrayList();
			al3.add("A");
			al3.add("B");
			al3.add("C");
			
			ArrayList al4=new ArrayList();
			al4.add("C");
			al4.add("D");
			al4.add("E");
			
			al3.removeAll(al4);              // remove same element from first object 
			System.out.println(al3);
			System.out.println(al4);
			
			al4.clear();                   //clear all element
			System.out.println(al4);
			
	}

}
