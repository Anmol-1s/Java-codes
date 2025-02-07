package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {

	public static void main(String[] args) {
		
		ArrayList<Object> al=new ArrayList<>();  //default or empty constructor
		
		al.add(0,10);
		al.add(1,"Anmol");
		al.add(2,'A'); 
		al.add(3,30.6);
		al.add(4,40);
		al.add(40);
		al.add(null);
		al.add(null);

		System.out.println(al);
		
		ArrayList al1=new ArrayList();
		
		al1.add("Anmol");
		al1.add(40);
		al1.add('A');
		
		System.out.println(al1);
		
//		System.out.println(al.addAll(al1));  //true
		
	//	al.remove(3);
	//	al.remove("Anmol");
		al.removeAll(al1);
		System.out.println(al);
		
		al1.clear();
//		System.out.println(al1);
		
		System.out.println(al1.contains("Anmol"));
		
		System.out.println(al.size());
		
		al.set(1, 50);
		System.out.println("al="+al);
		
		System.out.println(al.indexOf(10));
		
		Iterator it=al.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
