import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=mobiles&crid=3H926RPFL4BCZ&sprefix=mobiles%2Caps%2C381&ref=nb_sb_ss_ts-doa-p_2_7");
		List<WebElement> wbl=driver.findElements(By.xpath("//span[@class=\"a-price-whole\"]"));
		

	}

}
