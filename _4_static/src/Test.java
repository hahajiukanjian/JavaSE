public class Test {
	public static void main(String[] args) {

		staticDemo1 s1 = staticDemo1.getStaticDemo();
		staticDemo1 s2 = staticDemo1.getStaticDemo();
		staticDemo1 s3 = staticDemo1.getStaticDemo();
		staticDemo1 s4 = staticDemo1.getStaticDemo();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

		System.out.println("----------------------------------------------------");


		staticDemo2 t1 = staticDemo2.getStaticDemo2();
		staticDemo2 t2 = staticDemo2.getStaticDemo2();
		staticDemo2 t3 = staticDemo2.getStaticDemo2();
		staticDemo2 t4 = staticDemo2.getStaticDemo2();
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);

	}
}
