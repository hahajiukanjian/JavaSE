package com.dyt._3_Safe._4_Synchronization_Lock;

public class Demo01 {
	public static void main(String[] args) {
		// 创建共享账户
		Account acc = new Account("ICBC-110", 100000);
		// 启动取钱的两个线程
		new DrawThread(acc, "小明").start();
		new DrawThread(acc, "小红").start();
	}
}
