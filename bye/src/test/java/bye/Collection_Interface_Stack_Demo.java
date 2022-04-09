package bye;

import java.util.Iterator;
import java.util.Stack;

public class Collection_Interface_Stack_Demo {
	public static void main(String[] args) {
	Stack<String>  stack= new Stack<String>()		;
	stack.push("aneesh");
	stack.push("mahesh");
	stack.push("ramesh");
	stack.push("hareesh");
	stack.push("suresh");
	stack.push("rajesh");
	stack.pop();
	stack.pop();
	Iterator<String> itr= stack.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
	}
}
