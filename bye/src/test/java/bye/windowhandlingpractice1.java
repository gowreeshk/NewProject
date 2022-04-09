package bye;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandlingpractice1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/");
		WebElement ele1=driver.findElement(By.xpath("//a[text()='Selenium Practice']"));
		WebElement ele2=driver.findElement(By.xpath("//a[text()='Window Handles']"));
		
		Actions act= new Actions(driver);
		act.moveToElement(ele1).build().perform();
		
		
		String parentwindow=driver.getWindowHandle();
		
		
		
		System.out.println(parentwindow);
		String parentTitle=driver.getTitle();
		System.out.println(parentTitle);
		
		ele2.click();
		WebElement ele3=driver.findElement(By.xpath("//button[contains(text(),'Open Multiple Windows')]"));
		ele3.click();
		Set<String> windowhandle=driver.getWindowHandles();
		System.out.println(windowhandle);
		
		driver.switchTo().window("CDwindow-F96519A6BC35034321B69B7E8E78F3EA");
		
		driver.manage().window().maximize();
		

			
		}
	
	private void gowri() {
//		for (String child : windowhandle) {
//		
//		if (!parentwindow.equals(child)) {
//			
//			
//			driver.switchTo().window(child);
//			
//			
//			String title=driver.getTitle();
//			System.out.println(title );
//			if (title.equals("Basic Controls - H Y R Tutorials")) {
//				driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("gowreesh k");
//					
//				}
//			
////			if (title.equals("XPath Practice - H Y R Tutorials")) {
////				WebElement ele4=driver.findElement(By.xpath("//select[@id='selectnav1']"));
////				Select sl= new Select(ele4);
////				sl.selectByValue("https://www.hyrtutorials.com/search/label/.NET");
////			
////				
//////				driver.close();
////				
////				}
//			
//		
//			}
			
//		}

	}
	}




