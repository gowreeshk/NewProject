package bye;

import java.util.Scanner;

public class ToCheckWhetherTheGivenNumberIsPrimeOrNot {

	public static void main(String[] args) {
		
		Scanner a= new Scanner(System.in);
	    System.out.println("Please Enter The Value :");
		int rem=a.nextInt();
		int count= 0;
		
		for (int i = 1; i <= rem; i++) {
			
			if (rem%i==0) {
				count++;
			}
			
		}
		if(count==2) {
			System.out.println("The Given Number Is A Prime Number ");
		}
		else {
			System.out.println("The Given Number Is Not A Primenumber");
		}
	}

}
