public interface A {

	default void test1() {
		System.out.println("====默认方法====");
	}

	private void test2() {
		System.out.println("====私有方法====");
	}

	static void test3() {
		System.out.println("====静态方法====");
	}

}
