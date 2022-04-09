package revision;

import java.util.Arrays;

public class to_find_second_highest_number_in_array {

	public static void main(String[] args) {
		int[][] i =new int[3][2] ;
		i[0][0]=4;
		i[0][1]=1;
		i[1][0]=7;
		i[1][1]=2;
		i[2][0]=6;
		i[2][1]=7;
		
	    
		
		
//		
//		Arrays.sort(i);
//		for (int j : i) {
//			System.out.println(j);
//		}
		
		
		
		
		
	}

	
	
	
	
 public static int loop (int[][] i,int m){
	 int k=0;
		for (int j : i[m]) {
			if (j>k) {
				k=j;
			}
		}
		return k;
 }
}
