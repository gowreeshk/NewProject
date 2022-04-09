package plc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Frames2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		driver.findElement(By.id("name")).sendKeys("Ramsunkara");
		
		driver.switchTo().frame("frm3");
		
		driver.findElement(By.id("name")).sendKeys("THis is frame3");
		
		Thread.sleep(5000);
		
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		
		WebElement wb = driver.findElement(By.id("selectnav1"));
		
		Select sl = new Select(wb);
		
		sl.selectByIndex(7);
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.id("name")).clear();
		
		driver.findElement(By.id("name")).sendKeys("Again frame 3");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("name")).sendKeys("Home page");
		
		Thread.sleep(2000);
		
	}

}
