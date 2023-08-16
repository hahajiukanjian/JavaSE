package Demo03;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 * 测试Java中的编码和解码函数
 */

public class Demo01 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		// 按照指定字节进行编码
		String str = "a我m";
		byte[] bytes1 = str.getBytes();
		System.out.println(Arrays.toString(bytes1));

		byte[] bytes2 = str.getBytes("GBK");
		System.out.println(Arrays.toString(bytes2));

		// 按照指定字节进行编码
		String str1 = new String(bytes1);
		System.out.println(str1);

		String str2 = new String(bytes2);
		System.out.println(str2);

		String str3 = new String(bytes1, "GBK");
		System.out.println(str3);

		String str4 = new String(bytes2, "GBK");
		System.out.println(str4);
	}
}
