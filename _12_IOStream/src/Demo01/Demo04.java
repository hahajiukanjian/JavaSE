package Demo01;

import java.io.File;

public class Demo04 {
    public static void main(String[] args) {
        File f1 = new File("/Users/hahajiukanjian/");
        // list
        // String[] f1Names = f1.list();
        // for (String f1name : f1Names) {
        //     System.out.println(f1name);
        // }

        File[] fNames = f1.listFiles();
        for (File fname : fNames) {
            System.out.println(fname.getAbsolutePath());
            if (fname.isDirectory()) {
                String[] names = fname.list();
                for (String name : names) {
                    System.out.println(name);
                }
            }
        }
    }
}
