package Demo03;

import java.io.FileInputStream;
import java.io.InputStream;

public class Demo03 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("/Users/hahajiukanjian/Code/CodeV23/File/abc.txt");

		byte[] buffer = new byte[3];
		int len;

		while ((len = is.read(buffer)) != -1) {
			String str = new String(buffer, 0, len);
			System.out.println(str);
		}
	}

}
