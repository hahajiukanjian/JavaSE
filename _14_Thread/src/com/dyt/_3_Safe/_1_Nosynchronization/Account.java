package com.dyt._3_Safe._1_Nosynchronization;

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

		if (this.money >= money) {
			System.out.println(name + "取钱" + money + "元成功!");
			this.money -= money;
			System.out.println(name + "取钱后，余额为：" + this.money);
		} else {
			System.out.println(name + "取钱失败，余额不足！");
		}
	}
}
