package Demo02;

import java.io.File;

/*
 * 删除文件夹，使用递归来做
 * listFiles返回的结果判断
 */

public class Demo05 {
	public static void main(String[] args) {
		deleteDir(new File("/Users/hahajiukanjian/Code/CodeV23/File/java_"));
		// File file = new File("/Users/hahajiukanjian/Code/CodeV23/File/java_/kotlin/python");
		// File[] files = file.listFiles();
		// System.out.println(files == null || files.length == 0);
	}

	public static void deleteDir(File Dir) {
		if (Dir == null || !Dir.exists() || !Dir.isDirectory()) {
			System.out.println("要删除的目录名不合法，您输入的目录名为" + Dir.getName());
			return;
		}

		// 现在已经确定Dir为目录了，获取Dir下的一级目录和文件。
		File[] files = Dir.listFiles();

		for (File file : files) {
			// 进行删除文件的操作
			if (file.isFile()) {
				_ToolDeleteFile(file);
				// 删除完成file文件后，刷新files数组的内容。重新判断
				files = Dir.listFiles();
				if (files == null || files.length == 0) {
					_ToolDeleteFile(Dir);
					return;
				}
			} else if (file.isDirectory()) {
				if (files == null || files.length == 0) {
					_ToolDeleteFile(Dir);
					return;
				} else {
					deleteDir(file);
					// 当前目录下存在一级目录。删除完一级目录后，需要刷新files数组。重新判断
					files = Dir.listFiles();
					if (files == null || files.length == 0) {
						_ToolDeleteFile(Dir);
						return;
					}
				}
			}
		}
	}

	private static void _ToolDeleteFile(File file) {
		if (file.isDirectory()) {
			if (file.delete()) {
				System.out.println("目录" + file + "已删除");
				return;
			} else {
				System.out.println("删除目录" + file + "失败，没有删除权限");
			}
		} else {
			if (file.delete()) {
				System.out.println("文件" + file + "已删除");
				return;
			} else {
				System.out.println("删除文件" + file + "失败，没有删除权限");
			}
		}
	}
}
