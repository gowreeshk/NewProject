package bye;

public class Reversing_a_number {
	
	
	public static void main(String[] args) {
		
		
//		while (num!=0) {
//			int rem= num%10;
//			int count= 0;
//			
//			for (int i = 1; i <= rem; i++) {
//				
//				if (rem%i==0) {
//					count++;
//				}
//				
//			}
//			if(count==2) {
//				System.out.println(rem);
//			}
//			num=num/10;
//		}
//		
//		}
		
		
		/*
		// sum of digits of a number
		int sum=0;
		while (num!=0) {
		int	rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);
		
		
		
				int count=0;
		
		// to count the number of digits in a number 
		while (num!=0) {
			num=num/10;
			count++;
			
		}
		System.out.println(count);
		*/

				// reversing a given number
		int num = 536;
		int num1=535;
		int num2= 0;
			while (num!=0) {	
			int rem=num%10;
			num2=num2*10+rem;
			num=num/10;
		}	
			
			System.out.println(num2);
			if (num1==num2) {
				System.out.println("The Given Number Is A Polyndrome");
				
			}else {
				System.out.println("The Given Number Is Not A Polyndrome");
			}
//			if (num==num2) {
//				System.out.println("The Given Number Is A Polyndrome");
//				
//			} else {
//				System.out.println("The Given Number Is Not A Polyndrome");
//			}
			
			
	}
} 
      

