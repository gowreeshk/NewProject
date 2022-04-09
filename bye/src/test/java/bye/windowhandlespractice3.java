package bye;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandlespractice3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		 driver.manage().window().maximize();
		 driver.get("https://www.hyrtutorials.com/");
		 WebElement seleniumPractice=driver.findElement(By.xpath("//a[text()='Selenium Practice']"));
		 JavascriptExecutor js= (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView()", seleniumPractice);
		 
		 

	}

}
