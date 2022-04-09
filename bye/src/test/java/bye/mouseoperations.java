package bye;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseoperations {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement ele1=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		WebElement ele2=driver.findElement(By.xpath("//span[@class]"));
		Actions act=new Actions(driver);
		act.doubleClick(ele1).perform();
		String al= driver.switchTo().alert().getText();
		System.out.println(al);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		act.contextClick(ele2).build().perform();
		Thread.sleep(4000);
		driver.quit();
		
		
	}

}
