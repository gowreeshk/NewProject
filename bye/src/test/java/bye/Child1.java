package bye;

public class Child1 extends Parent1{

	
	
	public void m1() {
		
		System.out.println("This is child class method");
	}
	
	public static void main(String[] args) {
		
		Parent1 p = new Child1();
		
		p.m1();
		
		Parent1 p1 = new Parent1();
		
		p1.m1();
		
	}
	
}
