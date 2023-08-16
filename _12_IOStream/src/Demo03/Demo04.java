package Demo03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Demo04 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("/Users/hahajiukanjian/Code/CodeV23/File/数组/demo22_内存地址加1.cpp");

		byte[] readAllBytes = is.readAllBytes();
		System.out.println(new String(readAllBytes));
	}

}
