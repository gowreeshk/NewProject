package revision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_class {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement admin= driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b"));
		WebElement usermg=driver.findElement(By.xpath("//a[text()='User Management']"));
		WebElement user=driver.findElement(By.xpath("//a[text()='Users']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(admin).build().perform();
		Thread.sleep(1000);
		act.moveToElement(usermg).build().perform();
		Thread.sleep(1000);
		act.click(user).build().perform();
		
	}

}
