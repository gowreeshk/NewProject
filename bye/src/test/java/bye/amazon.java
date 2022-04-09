package bye;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {
	
	
	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/s?k=MOBILES&crid=2L5AXJP1HXQ4C&sprefix=mobiles%2Caps%2C1089&ref=nb_sb_noss_1");
		List<WebElement>  str= driver.findElements(By.xpath("//span[text()]"));
		System.out.println(str);
		String s=driver.getWindowHandle();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.open()");
//		Set<String> ch=driver.getWindowHandles();
//		for (String st : ch) {
//			if (!st.equals(s)) {
//				driver.switchTo().window(s);
//				driver.get("https://stackoverflow.com/questions/17547473/how-to-open-a-new-tab-using-selenium-webdriver-in-java");
//			}
//		}
//		driver.get("https://stackoverflow.com/questions/17547473/how-to-open-a-new-tab-using-selenium-webdriver-in-java");
//
//		driver.findElement(By.xpath("//body")).sendKeys(Keys.CONTROL +"t");
		String n = Keys.chord(Keys.CONTROL,Keys.ENTER);
		driver.findElement(By.id("open-tab")).sendKeys(n);
	}

}
