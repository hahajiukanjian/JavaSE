package com.dyt._3_String;

public class Demo01 {

	public static void main(String[] args) {
		System.out.println(PrintArryFormat(new int[]{11, 22, 33}));
	}

	public static String PrintArryFormat(int[] arr) {
		if (arr == null) return null;

		StringBuilder sb = new StringBuilder("");

		for (int ii = 0; ii < arr.length; ii++) {
			sb = (ii == 0) ?
					sb.append("[").append(arr[ii]).append(",") :
					(ii == arr.length - 1) ?
							sb.append(arr[ii]).append("]") :
							sb.append(arr[ii]).append(",");
		}

		return sb.toString();
	}

}
