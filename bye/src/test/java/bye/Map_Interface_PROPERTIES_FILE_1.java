package bye;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

public class Map_Interface_PROPERTIES_FILE_1 {
	

	public static void main(String[] args)  {
		getPropertiesData("C:\\Users\\91888\\eclipse-workspace\\bye\\src\\test\\java\\bye\\demoFile");

	}
	public static HashMap<String, String> getPropertiesData(String filePath){
		HashMap<String, String> configValues= new HashMap<String, String>();
		
		try {
			File file= new File(filePath);
			if (file.exists()) {
				FileInputStream fis=new FileInputStream(filePath);
				Properties props=new Properties();
				props.load(fis);
				Set<Object> allKeys= props.keySet();
				for (Object key:allKeys) {
					String propVal=props.getProperty(key.toString());
					System.out.println(key+": "+propVal);
					configValues.put(key.toString(), propVal);
					
				}
				fis.close();
			} else {
				System.out.println("Given file does not exists.");

			}
		} catch (Exception e) {
			System.out.println("Exception while reading data from properties file");
			System.exit(0);
		}
		
		System.out.println(configValues);
	

		return null;
		
	}
}
