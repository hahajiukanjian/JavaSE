package com.dyt._3_Safe._2_Synchronization_Code;

public class Account {
	private String cardID;	// 账户
	private double money;	// 余额

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

		// 字符串常量在Java中是唯一键，可以作为锁
		// synchronized ("丁永涛") {
		// 但是这只能解决_1_NoS....包下面的问题
		// 如果有四个线程两个账户取钱，当一个线程加锁后，剩余的三个线程都不能执行取钱操作
		// 这显然是不合理的。所以我们要使用共享账户这个变量进行加锁
		synchronized (this) {
			if (this.money >= money) {
				System.out.println(name + "取钱" + money + "元成功!");
				this.money -= money;
				System.out.println(name + "取钱后，余额为：" + this.money);
			} else {
				System.out.println(name + "取钱失败，余额不足！");
			}
		}
	}
}
