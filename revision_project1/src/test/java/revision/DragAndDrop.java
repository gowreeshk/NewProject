package revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement ele1=driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement ele11=driver.findElement(By.xpath("//div[@id='box103']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(ele1, ele11).build().perform();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
