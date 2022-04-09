package revision;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number");
		int num=sc.nextInt();
		
		int count=0;
		if (num%2==0) {
			System.out.println("Given number is not a prime number");
		}
		else {
			for (int i = 3; i <=num/3; i+=2) {
				if (num%i==0) {
					count++;
				}
			}
			if (count==0) {
				System.out.println("Given number is a prime number");
			}else {
				System.out.println("Given number is not a prime number");
			}
		}
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


