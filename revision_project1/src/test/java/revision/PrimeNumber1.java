package revision;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {

		try {
			System.out.println("Enter the number");
			Scanner sc=new Scanner(System.in);
			long n=sc.nextInt();
			int count=0;
			if (n%2==0) {
				System.out.println("The given number is not a prime number");
				
			} else {
				for (int i =3 ; i < n/3; i++) {
					if (n%i==0) {
						count++;
						break;
					}
					
				}
				if (count==1) {
					System.out.println("The given number is not prime");
					
				}else {
					System.out.println("The given number is prime");
				}
			}
			
		} catch (Exception InputMismatchException) {
			System.out.println("Please enter long number");
					}
		
		
	}

}
