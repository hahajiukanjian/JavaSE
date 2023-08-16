package Demo02;

import java.io.File;

/*
 * 搜索文件，采用递归的方式
 */

public class Demo04 {

	public static void main(String[] args) {
		searchFile(new File("/Users/hahajiukanjian"), "demohaha.cpp");
	}

	public static void searchFile(File dir, String filename) {
		// 判断传入的目录是否正确
		if (dir == null || filename == null || !dir.exists() || !dir.isDirectory()) {
			System.out.println("传入的参数不符合规范");
			return;
		}

		// 现在目录和文件名是正确的，获取当前目录下的一级目录和文件
		File[] DirAndFiles = dir.listFiles();

		// 遍历DirAndFiles数组。如果是文件，判断文件名是否符合。如果是目录，递归搜索
		for (File DirORFile : DirAndFiles) {
			if (DirORFile.isFile()) {
				if (DirORFile.getName().contains(filename)) {
					System.out.println(filename + "文件在系统中的绝对路径名为：" + DirORFile.getAbsolutePath());
					// return;
				}
			} else if (DirORFile.isDirectory()) {
				// System.out.println(DirORFile);
				searchFile(DirORFile, filename);
			}
		}

		// System.out.println("系统中不存在" + filename + "文件，或者本程序无权限访问系统的所有目录");
	}

}
