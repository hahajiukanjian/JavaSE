package com.dyt._1_Create;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
	private int n;

	public MyCallable(int n) {
		this.n = n;
	}

	@Override
	public String call() throws Exception {
		int sum = 0;

		for (int ii = 0; ii <= n; ii++) {
			sum += ii;
		}

		Thread.sleep(1000);

		return "Callable的实现类线程求出1-" + n + "的和是：" + sum;
	}
}
