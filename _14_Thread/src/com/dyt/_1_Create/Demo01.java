package com.dyt._1_Create;

/*
 * 创建线程方式一
 * 	优点
 * 		编写方便
 * 	缺点
 * 		已经继承了Thread，无法继承其他的方法
 *
 * 注意事项
 * 	必须调用start，而不是run。
 * 	调用start会使CPU为该线程创建一个新的跑道
 */

public class Demo01 {
	public static void main(String[] args) {
		Thread thread = new MyThread();
		thread.start();

		for (int ii = 0; ii < 50; ii++) {
			System.out.println("主线程main输出：" + (ii + 1));
		}
	}
}
