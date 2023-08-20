package com.dyt.xml;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class Demo01 {

	public static void main(String[] args) throws Exception {
		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read("_13_properties_xml_log/src/users1.xml");
		Element rootElement = document.getRootElement();
		System.out.println(rootElement.getName());

		List<Element> elements = rootElement.elements("user");
		for (Element element : elements) {
			System.out.println(element.getName());
		}
	}

}
