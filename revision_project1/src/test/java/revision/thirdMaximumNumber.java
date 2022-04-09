package revision;

import org.testng.annotations.Test;

public class thirdMaximumNumber {

	@Test
	public void m2() {

		
			int[] a= new int[5];
			a[0]=4;
			a[1]=9;
			a[2]=3;
			a[3]='f';
			a[4]=8;
			int r=0;
			for (int i = 0; i < a.length; i++) {
				for (int j = i+1; j < a.length; j++) {
					if (a[j]>a[i]) {
						r=a[j];
						a[j]=a[i];
						a[i]=r;
					}
				}
			}
			for (int i : a) {
				System.out.println(i);
				
			}
	}

}
