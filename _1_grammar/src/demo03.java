public class demo03 {
	public static void main(String[] args) {
		byte b1 = 10;
		short s1 = 20;
		int s2 = b1 + s1;
		System.out.println(s2);

		System.out.println("--------------------------------------");

		int i1 = 200;
		byte b2 = (byte)i1;
		System.out.println(b2);
		
		System.out.println("--------------------------------------");

		int i2 = 5;
		System.out.println(i2 + '中' + "哈哈就看见");
		System.out.println(0 + '中' + "哈哈就看见");
	}
}
