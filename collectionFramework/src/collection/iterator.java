package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class iterator {

	public static void main(String[] args) {
		
		List l=new ArrayList();
		l.add(100);
		l.add("Anmol");
		l.add('A');
		l.add(21.5);
		
		System.out.println(l);
		
		Iterator itr=l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
		}
		System.out.println(l);
	}

}
