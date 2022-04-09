package GL;



		import java.util.*;
		public class Main{
		    public static void main(String args[]){
		        Scanner sc=new Scanner(System.in);
		        int num=sc.nextInt();
		        sc.nextLine();
		        LinkedHashMap<String,Float>map=new LinkedHashMap<>();
		        for(int i=0;i<num;i++){
		            String name=sc.nextLine();
		            Float marks=sc.nextFloat();
		            sc.nextLine();
		            map.put(name,marks);
		        }
		        LinkedHashMap<String,String>res=new LinkedHashMap<>();
		        res=UserMainCode.calculateGrade(map);
		        for(Map.Entry<String,String>m:res.entrySet()){
		            System.out.println(m.getKey());
		            System.out.println(m.getValue());
		        }
		    }
		}
	
