package revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClick {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement ele1=driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement ele2=driver.findElement(By.xpath("//span[text()='Copy']"));
		
		Actions act=new Actions(driver);
		act.contextClick(ele1).build().perform();
		act.contextClick(ele2).build().perform();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		 
		Thread.sleep(3000);
		driver.quit();
	}

}
