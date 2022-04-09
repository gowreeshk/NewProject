package revision;

import java.util.Scanner;

public class Compound_Interest {

	public static void main(String[] args) {

		double principal_amount=0.0;
		double Interest_rate=0.0;
		double time_period=0.0;
		double compoundIbterest=0.0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal amount: ");
		principal_amount =sc.nextDouble();
		System.out.println("Enter the interest rate: ");
		Interest_rate =sc.nextDouble();
		System.out.println("Enter the time period: ");
		time_period =sc.nextDouble();
		compoundIbterest=principal_amount*Math.pow((1+Interest_rate/100),time_period);
		System.out.println("");
		System.out.println(compoundIbterest);
	}

}
