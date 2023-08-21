package com.dyt._1_IP;

import java.net.InetAddress;

public class Demo01 {
	public static void main(String[] args) throws Exception {
		// 1、获取本机IP地址对象
		InetAddress inetAddress = InetAddress.getLocalHost();
		System.out.println(inetAddress.getHostName());
		System.out.println(inetAddress.getHostAddress());

		// 2、获取baidu的域名和IP地址
		InetAddress inetAddress1 = InetAddress.getByName("www.baidu.com");
		System.out.println(inetAddress1.getHostName());
		System.out.println(inetAddress1.getHostAddress());
	}
}
