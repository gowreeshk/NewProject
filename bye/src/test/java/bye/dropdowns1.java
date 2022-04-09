package bye;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdowns1 {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        WebElement courseelement= driver.findElement(By.id("course"));
        Select coursenamedropdown= new Select(courseelement);
        List<WebElement> coursenamedropdownoptions=coursenamedropdown.getOptions();
        for (WebElement option:coursenamedropdownoptions) {
        	System.out.println(option.getText());
        }
        coursenamedropdown.selectByValue("java");
        
        WebElement dropdown2=driver.findElement(By.id("ide"));
        Select h=new Select(dropdown2);
        h.selectByValue("ij");
        String selectedtext= h.getFirstSelectedOption().getText();
        System.out.println("selected dropdown text :"+selectedtext);
	}

}
