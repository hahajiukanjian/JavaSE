package com.dyt._4_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01 {

	public static void main(String[] args) throws ParseException {
		/**
		 * Date 类的使用
		 *
		 * 构造函数：
		 * Date(); Date(long time);
		 * 		time 的作用与setTime一样
		 *
		 * 普通函数：
		 * getTime(); 获取当前时间的毫秒值
		 * setTime(long time); 设置Date实例对象的时间
		 */
		Date date01 = new Date();
		System.out.println(date01);

//		求当前时间往后两周是什么几号
		long time = date01.getTime() + 1000 * 60 * 60 * 24 * 14;
		Date date02 = new Date(time);
		System.out.println(time);
		System.out.println(date02);

//		求当前时间两周后 再 60天后是几号
		time += 1000L * 60 * 60 * 24 * 60;
		date01.setTime(time);
		System.out.println(date01);

		/**
		 * SimpleDateFormat 类的使用
		 * SimpleDateFormat类没有重写toString方法
		 *
		 * 常用构造函数
		 * SimpleDateFormat(String pattern);
		 * 		pattern:指定一个时间格式
		 */

//		将date01 和 time 日期format格式化成(2023年10月20日 23:02:11 周五 下午)的形式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
		String str1 = sdf.format(date01);
		System.out.println(str1);
		String str2 = sdf.format(time);
		System.out.println(str2);

//		将字符串类型的日期格式 转换为 Date日期格式
		Date date03 = sdf.parse(str2);
		System.out.println(date03);

	}

}
