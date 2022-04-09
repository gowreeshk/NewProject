package revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderMouseOperations {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		
		driver.switchTo().frame(0);
		WebElement slider=driver.findElement(By.xpath("//div[@id='slider']/span"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(slider, 50, 0).build().perform();
		
	}

}
