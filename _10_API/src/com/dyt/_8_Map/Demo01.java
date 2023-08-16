package com.dyt._8_Map;

import java.util.*;

public class Demo01 {
	public static void main(String[] args) {
		// 1、把80个学选择的景点数据统计出来
		List<String> data = new ArrayList<>();
		String[] selects = {"A", "B", "C", "D"};

		Random random = new Random();
		for (int ii = 0; ii < 80; ii++) {
			int index = random.nextInt(4); // 0, 1, 2, 3
			data.add(selects[index]);
		}
		System.out.println(data);

		// 2、创建Map集合，统计各个景点选择的人数
		Map<String, Integer> result = new HashMap<>();

		// 3、遍历data集合，统计选择的景点。
		// 如果result中没有该景点，说明是第一次选择
		// 如果result中有该景点，将景点的值+1，覆盖掉原来的景点数据
		for (String datum : data) {
			if (result.containsKey(datum)) {
				result.put(datum, result.get(datum) + 1);
			} else {
				result.put(datum, 1);
			}
		}
		System.out.println(result);
	}
}
