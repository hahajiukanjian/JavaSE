package com.dyt._2_UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
	public static void main(String[] args) {
		// 1、创建发送数据包的对象
		try (DatagramSocket socket = new DatagramSocket()) {

			byte[] bytes = "我是客户端，现在我要告诉你，Java是这个世界上第二好的语言，至于第一好是谁，我也不知道".getBytes();
			// 2、创建一个对象，能够保存要发送的数据
			DatagramPacket packet = new DatagramPacket(bytes, bytes.length,
					InetAddress.getLocalHost(), 8888);

			// 3、发送数据到服务端
			socket.send(packet);

			System.out.println("发送完毕");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}
}
