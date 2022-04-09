package bye;


import java.util.ArrayList;
import java.util.Collections;

import org.testng.annotations.Test;

public class Collection_Interface_Array_List {

	@Test
	public  void m1() {
		ArrayList al= new ArrayList();
		
		al.add("bus");
		al.add("train");
		al.add("plane");
		al.add("cycle");
		al.add("scooter");
		al.add("car");
		System.out.println(al);
		Object ob=al.get(5);    //Storing an element in an object by using index.
		System.out.println(ob);
		
		al.add(4, "helicopter");
		System.out.println(al);
		al.set(3, "JEEP");      //Overriding an element by using index and value.
		System.out.println(al);
		al.remove(4);         //Removing an element from an array using index.
		System.out.println(al);
		int n=al.size();      //Getting size of an array.
		System.out.println(n);
		//   Print all elements present in an array list using for loop. 
		for (int i = 0; i <al.size(); i++) {
			int sz=al.size();
			System.out.println(al.get(i));
			
		}
		Collections.sort(al);     //This method is used to sort an array list.   
		System.out.println(al);
		al.clear();
		ArrayList<Integer> al_number=new ArrayList<Integer>();// Integer Array List
		al_number.add(65);
		al_number.add(256);
		al_number.add(5879);
		//To prit all elements present in the array list using for_each loop
		for (Integer i : al_number) {
			System.out.println(i);
			
		}
		
	}

}
