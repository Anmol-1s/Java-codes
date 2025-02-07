package collection;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class set {

	public static void main(String[] args) {
		
		Set s=new HashSet();
		
		s.add(100);
		s.add(200);
		s.add(300);
		s.add(400);
		s.add(100);   //can not add duplicate value
		s.add(null);
		s.add(null);  //only one null value stored
		
		System.out.println(s);
		
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
