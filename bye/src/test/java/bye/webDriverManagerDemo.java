package bye;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webDriverManagerDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://github.com/login");
		WebElement usernametext= driver.findElement(By.id("login_field"));
		if(usernametext.isDisplayed()) {
			if(usernametext.isEnabled()) {
				usernametext.sendKeys("harish");
			}else {
				System.out.println("webelement is not enabled");
			}
			
		}else {
			System.out.println("element is not displayed");
		}
		String enteredText= usernametext.getAttribute("value");
		System.out.println(enteredText);

	}

}
