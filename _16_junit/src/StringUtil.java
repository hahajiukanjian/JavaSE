public class StringUtil {
	public static void printNumber(String data) {
		if (data == null) {
			System.out.println("data的长度是：" + -1);
			return ;
		}
		System.out.println("data的长度是：" + data.length());
	}

	public static int getMaxInteger(String data) {
		if (data == null) {
			return -1;
		}
		return data.length() - 1;
	}
}
