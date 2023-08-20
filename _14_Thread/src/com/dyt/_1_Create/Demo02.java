package com.dyt._1_Create;

/*
 * 创建线程方式二 使用Runnable接口实现创建线程
 * 	优点
 * 		只是实现了接口，可以实现其他的接口，继承其他的类，拓展性更强
 * 	缺点
 * 		需要多创建一个Runnable对象
 */

public class Demo02 {
	public static void main(String[] args) {
		// 创建Runnable实现类对象
		Runnable runnable = new MyRunnable();

		// 将runnable交给Thread类的对象
		new Thread(runnable).start();

		// （拓展）使用匿名内部类的方式创建Runnable类型的线程
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				for (int ii = 0; ii < 20; ii++) {
//					System.out.println("子线程匿名类输出：" + (ii + 1));
//				}
//			}
//		}).start();
		new Thread(
				() -> {
					for (int ii = 0; ii < 20; ii++) {
						System.out.println("子线程匿名类输出：" + (ii + 1));
					}
				}).start();

		for (int ii = 0; ii < 20; ii++) {
			System.out.println("主线程main输出：" + (ii + 1));
		}
	}
}
