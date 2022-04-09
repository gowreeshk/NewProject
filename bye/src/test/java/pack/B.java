package pack;

import myPackage.A;

public class B extends A{

//	A a1 ;
	public static void main(String[] args) {
		
		B b1= new B();
		
		b1.publicMethod();
		
		b1.protectedMethod();
		
//		a1.msg(); //Compile Time Error  
		
//		a1.message();
		
		
		
	}
	
	public void method11() {
//		
		B b2= new B();
		
		publicMethod(); // Here we are calling public method without Object.
		
		b2.protectedMethod(); // The protected access modifier is accessible within package and outside the package but through inheritance only.
		
		
	}
}
