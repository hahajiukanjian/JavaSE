package Demo01;

import java.io.File;
import java.io.IOException;

public class Demo03 {
    public static void main(String[] args) throws Exception {
        File f1 = new File("/Users/hahajiukanjian/Code/CodeV23/File/java.txt");
        // 1、public boolean createNewFile(): 创建一个新文件（文件内容为空）
        System.out.println(f1.createNewFile());

        File f2 = new File("/Users/hahajiukanjian/Code/CodeV23/File/java");
        // 2、public boolean mkdir(): 用于创建文件夹，注意：只能创建一级文件夹
        System.out.println(f2.mkdir());

        File f3 = new File("/Users/hahajiukanjian/Code/CodeV23/File/java/cpp/c/rust/kotlin/python/php");
        // 3、public boolean mkdirs(): 用于创建文件夹，注意：可以创建多级文件夹
        System.out.println(f3.mkdirs());

        File f4 = new File("/Users/hahajiukanjian/Code/CodeV23/File/java/cpp/c/rust/kotlin/python/php");
        // 4、public boolean delete(): 删除文件，或者空文件夹，注意：不能删除非空文件夹
        System.out.println(f4.delete());
    }
}
