package com.dyt.properties;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

public class Demo02 {

	public static void main(String[] args) throws Exception {
		Properties properties = new Properties();
		properties.setProperty("丁永涛", "dyt");
		properties.setProperty("陈家斌", "cjb");

		properties.store(new FileOutputStream("_13_properties_xml_log/src/users1.properties"), "添加的用户");
		properties.store(new FileWriter("_13_properties_xml_log/src/users2.properties"), "添加的用户");
	}

}
