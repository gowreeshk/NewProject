package revision;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		
		boolean bl=anagram("a decimal point", "im a dot in place");
		
		if (bl) {
			System.out.println("Given strings are anagrams");
		}else {
			System.out.println("Given strings are not anagrams");
		}
		
		String ss1="a decimal point";
		char[] ch1=ss1.toCharArray();
		Arrays.sort(ch1);
		System.out.println(ch1);
		
	}
	public static boolean anagram(String st1, String st2) {
		
		
		st1=st1.replaceAll(" ","");
		st2=st2.replaceAll(" ","");
	    char[] c1=st1.toCharArray();
	    char[] c2=st2.toCharArray();
	    
	    boolean flag;
	    if (c1.length!=c2.length) {
			flag=false;
		}
	     Arrays.sort(c1);
	     Arrays.sort(c2);
	     if (Arrays.equals(c1, c2)) {
			flag=true;
		}else {
			flag=false;
		}
		return flag;
	    
	}
}

