package Demo01;

import java.io.File;

/*
 * File 操作文件
 */

public class Demo01 {
    public static void main(String[] args) {
        // 创建一个File对象，指代某个具体的文件
        File f1 = new File("/Users/hahajiukanjian/Code/CodeV23/File/abc.txt");
        System.out.println(f1.length());
        System.out.println(f1);

        // File类可以指向目录（文件夹）
        File f2 = new File("/Users/hahajiukanjian/Code");
        System.out.println(f2.length());
        System.out.println(f2);

        // File对象可以指向一个不存在的路径
        File f3 = new File("/Users/hahajiukanjian/Code/CodeV23/hahahaha");
        System.out.println(f3.length());
        System.out.println(f3.exists());

        // File f4 = new File("./Java/src/com/dyt/P152_P160_IO/Demo01/test.txt");
        // File f4 = new File("./test.txt");
        File f4 = new File("src/com/dyt/P152_P160_IO/Demo01/test.txt");
        System.out.println(f4.length());

        String currentDirectory = System.getProperty("user.dir");
        System.out.println("当前所在目录: " + currentDirectory);
    }
}
