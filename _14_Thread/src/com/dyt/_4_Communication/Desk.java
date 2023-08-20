package com.dyt._4_Communication;

import java.util.ArrayList;
import java.util.List;

public class Desk {
	List<String> list = new ArrayList<>();

	// 厨师生产包子
	public synchronized void put() {
		try {
			// 是谁在做包子
			String name = Thread.currentThread().getName();

			// 判断桌子上是否有包子
			if (list.size() == 0) {
				list.add(name + "做了一个包子");
				System.out.println(name + "做了一个包子");

				// 休眠两秒，假装为做了很长时间。方便在控制台输出时观看
				Thread.sleep(2000);

				// 做完包子后，需要唤醒其他的厨师或者吃货（即便这些线程没有wait，也可以进行唤醒的操作）。
				// 然后当前线程进入等待状态，释放锁
				this.notifyAll();
				this.wait();
			} else {
				this.notifyAll();
				this.wait();
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	// 吃货吃包子
	public synchronized void get() {
		try {
			// 是谁在做包子
			String name = Thread.currentThread().getName();

			// 判断桌子上是否有包子
			if (list.size() == 1) {
				System.out.println(name + "吃了" + list.get(0) + "的包子");
				list.clear();

				Thread.sleep(1000);

				this.notifyAll();
				this.wait();
			} else {
				this.notifyAll();
				this.wait();
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
