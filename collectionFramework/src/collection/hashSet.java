package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;
public class hashSet {

	public static void main(String[] args) {
		
		HashSet s=new HashSet();
		
		s.add("Anmol");
		s.add("Soni");
		s.add(21);
		s.add(null);
		s.add(null);
		
		System.out.println(s);
		
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ArrayList a=new ArrayList(s);
		a.add("Rashi");
		a.add('R');
		a.add(20);
		
		//s.addAll(a);
		//System.out.println(s);
		
		System.out.println(a);
		//a.clear();
		//System.out.println(a);
		
		System.out.println(a.contains(21));
		//a.contains(21);
		//System.out.println(a);
	}

}
