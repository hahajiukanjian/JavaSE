package Demo02;

/*
 * 测试递归
 */

public class Demo01 {
	public static void main(String[] args) {
		// test1();
	}

	// 直接递归
	private static void test1() {
		System.out.println("hahahahaha");
		test1();
	}

	// 间接递归
	private static void test2() {
		System.out.println("hhhhhhhhhhhhhhhhhhh");
		test3();
	}

	private static void test3() {
		test2();
	}

}
