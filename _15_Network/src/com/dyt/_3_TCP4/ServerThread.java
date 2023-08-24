package com.dyt._3_TCP4;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class ServerThread extends Thread {
	private Socket socket;

	public ServerThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		InputStream is = null;
		try	{
			OutputStream os = socket.getOutputStream();
			PrintStream ps = new PrintStream(os);
			ps.println("HTTP/1.1 200 OK");
			ps.println("Content-Type:text/html;charset=UTF-8");
			ps.println();
			ps.println("<div style='color:red;font:120px;text-align:center'>丁永涛8888</div>");

			ps.close();
			socket.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
