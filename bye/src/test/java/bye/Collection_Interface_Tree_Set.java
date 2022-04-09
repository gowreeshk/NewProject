package bye;

import java.util.TreeSet;

public class  Collection_Interface_Tree_Set {

	public static void main(String[] args) {
		TreeSet ts= new TreeSet();
		ts.add(54676);
		ts.add(84645637);
		ts.add(457);
		
		System.out.println(ts);
		
		boolean bl=ts.contains(54676);
		System.out.println(bl);
	}

}
