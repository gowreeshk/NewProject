package bye;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles1 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91888\\eclipse-workspace\\bye\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("name")).sendKeys("hhhhhhhh");
		WebElement ele1= driver.findElement(By.xpath("//button[@id='newWindowBtn']"));
		WebElement ele2=driver.findElement(By.xpath(""));
		
		
		Thread.sleep(5000);
        driver.quit();

	}

}
