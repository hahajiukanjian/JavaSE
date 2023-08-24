package com.dyt._3_TCP2;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws Exception {
		// 1、创建ServerSocket对象，同时为服务端注册端口
		ServerSocket serverSocket = new ServerSocket(8888);

		// 2、将serverSocket接收到的对象赋值给Socket，进行实例化
		Socket socket = serverSocket.accept();

		// 3、获取socket接收到的字节输入流，并转成数据输入流
		InputStream is = socket.getInputStream();
		DataInputStream dis = new DataInputStream(is);

		while (true) {
			try {
				System.out.println(dis.readUTF());
			} catch (IOException e) {
				System.out.println("客户端" + socket.getRemoteSocketAddress() + "已断连");
				dis.close();
				socket.close();
				break;
			}
		}
	}
}
