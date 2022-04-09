package bye;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TentNGDemo4 {
	
	
	
	@BeforeSuite
	public void DemoTestsuiteB() {
		
		System.out.println("Befor Suite");
	}
	@BeforeTest
	public void DemoTestB() {
		
		System.out.println("Befor Test");
	}
	
	
	@BeforeClass
	public void DemoClassB() {
		
		System.out.println("Before class");
	}
	@BeforeMethod
	public void DemoTest() {
		
		System.out.println("Before Method");
	}
	@Test
	public void DemoTest1() {
		
		System.out.println("Test method1");
	}
	@Test
	public void DemoTest2() {
		
		System.out.println("Test method2");
	}
	@AfterMethod
	public void DemoMethodA() {
		
		System.out.println("After Method");
	}
	@AfterClass
	public void DemoClassA() {
		
		System.out.println("After class");
	}
	@AfterTest
	public void DemoTestA() {
			
			System.out.println("After Test");
		}
	@AfterSuite
	public void DemoTestsuiteA() {
		
		System.out.println("After Suite");
	}

}
