package bye;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestNGDemoRS {
	
	@Test
	public void method1() {	
		System.out.println("Method1");	
		assertEquals("Ram", "Gowri");
	
	}
	@Test(priority = 4)
	public void method2() {
		System.out.println("Method2");
	}
	@Test(priority = 1)
	public void method3() {
		System.out.println("Method3");
	}
	@Test(priority = 2)
	public void method4() {
		System.out.println("Method4");
	}
	@Test (priority = 7)
	public void method5() {

		System.out.println("Method5");
		assertEquals("Ram", "Ram");
		
		
	}
	@Test(priority = 6)
	public void method6() {

		System.out.println("Method6");
	}
	
}
