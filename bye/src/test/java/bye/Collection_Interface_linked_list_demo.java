package bye;

import java.util.Iterator;
import java.util.LinkedList;

public class Collection_Interface_linked_list_demo {

	public static void main(String[] args) {
		LinkedList al= new LinkedList();
		al.add("raja");
		al.add("hari");
		al.add("mohan");
		al.add("ajay");
		Iterator itr=al.iterator();
		while (itr.hasNext()) {
			System.out.println( itr.next());
			
		}
	}

}
