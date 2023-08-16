package Demo04;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Demo01 {

	public static void main(String[] args) throws IOException {
		Writer fw = new FileWriter("./FileWriterOut.cpp", true);
		// fw.write("/*");
		// fw.write("哈哈就看见");
		// fw.write("\n");
		// fw.write('你');
		// fw.write('好');
		// fw.write('世');
		// fw.write('界');
		// fw.write("\n");
		// fw.write("cpp:我是这个世界上最好的语言");
		// fw.write("\n");
		// fw.write("jvav: 不，我才是");
		// fw.write("\n");
		// fw.write("*/");
		// fw.flush();
		// fw.close();

		// 这段代码非常危险。本想测试文件字符写入时的缓冲区大小。导致8GB内存的macbook air卡斯。
		// 最终创建了大小为20GB的文件
		// while (true) {
		// 	fw.write("/*\n * jvav是这个世界上最好的语言\n */");
		// }
	}

}