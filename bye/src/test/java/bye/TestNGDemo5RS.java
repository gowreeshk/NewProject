package bye;

import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDemo5RS {

	
	@Test(dataProvider = "getData")
	public void login(String uid , String pwd) {
		
		System.out.println(uid+"------"+pwd);
		
	}

	@DataProvider
	public Object[][] getData() {
		
		Object[][] data= new Object[3][2];//Syntax to create Object
		
//		String[][] data1 = new String[2][2];
		

		data[0][0]= "Ramu1";
		data[0][1]="pass1";
		data[1][0]= "Ramu2";
		data[1][1]="pass2";
		data[2][0] ="Ramu3";
		data[2][1] = "Pass3";
		

		return data;
	}
	
		
	}


	

