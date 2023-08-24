package com.dyt._3_TCP2;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws Exception {
		// 1、创建socket，并同时请求与服务程序的连接
		Socket socket = new Socket("127.0.0.1", 8888);

		// 2、从socket中得到一个字节输出流，用来发送数据到服务端
		OutputStream os = socket.getOutputStream();

		// 3、将字节输出流包装成数据输出流，方便发送数据
		DataOutputStream dos = new DataOutputStream(os);

		// 4、发送数据
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("请说：");
			String msg = scanner.next();
			if (msg.equals("exit")) {
				System.out.println("客户端即将退出");
				dos.close();
				socket.close();
				break;
			}
			dos.writeUTF(msg);
			dos.flush();
		}
	}
}
