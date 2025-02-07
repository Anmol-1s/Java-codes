package Map;

import java.util.Hashtable;

public class hashTable {

	public static void main(String[] args) {
		
		Hashtable h=new Hashtable();
		
		h.put(106, "Deepak");
		h.put(102, "Anmol");
		h.put(108, "Rashi");
		h.put(116, "Manal");
		h.put(126, "Goransh");
		
		System.out.println(h);
		
		Hashtable h1=new Hashtable();
		
		h1.put(103, "Deepika");
		h1.put(106, "Anu");
		h1.put(107, "Roshni");
		h1.put(119, "Manav");
		h1.put(127, "Aman");
		
		//System.out.println(h1);
		
		h.putAll(h1);
		System.out.println(h);
		
		//System.out.println(h.hashCode());
	}

}
