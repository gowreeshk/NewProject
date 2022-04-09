package bye;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataProvider1testng {
	
	@Test(enabled = false)
	public void check() {

		int[] num = new int[4];
		
		num[0]=1;
		num[1]=2;
		num[2]=3;
		num[3]=4;
		
		String[] names= new String[6];
		
		names[0]="ram";
		names[1]="abhi";
		names[2]="dhana";
		names[3]="gowri";
		names[4]="Navi";
		names[5]="Lakshmi";	
		names[6]="charan";
	
		char[] ch = new char[3];
		
		ch[0]='v';
		ch[1]='b';
		ch[2]='r';
		
		boolean[] con = new boolean[2];
		
		con[0]=true;
		con[1]=false;
		con[2]=false;
		System.out.println(con[2]);
		
		Object[] obj = new Object[4];

		obj[0]="Ram";
		obj[1]=1234;
		obj[2]=123.94f;
		obj[3]='c';
		obj[4]=true;
		
		
		Object[][] data= new Object[3][2];
		
		data[0][0]="Username1";
		data[0][1]="Password1";
		data[1][0]="Username2";
		data[1][1]="Password2";
		data[2][1]="Username2";
		data[2][0]="Password2";
	}
	
	
	@Test(dataProvider = "getData")
	public void login(String value1,String value2) throws Throwable {
		
		System.out.println(value1+"     "+value2);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(value1);
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(value2);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
//		WebElement ele=driver.findElement(By.xpath("//span[@id]"));
		WebElement ele1=driver.findElement(By.xpath("//a[@class='panelTrigger']"));
		
		if (ele1.isDisplayed()) {
			System.out.println("Welcome Paulneeraj");
			driver.close();
			
		}else {
			System.out.println("Invalid credentials");
			Thread.sleep(2000);
		}
		
	
		
	}
	
	@DataProvider
	public Object[] getData1() {
		
		Object[] data = new Object[2];
		data[0]="username";
		data[1]="Password";
		
		return data;
		
	}
	                            
	                            
	@DataProvider
	public Object[][] getData(){
		
		Object[][] data=new Object[2][2];
		data[0][0]="admin1";
		data[0][1]="password1";
		data[1][0]="Admin";
		data[1][1]="admin123";
	
		
		return data;
		} 
	@Test
	private void checking() {
		System.out.println();

	}

}
