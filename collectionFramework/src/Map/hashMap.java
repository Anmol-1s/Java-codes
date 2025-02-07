package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class hashMap {

	public static void main(String[] args) {
		
		HashMap h=new HashMap();
		
		h.put(101, 'A');
		h.put(102, 'B');
		h.put(103, 'C');
		h.put(104, 'D');
		h.put(105, 'B');
		
		System.out.println(h);
		
		HashMap h1=new HashMap(h);
		
		h1.put(106, 'f');
		h1.put(107, 'g');
		
		//h.putAll(h1);
		//System.out.println(h);
		
		System.out.println(h1);
		
		System.out.println(h1.containsKey(105));
		System.out.println(h1.containsValue('f'));
		System.out.println(h1.get(102));
		
		//h1.remove(105);
		//System.out.println(h1);
		
		h1.replace(105, 'E');
		System.out.println(h1);
		
		//h1.clear();
		//System.out.println(h1);
		
		Set s=h1.entrySet();
		//System.out.println(s);
		
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			//System.out.println(itr.next());
			
			Map.Entry entry=(Map.Entry) itr.next();
			System.out.println(entry.getKey()+"-"+entry.getValue());
			
		}
		
	}

}
