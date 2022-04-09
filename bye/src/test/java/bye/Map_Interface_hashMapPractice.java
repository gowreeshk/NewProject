package bye;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Map_Interface_hashMapPractice {

	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put(986, "hari");
		h.put(987, "Infosys");
		h.put(988, "Cognigent");
		h.put(989, "Capgemini");
		h.put(990, "TCS");
		h.put("village", "pothukunta");
		h.put("town", "dharmavaram");
		h.put("salary", 8564265.454f);
		System.out.println(h);
		h.remove(986, "hari");
		System.out.println(h);
		Object obj= h.get("town");
		System.out.println(obj);
		h.remove("village");
		obj= h.get("village");
		System.out.println(obj);
		
		h.put("village", "kunuthuru");
		obj=h.get("village");
		System.out.println(obj);
		System.out.println(h.containsKey("village"));
		
		System.out.println(h.containsValue("Capgemini"));
		
		System.out.println(h.isEmpty());
		
		System.out.println(h.size());
		
		Set s=h.keySet();
		System.out.println("Set of keys= "+ s);
		
		Collection c=h.values();
		System.out.println("collection of values= "+ c);
		
		System.out.println("values in map= "+h);
		 
		Set s1= h.entrySet();
		System.out.println("set of entries= "+s1);
		
		Iterator itr= s1.iterator();
		
		while (itr.hasNext()) {
			Map.Entry object = (Map.Entry) itr.next();
			System.out.println(object);
			
			if (object.getKey().equals("town")) {
				object.setValue(5487845);
				
			}
			
		}
		System.out.println(h);
		
		
		
		

	}

}
