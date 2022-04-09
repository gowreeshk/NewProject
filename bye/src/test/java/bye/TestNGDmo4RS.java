package bye;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestNGDmo4RS {
	
	// browser=chrome
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void launchBrowser(String browser) throws Throwable {


	if (browser.equalsIgnoreCase("Chrome")) {

		WebDriverManager.chromedriver().setup();	
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/");
		WebElement ele1= driver.findElement(By.xpath("(//li[@class='parent'] /a)[4]"));
		Actions act= new Actions(driver);
		act.moveToElement(ele1).build().perform();
		Thread.sleep(3000);
		driver.quit();

		
		
	} if (browser.equalsIgnoreCase("ff")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/");
		WebElement ele1= driver.findElement(By.xpath("(//li[@class='parent'] /a)[4]"));
		Actions act= new Actions(driver);
		act.moveToElement(ele1).build().perform();
		Thread.sleep(3000);
		driver.quit();
		}
//	else {
//		System.out.println("Plesae define available browser");
//	}	
		
	}

}
