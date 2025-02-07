package collection;

import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		v.addElement(101);
		v.addElement('A');
		v.addElement("Anmol");
		v.addElement(21.9);
		
		System.out.println(v);
		
		System.out.println(v.firstElement());
		
		System.out.println(v.lastElement());
		
		//System.out.println(v.removeElement("Anmol"));
		
		System.out.println(v);
		
		//v.removeElementAt(3);
		//System.out.println(v);
		
		//v.removeAllElements();
		//System.out.println(v);
		
		System.out.println(v.capacity());
		
		v.setElementAt('R',1);
		System.out.println(v);
	}

}
