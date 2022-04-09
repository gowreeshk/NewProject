package bye;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bye2 {

	public static void main(String[] args) throws Throwable   {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91888\\Desktop\\drivers\\chrome95\\chromedriver.exe");
	
	 WebDriver driver=new ChromeDriver();
	 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.manage().deleteAllCookies();
	 driver.manage().window().maximize();
	 driver.get("https://whitehatsecuritycommunity.force.com/s/login/?ec=302&startURL=%2Fs%2F");
	 
	 Thread.sleep(5000);

	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hihihi");
	 
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("oyeoye");
	 driver.findElement(By.xpath("//button[@type='button']")).click();
	 driver.navigate().to("https://www.amazon.in/");
	 driver.navigate().back();
	 Thread.sleep(2000);
	 driver.navigate().forward();
	 
	 driver.quit();	 
	 

	}

}

