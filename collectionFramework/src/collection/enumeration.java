package collection;

import java.util.Vector;
import java.util.Enumeration;

public class enumeration {

	public static void main(String[] args) {
		
		Vector v=new Vector();
	
		v.add(100);
		v.add("Anmol");
		v.add('A');
		v.add(21.5);
		
		System.out.println(v);
		
		Enumeration e=v.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
