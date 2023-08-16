package com.dyt._3_String;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
//		System.exit(0);
//		System.out.println("hahah");
		Runtime r = Runtime.getRuntime();
		System.out.println(r.availableProcessors());
		System.out.println(r.totalMemory() / 1024.0 / 1024.0 + "MB");
		System.out.println(r.freeMemory() / 1024.0 / 1024.0 + "MB");
		r.exec("ls");
	}

}
