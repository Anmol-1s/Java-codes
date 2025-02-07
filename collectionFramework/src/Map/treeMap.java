package Map;

import java.util.TreeMap;
import java.util.Comparator;
import java.util.Set;

public class treeMap {

	public static void main(String[] args) {
		
		TreeMap t=new TreeMap();
		
		t.put(101,"Anmol");
		t.put(102, "Rashi");
		t.put(104, "Anmol");
		t.put(103, null);
		
		System.out.println(t);
		
		TreeMap t1=new TreeMap(t);
		
		t1.put(109, "Sanskar");
		t1.put(106, "Dev");
		
		//t.putAll(t1);
		//System.out.println(t);
		System.out.println(t1);
		
		System.out.println(t1.containsKey(104));
		System.out.println(t1.get(104));
		
		System.out.println(t1.containsValue("Dev"));
		System.out.println(t1.get(106));
		
		t1.remove(109);
		System.out.println(t1);
		
		t1.clear();
		System.out.println(t1);
		
		Set s=t.entrySet();
		System.out.println(s);
		
		TreeMap t2=new TreeMap(Comparator.naturalOrder());
		
		t2.put(101,"Anmol");
		t2.put(102, "Rashi");
		t2.put(104, "Anmol");
		t2.put(106, null);
		
		System.out.println("102"+t2.ceilingKey(102));
		System.out.println(t2.ceilingKey(103));
		
		System.out.println(t2.ceilingEntry(102));
		System.out.println(t2.ceilingEntry(103));
		
		System.out.println(t2.firstEntry());
		System.out.println(t2.firstKey());
		
		System.out.println(t2.headMap(103));
		
		System.out.println("Key set-"+t2.keySet());
		
	/*	t2.pollFirstEntry();
		System.out.println(t2);
		t2.pollLastEntry();
		System.out.println(t2);
		
		t2.replace(104, "Rashi");
		System.out.println(t2);
	*/
		System.out.println(t2.subMap(102, 104));
		
		System.out.println(t2.higherKey(101));
		System.out.println(t2.lowerKey(104));

				
	}

}
