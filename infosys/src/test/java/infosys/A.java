package infosys;

public class A {
	int x = 10;
	static int i = 3;

	public A() {
		int x = 20;
		int i = 20;

		System.out.println("constructer");
		System.out.println(x + this.x);
		System.out.println(i + this.i);

	}

	public static void main(String[] args) {
		A y = new A();
		System.out.println(y.x);
	}

}
