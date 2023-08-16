package Demo02;

import java.io.File;

public class Demo06 {
	public static void main(String[] args) {
		deleteDir(new File("/Users/hahajiukanjian/Code/CodeV23/File/java_"));
	}

	public static void deleteDir(File dir) {
		// 判断dir的正确性
		if (dir == null || !dir.exists()) {
			return;
		}

		// 判断传入的dir是否为文件名
		if (dir.isFile()) {
			dir.delete();
			return;
		}

		// 获取dir目录下所有的一级目录和文件
		File[] files = dir.listFiles();

		// 判断files数组是否为空，若为空，说明是空目录，可以直接删除
		if (files.length == 0) {
			dir.delete();
			return;
		}

		for (File file : files) {
			if (file.isFile()) {
				file.delete();
			} else {
				deleteDir(file);
			}
		}
		// for循环执行完毕后，当前目录变为空目录，可以直接删除

		dir.delete();

	}
}
