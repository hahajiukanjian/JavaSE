package com.dyt._7_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Demo01 {
	public static void main(String[] args) {
		Collection<String> collection = new ArrayList<>();

		// 1、add()：向集合中添加元素
		collection.add("java1");
		collection.add("java4");
		collection.add("java2");
		collection.add("java3");
		collection.add("java2");
		System.out.println(collection);

		// 2、public void clear()：清空集合中的元素
//		collection.clear();
//		System.out.println(collection);

		// 3、isEmpty()

		// 4、size

		// 5、contains：判断集合中是否包含某个元素
		System.out.println(collection.contains("java1"));
		System.out.println(collection.contains("Java1"));

		// 6、remove

		// 7、toArray()：把集合转换为数组
		Object[] array = collection.toArray();
		System.out.println(Arrays.toString(array));

		String[] array1 = collection.toArray(new String[collection.size()]);
		System.out.println(Arrays.toString(array1));

		System.out.println("-------------------------");
		Collection<String> c1 = new ArrayList<>();
		c1.add("java1");
		c1.add("java2");
		Collection<String> c2 = new ArrayList<>();
		c2.add("java3");
		c2.add("java4");
		c2.addAll(c1);
		System.out.println(c1);
		System.out.println(c2);

	}
}
