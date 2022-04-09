package bye;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Map_Interface_Linked_hash_Map_Practice {
	public static void main(String[] args) {
		HashMap m= new HashMap();
		
		m.put("village", "pothukunta");
		
		m.put("Mandal", "Dharmavaram");
		
		m.put("District", "Anantapur");
		
		m.put("State", "Andhrapradesh");
		
		m.put("Country", "India");
		
		m.put("Pincode", "515671");
		System.out.println("HashMap "+m);
		
		LinkedHashMap l= new LinkedHashMap();
		
		l.put("village", "pothukunta");
		
		l.put("Mandal", "Dharmavaram");
		
		l.put("District", "Anantapur");
		
		l.put("State", "Andhrapradesh");
		
		l.put("Country", "India");
		
		l.put("Pincode", "515671");
		
		System.out.println("LinkedHashmap= "+l);
	}
	
}
