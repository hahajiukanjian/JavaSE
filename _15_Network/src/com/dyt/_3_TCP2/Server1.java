package com.dyt._3_TCP2;

import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
	public static void main(String[] args) throws Exception {
		// 1、创建ServerSocket对象，同时为服务端注册端口
		ServerSocket serverSocket = new ServerSocket(8888);

		while (true) {
			// 2、将serverSocket接收到的对象赋值给Socket，进行实例化
			Socket socket = serverSocket.accept();

			// 3、将accept接收到的socket对象交接给一个线程去处理
			new MyThread(socket).start();
		}
	}
}
