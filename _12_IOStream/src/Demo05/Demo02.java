package Demo05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Demo02 {

	private static final String START_FILE = "/Users/hahajiukanjian/Downloads/Down_Bro/BingGPT-0.3.7-darwin-arm64.dmg";
	private static final String END_FILE   = "/Users/hahajiukanjian/Downloads/Down_Bro/";

	public static void main(String[] args) {
		// copy01();
		copy02();
		copy03();
		copy04();
	}

	public static void copy01() {
		long startTimeMillis = System.currentTimeMillis();
		try (
			InputStream fis  = new FileInputStream(START_FILE);
			OutputStream fos = new FileOutputStream(END_FILE + "01.dmg");
		) {
			int b;
			while ((b = fis.read()) != -1) {
				fos.write(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		long endTimeMillis = System.currentTimeMillis();
		System.out.println("低级字节流一个一个字节输出耗时：" + (endTimeMillis - startTimeMillis) / 1000.0);
	}

	public static void copy02() {
		long startTimeMillis = System.currentTimeMillis();
		try (
			InputStream fis  = new FileInputStream(START_FILE);
			OutputStream fos = new FileOutputStream(END_FILE + "02.dmg");
		) {
			byte[] bt = new byte[1024];
			int len;
			while ((len = fis.read(bt)) != -1) {
				fos.write(bt, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		long endTimeMillis = System.currentTimeMillis();
		System.out.println("低级字节流通过使用1KB数组的字节输出耗时：" + (endTimeMillis - startTimeMillis) / 1000.0);
	}

	public static void copy03() {
		long startTimeMillis = System.currentTimeMillis();
		try (
			InputStream fis  = new FileInputStream(START_FILE);
			BufferedInputStream bis = new BufferedInputStream(fis);
			OutputStream fos = new FileOutputStream(END_FILE + "03.dmg");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
		) {
			int b;
			while ((b = bis.read()) != -1) {
				bos.write(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		long endTimeMillis = System.currentTimeMillis();
		System.out.println("缓冲字节流一个一个字节输出耗时：" + (endTimeMillis - startTimeMillis) / 1000.0);
	}

	public static void copy04() {
		long startTimeMillis = System.currentTimeMillis();
		try (
			InputStream fis  = new FileInputStream(START_FILE);
			BufferedInputStream bis = new BufferedInputStream(fis);
			OutputStream fos = new FileOutputStream(END_FILE + "04.dmg");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
		) {
			byte[] bt = new byte[1024];
			int len;
			while ((len = fis.read(bt)) != -1) {
				fos.write(bt, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		long endTimeMillis = System.currentTimeMillis();
		System.out.println("缓冲字节流通过使用1KB数组的字节输出耗时：" + (endTimeMillis - startTimeMillis) / 1000.0);
	}

}
