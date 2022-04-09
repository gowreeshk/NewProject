package revision;

import java.util.Scanner;

public class maximumOfThreeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		System.out.println("Enter third number");
		int c=sc.nextInt();
		if (a>b&&a>c) {
			System.out.println(a+" is greater than b and c");
		}else if (b>a&&c>c) {
			System.out.println(b+" is greater than a and c");
		}else if (c>a&&c>b) {
			System.out.println ( c+" is greater than b and a");
		}

		if (a==b&&a==c) {
			System.out.println(a);
		}else if (a==b&&a>c) {
			System.out.println(a);
		}
		else if (a==c&&a>b) {
			System.out.println(a);
		}else if (b==c&&b>a) {
			System.out.println(b);
		}
		
	}

}
