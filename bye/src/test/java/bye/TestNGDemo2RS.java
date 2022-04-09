package bye;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo2RS {
	
	@Test(groups = "login")
	public void method1() {
		Assert.assertFalse(true);
	System.out.println("Method1");	
	}
	@Test(dependsOnGroups = "home")
	public void Home() {
		
		System.out.println("Home");		
	}
	@Test
	public void method3() {

		System.out.println("Method3");
	}
	@Test(groups = "home")
	public void method4() {

		System.out.println("Method4");
	}
	@Test(groups = "login")
	public void method5() {

		System.out.println("Method5");	
	}
	@Test
	public void method6() {

		System.out.println("Method6");	
	}
	
	@Test(groups = "home")
	public void method7() {

		System.out.println("Method7");
	}
	@Test(groups = "home")
	public void method8() {

		System.out.println("home8");
	}
	@Test(groups = "home")
	public void method9() {

		System.out.println("home9");
	}
}
