package com.dyt._3_TCP3;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class ClientThread extends Thread {
	private Socket socket;

	public ClientThread(Socket socket) {
		// 客户端1自己的socket
		this.socket = socket;
	}

	@Override
	public void run() {
		try (
				InputStream is = socket.getInputStream();
				DataInputStream dis = new DataInputStream(is);
		) {
			while (true) {
				String msg = dis.readUTF();
				System.out.println("接收到" + socket.getRemoteSocketAddress() +
						"的消息：" + msg);
			}
		} catch (Exception e) {
			Server.onLineSockets.remove(socket);
			System.out.println("客户端" + socket.getRemoteSocketAddress() + "已断连");
		}
	}
}
