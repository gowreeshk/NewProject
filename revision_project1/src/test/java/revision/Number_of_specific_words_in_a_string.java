package revision;

public class Number_of_specific_words_in_a_string {

	public static void main(String[] args) {
		
		System.out.println(number_of_specific_characters("what is this the omg the this the", 't'));

//		String str="what is this the omg the this the";
//		String[] ss= str.split(" ", 8);
//		String t="the";
//		int count=0;
//		
//		for (String sr : ss) {
//			if (sr.equalsIgnoreCase(t)) {
//				count++;
//			}
//		}
//		System.out.println(count);
	}
	public static int number_of_specific_characters(String st, char ch) {
		char[] ab=st.toCharArray();
		int count=0;
		for (char c : ab) {
			if (c==ch) {
				count++;
			}
		}
		
		
		return count;
		
	}
	
	
}
