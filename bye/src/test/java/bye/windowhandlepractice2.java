package bye;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandlepractice2 {

	private static final JavascriptExecutor WebElement = null;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.hyrtutorials.com/");
		WebElement ele1=driver.findElement(By.xpath("//a[text()='Selenium Practice']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele1).build().perform();
		String parent= driver.getWindowHandle();
		
		
		driver.findElement(By.xpath("//a[text()='Window Handles']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Open Multiple Windows')]")).click();
		Set<String> windowhHandles=driver.getWindowHandles();
		for (String child : windowhHandles) {
			if (!parent.equals(child)) {
				driver.switchTo().window(child);
				String title=driver.getTitle();
				System.out.println(title);
				
				if (title.equals("XPath Practice - H Y R Tutorials")) {
 					
					
					
					Select sl=new Select(ele1);
				}
				
			}
			
		}
		
		
         
	}

}
