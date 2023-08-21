package com.dyt._2_UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
	public static void main(String[] args) {
		// 1、创建接收数据的socket对象
		try (DatagramSocket socket = new DatagramSocket(8888)) {
			byte[] bytes = new byte[1024 * 64];

			// 2、创建存放接收数据的对象
			DatagramPacket packet = new DatagramPacket(bytes, bytes.length);

			// 3、接收客户端发送过来的数据
			socket.receive(packet);

			int len = packet.getLength();
			System.out.println(new String(bytes, 0, len));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
