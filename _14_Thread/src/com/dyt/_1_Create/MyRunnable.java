package com.dyt._1_Create;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int ii = 0; ii < 20; ii++) {
			System.out.println("子线程MyRunnable输出" + (ii + 1));
		}
	}
}
