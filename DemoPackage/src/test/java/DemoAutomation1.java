import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomation1 {
	
	public static void main(String[] args) {
	
		try {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");

			driver.findElement(By.id("email")).sendKeys("gowreesh");		
			driver.findElement(By.name("pass")).sendKeys("password");
			
			driver.findElement(By.name("login")).click();

					
		} catch (Exception e) {
			System.out.println("Please set valid driver path");
		}
		
		
		
	
	}

}
