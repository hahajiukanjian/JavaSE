package com.dyt._3_TCP1;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws Exception {
		// 1、创建socket，并同时请求与服务程序的连接
		Socket socket = new Socket("127.0.0.1", 8888);

		// 2、从socket中得到一个字节输出流，用来发送数据到服务端
		OutputStream os = socket.getOutputStream();

		// 3、将字节输出流包装成数据输出流，方便发送数据
		DataOutputStream dos = new DataOutputStream(os);

		// 4、发送数据
		dos.writeUTF("在一起，就可以\t遥遥领先");
		System.out.println("发送完毕");

		dos.close();
		socket.close();
	}
}
