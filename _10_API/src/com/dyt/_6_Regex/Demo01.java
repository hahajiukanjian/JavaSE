package com.dyt._6_Regex;

public class Demo01 {

	public static void main(String[] args) {
		System.out.println(chechQQ1(null));
		System.out.println(chechQQ1(""));
		System.out.println(chechQQ1("02919212"));
		System.out.println(chechQQ1("2311as41123"));
		System.out.println(chechQQ1("23112341123"));

		System.out.println("---------------------------");

		System.out.println(chechQQ2(null));
		System.out.println(chechQQ2(""));
		System.out.println(chechQQ2("02919212"));
		System.out.println(chechQQ2("2311as41123"));
		System.out.println(chechQQ2("23112341123"));
	}

	private static boolean chechQQ2(String qq) {
		return qq != null && qq.matches("[1-9]\\d{5,19}");
	}

	private static boolean chechQQ1(String qq) {
		// 1、传入的字符串不能为null，qq不能以0开头，不能小于6位，大于20位
		if (qq == null || qq.startsWith("0") || qq.length() < 6 || qq.length() > 20)
			return false;

		// 2、qq当中只能有数字，不能有字符
		for (int ii = 0; ii < qq.length(); ii++) {
			char ch = qq.charAt(ii);
			if (ch > '9' || ch < '0')
				return false;
		}

		return true;
	}

}
