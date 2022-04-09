package revision;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CharectersRepeated {

	public static void main(String[] args) {

		String st="hello";
		Map<Character, Integer> hm=new HashMap<Character, Integer>();
		for (int i = 0; i < st.length(); i++) {
			char c=st.charAt(i);
			if (hm.containsKey(c)) {
				Set<Character> s=hm.keySet();
				for (Character cha : s) {
					if (cha.equals(c)) {
						int value=hm.get(cha);
						value++;
						hm.put(cha, value);
						
					}
				}
			}else {
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
	}

}
