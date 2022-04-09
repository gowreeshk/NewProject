package bye;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandle2 {

	public static void main(String[] args) throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\browser drivers\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("hehehehe");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[1]")).clear();
		js.executeScript("document.getElementById('name').value='Gowreesh';");
		WebElement ele =driver.findElement(By.id("newWindowsBtn"));
//		js.executeScript("arguments[0].scrollIntoView()",ele);
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		

	}

}
