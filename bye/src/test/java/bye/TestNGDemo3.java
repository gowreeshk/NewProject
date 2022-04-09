 package bye;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDemo3 {

	@Test
	public void method1() {
		System.out.println("method1");
	
	}
	@Test(threadPoolSize = 2 , invocationCount = 2)
	public void launch() {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement ele1=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		WebElement ele2=driver.findElement(By.xpath("//span[@class]"));
		boolean exp =ele2.isDisplayed();
		Assert.assertTrue(exp,"Element displayed");
		Assert.assertFalse(false);
		Assert.assertFalse(false,"Element not displayed");
		Actions act=new Actions(driver);
		act.doubleClick(ele1).perform();
		String al= driver.switchTo().alert().getText();
		System.out.println(al);
		driver.switchTo().alert().accept();
		
		driver.close();
		
	}
	
	
	
}
