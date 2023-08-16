public class staticDemo2 {
	private static staticDemo2 staticdemo2;

	private staticDemo2() {
	}

	public static staticDemo2 getStaticDemo2() {
		return (staticdemo2 != null) ? staticdemo2 : (staticdemo2 = new staticDemo2());
	}

}
