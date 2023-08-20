package com.dyt.properties;

import java.io.FileReader;
import java.util.Properties;
import java.util.Set;
import java.util.function.BiConsumer;

public class Demo01 {

	public static void main(String[] args) throws Exception {
		// 创建一个Properties对象
		Properties properties = new Properties();
		System.out.println(properties);

		// 2、开始加载属性文件中的键值对数据到properties中
		properties.load(new FileReader("_13_properties_xml_log/src/users.properties"));
		System.out.println(properties);

		// 3、根据键取值
		System.out.println(properties.getProperty("张无忌"));
		System.out.println(properties.getProperty("丁永涛"));

		// 4、遍历全部键和值
		Set<String> keys = properties.stringPropertyNames();
		for (String key : keys) {
			System.out.println(key + "--->" + properties.getProperty(key));
		}

		// 5、forEach遍历
		properties.forEach((k, v) -> {System.out.println(k + "-->" + v);});
	}

}
