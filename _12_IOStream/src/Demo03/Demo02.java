package Demo03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Demo02 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("/Users/hahajiukanjian/Code/CodeV23/Java/Java/Java/README.md");
//		int b1 = is.read();
//		System.out.println((char) b1);
//
//		int b2 = is.read();
//		System.out.println((char) b2);
//
//		int b3 = is.read();
//		System.out.println((char) b3);
//
//		int b4 = is.read();
//		System.out.println((char) b4);
//
//		int b5 = is.read();
//		System.out.println((char) b5);

		int b;
		while ((b = is.read()) != -1) {
			// if (b == '\n') {
				// System.out.println();
			// } else {
				System.out.print((char) b);
			// }
		}

		is.close();
	}

}
