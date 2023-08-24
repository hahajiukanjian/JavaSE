package com.dyt._3_TCP2;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class MyThread extends Thread {
	private Socket socket;

	public MyThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try (
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
		) {
			while (true) {
				System.out.println(dis.readUTF());
			}
		} catch (Exception e) {
			System.out.println("客户端" + socket.getRemoteSocketAddress() + "已断连");
		}
	}
}
