package revision;

import java.util.Arrays;

public class rams {

	public static void main(String[] args) {
		
		boolean bl= anagram("a decimal point ","im a dot in place");
		
		if (bl) {
			System.out.println("Both are anagrams");
		} else {
			System.out.println("Both are not anagrams");			
		}
		
	}

	public static boolean anagram(String st1,String st2) {
		String ss="";
		
		String s1=st1.trim();
		String s2=st2.trim();
		s1=s1.replaceAll(" ",ss);
		s2=s2.replaceAll(" ",ss);
		char[] ch1 = s1.toCharArray();
		
		char[] ch2 = s2.toCharArray();
		
		boolean flag ;
		
		if (ch1.length!=ch2.length) {
			flag = false;
		}
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if (Arrays.equals(ch1, ch2)) {
			flag = true;
		}else {
			flag=false;
		}
		
		return flag;
		
	}
	
}
