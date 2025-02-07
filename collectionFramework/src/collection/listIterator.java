package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class listIterator {

	public static void main(String[] args) {
		
		List l=new ArrayList();
		
		l.add("Rashi");
		l.add(200);
		l.add('R');
		
	//	System.out.println(l);
		
	//  l.remove("Rashi");
		ListIterator li=l.listIterator();
		/*
		while(li.hasNext()) {
			System.out.println(li.next());
		}   
	*/	
		li.next();
		li.next();
		li.next();
		System.out.println("-------------------------");
		
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
//		li.add("Anmol");
		li.set(100);
		System.out.println(l);
	}

}
