package Demo05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo01 {

	public static void main(String[] args) {
		// 将沁园春长沙乱序文件改为有序，并输出到一个名为《沁园春长沙》的文件中
		// 1、定义一个集合存储文本数据，进行排序
		List<String> data = new ArrayList<>();

		try (
				// 2、获取文件中的数据。按行获取，选择BufferedReader
				BufferedReader br = new BufferedReader(new FileReader("./沁园春长沙乱序"));

				// 5、创建沁园春长沙文件，准备将集合中的内容写入
				BufferedWriter bw = new BufferedWriter(new FileWriter("./《沁园春长沙》.txt"));
			) {
			// 3、按行读取文件内容，添加到集合中去
			String line;
			while ((line = br.readLine()) != null) {
				data.add(line);
			}

			// 4、对集合中的内容进行排序
			// 直接排序，如果序号大于10，会出现1、10、11依次排在头部的情况
			// Collections.sort(data);
			Collections.sort(data,
				(o1, o2) ->
					Integer.parseInt(o1.substring(0, o1.indexOf("."))) -
					Integer.parseInt(o2.substring(0, o2.indexOf(".")))
			);
			System.out.println(data);

			for (String ln : data) {
				bw.write(ln);
				bw.newLine();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
