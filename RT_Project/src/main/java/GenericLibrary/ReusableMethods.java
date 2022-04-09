package GenericLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReusableMethods {
	public boolean ElementClick(WebDriver driver, String xpath) {
		try {
			driver.findElement(By.xpath(xpath)).click();
			return true;
			
		} catch (Exception e) {
			try {driver.findElement(By.xpath(xpath)).click();
			return true;
				
			} catch (Exception e2) {
				
			}
		}
		
		return false;
		
	}
	public boolean enterText(WebDriver driver, String xpath, String textValue) {
		try {
			driver.findElement(By.xpath(xpath)).sendKeys(textValue);
			return true;
			
		} catch (Exception e) {
			try {driver.findElement(By.xpath(xpath)).sendKeys(textValue);
			return true;
				
			} catch (Exception e2) {
				
			}
		}
		
		return false;
		
	}
//	public void enterText(WebDriver driver, String xpath, String textValue) {
//		driver.findElement(By.xpath(xpath)).sendKeys(textValue);
		

//	}
	

}
