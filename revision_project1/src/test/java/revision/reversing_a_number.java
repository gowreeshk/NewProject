package revision;

import java.util.Scanner;

public class reversing_a_number {

	public static void main(String[] args) {
//		System.out.println("Please enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int newNum=0;
		while (num!=0) {
			int rem=num%10;
			
			num=num/10;
			newNum=newNum*10+rem;
		}
		System.out.println(newNum);
	}

}
