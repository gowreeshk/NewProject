import java.util.Scanner;
public class gowreesh {


	
	public static void main(String[] args) {
		
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the state : ");
		String statename =input.next();
		switch(statename) {
		case "TS":
			System.out.println("KCR");
			break;
		case "AP":
			System.out.println("JAGAN");
			break;
			default :
				System.out.println("PLEASE ENTER VALID STATE");
			
		
	

	}

}
}