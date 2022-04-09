package bye;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandling2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
        WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.findElement(By.xpath("(//input)[1]")).clear();
		
		driver.findElement(By.xpath("//input[@class='whTextBox']")).sendKeys("hehehehe");
		String handle=driver.getWindowHandle();
		System.out.println(handle);
		
	}

}
