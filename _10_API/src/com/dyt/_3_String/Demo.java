package com.dyt._3_String;

public class Demo {
	public static void main(String[] args) {

//		String rs = "";
//		for (int ii = 0; ii < 1000000; ii++) {
//			rs = rs + "abc";
//		}
//		System.out.println(rs);

		StringBuilder sb = new StringBuilder("");
		for (int ii = 0; ii < 1000000; ii++) {
//			sb = new StringBuilder(sb + "abc");
			sb.append("abc");
		}
		System.out.println(sb);

	}
}
