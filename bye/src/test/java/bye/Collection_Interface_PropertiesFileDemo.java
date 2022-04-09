package bye;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class  Collection_Interface_PropertiesFileDemo {

	public static void main(String[] args) throws Throwable {
		Properties p=new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\91888\\eclipse-workspace\\bye\\src\\test\\java\\bye\\demoFile");
		p.load(fis);
		String usd=p.getProperty("village");
		System.out.println(usd);
		p.setProperty("village", "ha");
		String usd1=p.getProperty("village");  
		System.out.println(usd1);
		FileOutputStream fos=new FileOutputStream("C:\\\\Users\\\\91888\\\\eclipse-workspace\\\\bye\\\\src\\\\test\\\\java\\\\bye\\\\demoFile");
		p.store(fos, "Updated By Gowreesh K");
		
	}

}
