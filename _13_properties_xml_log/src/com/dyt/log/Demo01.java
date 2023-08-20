package com.dyt.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo01 {

	public static final Logger LOGGER = LoggerFactory.getLogger("LogBackTest");

	public static void main(String[] args) {
		while (true) {
			try {
				LOGGER.info("chu方法开始执行了");
				System.out.println(chu(10, 0));
				LOGGER.info("chu方法执行成功了");
			} catch (Exception e) {
				LOGGER.error("chu方法执行失败了");
			}
		}
	}

	public static int chu(int n, int m) {
		LOGGER.debug("参数n：" + n);
		LOGGER.debug("参数m：" + m);
		int a = n / m;
		LOGGER.info("结果a：" + a);
		return a;
	}

}
