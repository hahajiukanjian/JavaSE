public class demo09_Method {
	public static void main(String[] args) {

		int a, b;
		
		a = 50;
		b = a;
		
		System.out.println(a);
		System.out.println(b);

		func1(a, b);

		System.out.println(a);
		System.out.println(b);

	}

	public static void func1(int a, int b) {
		a = 10;
		b = 20;
		System.out.println("func1:" + a);
		System.out.println("func1" + b);
	}

}