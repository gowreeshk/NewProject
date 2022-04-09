package revision;

import javax.swing.Action;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Anagramm {

	public static void main(String[] args) {

		String str= "a decimal point";
		String str2="im a dot in place";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		Actions act=new Actions(driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript(str2, args);
		
		
		
	}

}
