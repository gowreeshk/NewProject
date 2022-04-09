package bye;

public class person_demo {

	public static void main(String[] args) {
		
		person alex= new person();
		alex.name="alex ";
		alex.age=25;
		alex.gender="male";
		alex.sleep();

	}
	
	
}
 class person{
	String name;
	int age;
	String gender;
	void sleep() {
		if (age<10) {
			System.out.println(name+"      will sleep more than 12 hours in a day");
		}
		else if (age>= 10&& age<= 50) {
			System.out.println(name+ "will sleep more than 10 hours in a day");
		}
		else{
			System.out.println(name+ "will sleep more than 8 hours in a day");
		}
	}
}