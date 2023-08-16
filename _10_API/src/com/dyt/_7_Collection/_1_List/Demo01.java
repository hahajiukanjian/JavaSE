package com.dyt._7_Collection._1_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Demo01 {
	public static void main(String[] args) {
		// 创建一个ArraryList集合对象（有序、可重复、有索引）
		List<String> list = new ArrayList<>();
		list.add("蜘蛛精");
		list.add("至尊宝");
		list.add("牛夫人");
		list.add("蜘蛛精");
		System.out.println(list);

		// public void add(int index, E element)：在某个索引位置插入元素
		list.add(2, "紫霞仙子");
		System.out.println(list);

		// public E remove(int index)：根据索引删除元素，返回被删除的元素
		System.out.println(list.remove(2));
		System.out.println(list);

		// public E get(int index)：返回集合中指定位置的元素
		System.out.println(list.get(3));

		// public E set(int index, E element)：修改索引位置处的元素，修改成功后，会返回原来的数据
		System.out.println(list.set(3, "牛魔王"));
		System.out.println(list);

		for (int ii1 = 0; ii1 < list.size(); ii1++) {
			System.out.println(list.get(ii1));
		}

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		for (String s : list) {
			System.out.println(s);
		}

		list.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		});

		list.forEach(
			(String s) -> {
				System.out.println(s);
		});

		list.forEach(s -> System.out.println(s));

		list.forEach(System.out::println);
	}
}
