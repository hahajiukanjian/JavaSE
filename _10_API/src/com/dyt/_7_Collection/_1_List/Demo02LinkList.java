package com.dyt._7_Collection._1_List;

import java.util.LinkedList;

public class Demo02LinkList {

	public static void main(String[] args) {
		// 1、创建一个队列
		LinkedList<String> queue = new LinkedList<>();
		queue.addLast("第1号人");
		queue.addLast("第2号人");
		queue.addLast("第3号人");
		queue.addLast("第4号人");
		System.out.println(queue);

		// 出队
		System.out.println(queue.removeFirst());
		System.out.println(queue.removeFirst());
		System.out.println(queue.removeFirst());
		System.out.println(queue.removeFirst());
	}

}
