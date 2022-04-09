package bye;

public class String_Methods {
	public static void main(String[] args) {
		String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String str1=str.substring(6);
		System.out.println(str1);
		String str2=str.substring(5,10);
		System.out.println(str2);
		
		
		 int k=str.hashCode();
		 
		String a="Hi Mahesh. How are you";
		boolean b=a.contains("Mahesh");
		System.out.println(b);
		boolean c=a.contains("harish");
		System.out.println(c);
		boolean d=a.startsWith("Hi");
		System.out.println(d);
		boolean e=a.startsWith("How");
		System.out.println(e);
		int t=str.indexOf("HI");
		System.out.println(t);
		System.out.println(k);
		
		int gg = 'C';
		
		System.out.println(gg);
	}

}
