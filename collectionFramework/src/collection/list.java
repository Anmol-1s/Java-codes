package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class list {
	
	public static void main(String[] args) {
		
		List l=new ArrayList(); // refrence
		
		l.add(0,100);
		l.add(200);
		l.add(2,300);
		l.add(400);
		l.add(200);  //add multiple duplicate value
		l.add(null); 
		l.add(null);     //multiple null value can store
		
//		System.out.println(l);
		
	/*  Iterator itr=l.iterator(); 
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	*/	
		ListIterator litr=l.listIterator();
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
	}

}
