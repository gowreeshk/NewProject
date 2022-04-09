package bye;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascriptexecuterPRACTICE {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
//		js.executeScript("document.getElementById('email').value='hihiihihi';");
		
//		js.executeScript("document.getElementByName('email').value='hhhhh';");
		
		WebElement webEle = driver.findElement(By.id("email"));
		
		WebElement webPwd = driver.findElement(By.xpath("//input[@id='pass']"));
		
		js.executeScript("arguments[0].value='ram';", webEle);
		
		js.executeScript("arguments[0].value='ram';", webPwd);
		
		
	}

}
