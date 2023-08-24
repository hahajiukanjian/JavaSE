package com.dyt._3_TCP3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ServerThread extends Thread {
	private Socket socket;

	public ServerThread(Socket socket) {
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
				sendMsgAll(msg);
			}
		} catch (Exception e) {
			Server.onLineSockets.remove(socket);
			System.out.println("客户端" + socket.getRemoteSocketAddress() + "已断连");
		}
	}

	private void sendMsgAll(String msg) throws Exception {
		for (Socket onLineSocket : Server.onLineSockets) {
			OutputStream os = onLineSocket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);

			dos.writeUTF(msg);
			dos.flush();
		}
	}
}
