import java.util.Scanner;

public class DemoWhile {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a Num : ");
		
	    int num = s.nextInt();
		
		while (5>=num) {
			
			System.out.println(num);
			num++;
			
		}
		
		
	}

}
