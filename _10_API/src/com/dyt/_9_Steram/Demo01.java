package com.dyt._9_Steram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo01 {
	public static void main(String[] args) {
		// 未采用Stream流，需要统计姓张且名字为三位的人名
		List<String> names = new ArrayList<>();
		Collections.addAll(names, "张无忌", "张坤", "蔡徐坤", "张三丰", "丁永涛", "李元伯", "高启涵", "张嘉宾");

		System.out.println(names);

		List<String> ZhangNmaes = new ArrayList<>();
		for (String name : names) {
			if (name.startsWith("张") && name.length() == 3) {
				ZhangNmaes.add(name);
			}
		}
		System.out.println(ZhangNmaes);

		// 采用Stream流
		List<String> namesZhang = names.stream().filter(s -> s.startsWith("张")).filter(a -> a.length() == 3).collect(Collectors.toList());
		System.out.println(namesZhang);

	}
}
