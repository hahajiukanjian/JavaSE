package com.dyt._3_Safe._4_Synchronization_Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
	private String cardID;	// 账户
	private double money;	// 余额
	private final Lock lock = new ReentrantLock();

	public Account() {
	}

	public Account(String cardID, double money) {
		this.cardID = cardID;
		this.money = money;
	}

	public String getCardID() {
		return cardID;
	}

	public void setCardID(String cardID) {
		this.cardID = cardID;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public void drawMoney(double money) {
		// 确定是谁来取钱
		String name = Thread.currentThread().getName();

		lock.lock();
		if (this.money >= money) {
			System.out.println(name + "取钱" + money + "元成功!");
			this.money -= money;
			System.out.println(name + "取钱后，余额为：" + this.money);
		} else {
			System.out.println(name + "取钱失败，余额不足！");
		}
		lock.unlock();

	}
}
