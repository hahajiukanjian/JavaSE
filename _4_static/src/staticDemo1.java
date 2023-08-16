public class staticDemo1 {

	private static final staticDemo1 staticdemo1 = new staticDemo1();

	private staticDemo1() {}

	public static staticDemo1 getStaticDemo() {
		return staticdemo1;
	}

}