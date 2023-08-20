package com.dyt._3_Safe._3_Synchronization_Method;

public class DrawThread extends Thread {
	private Account acc;

	public DrawThread(Account acc, String name) {
		super(name);
		this.acc = acc;
	}

	@Override
	public void run() {
		// 取钱
		acc.drawMoney(100000);
	}
}
