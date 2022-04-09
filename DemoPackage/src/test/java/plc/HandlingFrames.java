package plc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		driver.findElement(By.id("name")).sendKeys("Ramsunkara");
		
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
	
		WebElement webel = driver.findElement(By.id("selectnav1"));

		Select slc = new Select(webel);
		
		Thread.sleep(3000);

		
		slc.selectByIndex(1); // refreshed 
		
		Thread.sleep(3000);

//		slc.selectByVisibleText("YouTube Courses");
		
//		slc.selectByValue("https://www.hyrtutorials.com/search/label/Selenium");
		
	//	slc.selectByVisibleText("-- Selenium"); //Here we will get stale elemnt Exception
		//why because page getting refreshed after selecting value from the drop down
		//and We are using the same Select class object for selecting values
		//from dropdown . Here webelement getting stale . Stale means old .
		
		WebElement webel1 = driver.findElement(By.id("selectnav1"));

		Select slc1 = new Select(webel1);	
		
		slc1.selectByValue("https://www.hyrtutorials.com/search/label/AutomationTesting");
		
		Thread.sleep(3000);

		
//		driver.close();
	}

}
