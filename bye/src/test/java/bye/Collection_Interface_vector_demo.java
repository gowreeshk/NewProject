package bye;

import java.util.Iterator;
import java.util.Vector;

public class Collection_Interface_vector_demo {
	public static void main(String[] args) {
		Vector<String> v= new Vector<String>();
		v.add("raja");
		v.add("ravi");
		v.add("mahesh");
		v.add("aneesh");
		Iterator itr= v.iterator();
		while (itr.hasNext()) {
			System.out.println( itr.next());
			
		}
		
		
		
	}

}
