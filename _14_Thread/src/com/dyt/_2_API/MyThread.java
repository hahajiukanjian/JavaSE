package com.dyt._2_API;

public class MyThread extends Thread {
	@Override
	public void run() {
		for (int ii = 0; ii < 20; ii++) {
			System.out.println("子线程MyThread输出：" + (ii + 1));
		}
	}
}
