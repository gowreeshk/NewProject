package bye;

import org.testng.annotations.Test;

public class testngpractice1 {
	    @Test()
		public void tc1 () {
			
			System.out.println("1");
		}
	    @Test(groups = "home")
		public void tc2 () {
				
			System.out.println("2");
			}
	    @Test(groups = "home")
		public void tc3 () {
			
			System.out.println("3");
		}
	    @Test(groups = "home")
		public void tc4 () {
			
			System.out.println("4");
		}
	    @Test
		public void tc5 () {
			
			System.out.println("5");
		}
	    @Test
		public void tc6 () {
			
			System.out.println("6");
		}
	    @Test
		public void tc7 () {
			
			System.out.println("7");
		}
	    @Test
		public void tc8 () {
			
			System.out.println("8");
		}

}
