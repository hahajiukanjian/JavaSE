package Demo03;

import java.io.*;

public class Demo05 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("./FileOutputStream.cpp");

		InputStream is = new FileInputStream("/Users/hahajiukanjian/Code/CodeV23/File/数组/demo22_内存地址加1.cpp");
		byte[] readAllBytes = is.readAllBytes();

		os.write(readAllBytes);

		InputStream is2 = new FileInputStream("/Users/hahajiukanjian/Pictures/Wallpaper/11.png");
		byte[] readAllBytes2 = is2.readAllBytes();
		OutputStream os2 = new FileOutputStream("./picture1.jpg", true);
		os2.write(readAllBytes2);

		is.close();
		is2.close();
		os.close();
		os2.close();
	}

}
