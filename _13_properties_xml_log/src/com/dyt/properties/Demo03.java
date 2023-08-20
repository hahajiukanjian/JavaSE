package com.dyt.properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class Demo03 {

	public static void main(String[] args) throws Exception {
		Properties properties = new Properties();
		properties.load(new FileReader("_13_properties_xml_log/src/users.properties"));

		if (properties.containsKey("丁永涛")) {
			properties.setProperty("丁永涛", "dyt");
		}

		properties.store(new FileWriter("_13_properties_xml_log/src/users.properties"), "success!");
	}

}
