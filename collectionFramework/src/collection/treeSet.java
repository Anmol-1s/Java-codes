package collection;

import java.util.TreeSet;

public class treeSet {

	public static void main(String[] args) {
		
		TreeSet <Integer>t=new TreeSet<>();
		
		t.add(12);
		t.add(34);
		t.add(6);
		t.add(4);
		t.add(21);             
		
		//System.out.println(t);
		
	/*	t.add("Anmol");
		t.add("Rashi");
		t.add("Sanskar");
		t.add("Dev");
		t.add("Anurag");
		
		t.remove("Rashi");
		
		t.clear();
		*/
		System.out.println(t.first());
		System.out.println(t.last());
		System.out.println(t.subSet(6, 33));
		
		
		System.out.println(t);
	}

}
