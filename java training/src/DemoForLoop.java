
public class DemoForLoop {
	
	static {
		System.out.println("Hello I Can Print ");
		
	}

	public static void main(String[] args) {
		
		out:for (int i = 0; i <=100; i++) {
			inner:for (int j = 0; j < 10; j++) {
				if (i==50) {
					break out;
				}
				System.out.println(j);
			}
			
			System.out.println(i+" Gowreesh");
			
		}
		
	}

}
