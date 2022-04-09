package bye;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class third_highest_nmbr {

	public static void main(String[] args) {
		int[] a= new int[] {12,34,47,45,10,35,90,45};
		Set<Integer> ts=new TreeSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			ts.add(a[i]);
			
			
		}
		ArrayList<Integer> al=new ArrayList<Integer>(ts);
		System.out.println(al.get(al.size()-3));
		System.out.println(al);
		
		

	}

}
