package com.dyt._4_Communication;

public class Demo01 {
	public static void main(String[] args) {
		Desk desk = new Desk();
		// 厨师生产包子，一次生产一个
		new Thread(() -> {
			while (true) {
				desk.put();
			}
		}, "厨师1").start();

		new Thread(() -> {
			while (true) {
				desk.put();
			}
		}, "厨师2").start();

		new Thread(() -> {
			while (true) {
				desk.put();
			}
		}, "厨师3").start();

		// 吃货吃包子，一次吃一个
		new Thread(() -> {
			while (true) {
				desk.get();
			}
		}, "吃货1").start();

		new Thread(() -> {
			while (true) {
				desk.get();
			}
		}, "吃货2").start();
	}
}
