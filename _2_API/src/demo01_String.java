public class demo01_String {
	public static void main(String[] args) {
		char[] chs = new char[]{'a', 'b', 'c'};
		String s1 = new String(chs);
		String s2 = new String(chs);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);

		System.out.println();

		String s3 = new String("haha");
		String s4 = new String("haha");
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3==s4);

		System.out.println();

		String s5 = "haha";
		String s6 = "haha";
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s5==s6);

		System.out.println();

		String str1 = "abc";
		String str2 = "ab";
		String str3 = str2 + "c";
		System.out.println(str1);
		System.out.println(str3);
		System.out.println(str1 == str3);

		System.out.println();
	}
}
