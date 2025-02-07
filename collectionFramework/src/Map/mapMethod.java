package Map;

import java.util.Map;
import java.util.HashMap;
public class mapMethod {

	public static void main(String[] args) {
		
		Map m=new HashMap();
		
		m.put(101, "Anmol");
		m.put(102, "Sanskar");
		m.put(103, "Dev");
		m.put(104, "Akshat");
		
		//m.clear();
		
		System.out.println(m);
		
		System.out.println(m.containsKey(101));
		
		System.out.println(m.containsValue("Dev"));
		
		System.out.println(m.containsValue("Rashi"));
		
		System.out.println(m.get(104));
		
		
		Map m1=new HashMap(m);
		
		m1.put(105, "Rashi");
		m1.put(106, "Goransh");
		m1.put(107, "Amar");
		m1.put(108, "Vaishnavi");
		m1.put(null, null);
		m1.put(109, "null");
		m1.put(null, "A");

		
		//m.putAll(m1);
		System.out.println(m1);
		
		m1.remove(108);
		
		m1.replace(106, "Vashnavi");
		
		System.out.println(m1);
		
		System.out.println(m1.size());
	}

}
