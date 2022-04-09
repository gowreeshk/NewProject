

package bye;


public class new_prime_number {

	

	
	public static void main(String[] args) {
		boolean IsPrime=true;
		int num=123456789;
		if (num%2==0) {
			System.out.println("It Is Not A Prime Number");
			
		}else {
			for (int i = 3; i <=num/2; i+=2) {
				if (num%i==0) {
					IsPrime=false;
					break;
				}
				
			}
			if (IsPrime==true) {
				System.out.println("It Is A Prime Number");
				
				
			}else {
				System.out.println("It Is Not A Prime Number");
			}
		}
		

	}

}
