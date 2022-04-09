package revision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation_on_orange_HRM {
	
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("document.getElementById('txtPassword').value='admin123'");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
		driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("gowreesh");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("kunda");
		WebElement empidEl= driver .findElement(By.xpath("//input[@id='employeeId']"));
		String empId=empidEl.getAttribute("value");
		System.out.println(empId);
		driver .findElement(By.xpath("//input[@id='chkLogin']")).click();
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("gowreeshKunda");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("A1b2C3d4");
		driver.findElement(By.xpath("//input[@id='re_password']")).sendKeys("A1b2C3d4");
		WebElement enableEle=driver.findElement(By.xpath("//select[@id='status']"));
		Select sl=new Select(enableEle);
		sl.selectByVisibleText("Enabled");
		driver.findElement(By.xpath("//input[@id='btnSave']"));
		

		Thread.sleep(5000);
		driver.quit();
	}

}
