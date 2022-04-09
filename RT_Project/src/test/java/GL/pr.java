package GL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericLibrary.ReusableMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class pr extends ReusableMethods  {
	@Test
	public void jj() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
		
	}

}
