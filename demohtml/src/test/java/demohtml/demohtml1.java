package demohtml;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demohtml1 {

	public static void main(String[] args) throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91888\\Desktop\\drivers\\browser drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/91888/Desktop/demo.html");
		WebElement ele=   driver.findElement(By.tagName("input"));
		ele.sendKeys("Dhanunjaya");
		driver.findElement(By.id("id")).sendKeys("Gowreesh");
		WebElement ele1=driver.findElement(By.tagName("select"));
		Select sl=new Select(ele1);
		sl.selectByIndex(1);
		Thread.sleep(2000);
		sl.selectByVisibleText("kadapa");
		Thread.sleep(2000);
		sl.selectByValue("ATP");
		Thread.sleep(2000);
//		driver.findElement(By.linkText("click here to navigate to google")).click();
//		driver.findElement(By.partialLinkText("click")).click();
		driver.findElement(By.name("name")).sendKeys("Raja");
		driver.close();
		
		

	}

}
