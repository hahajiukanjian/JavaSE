package Demo01;

import java.io.File;

/*
 * 案例：将某个目录下的demo01....的文件名变为从demo10开始
 */

public class Demo05 {
	public static void main(String[] args) {
		// 创建File对象，指向该目录
		File file = new File("/Users/hahajiukanjian/Code/CodeV23/File/数组");

		// 获取目录中的文件名
		File[] filenames = file.listFiles();

//		String text = "Hello, world!";
//		char lastChar = text.charAt(text.length() - 1);
//		System.out.println("最后一个字符: " + lastChar);

		// 一个一个遍历，改变文件名称
		for (File filename : filenames) {
			String strfilename = filename.getName();
			// 对文件名进行操作
//			System.out.println(filename);
			// 只对.cpp和.c结尾的文件进行更改 .out结尾的文件做删除处理
//			char SuffixFilename = filename.charAt(filename.length() - 3);
//			System.out.println(SuffixFilename);
			// 使用charAt方法做不行，只能获取到一个char类型的字符。无法获得完整的后缀
			String SuffixFilename = strfilename.substring(strfilename.indexOf("."));
			String PrefixFilename = strfilename.substring(0, strfilename.indexOf("."));
//			System.out.println(PrefixFilename);
//			System.out.println(SuffixFilename);
			// 如果是.cpp .c 对其进行改名操作
			if (SuffixFilename.equals(".cpp") || SuffixFilename.equals(".c")) {
				String indexFilename = PrefixFilename.substring(4, 6);
				String lastFilename = PrefixFilename.substring(6);
//				System.out.println(indexFilename);
//				System.out.println(lastFilename);
				String NewFilename = "demo" + (Integer.parseInt(indexFilename) + 10) + lastFilename + SuffixFilename;
				System.out.println(NewFilename);
				System.out.println(filename.renameTo(new File(file, NewFilename)));

			}
			if (SuffixFilename.equals(".out")) {
				System.out.println(filename.delete());

			}
		}
	}
}
