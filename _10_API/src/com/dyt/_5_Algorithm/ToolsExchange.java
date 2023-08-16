package com.dyt._5_Algorithm;

public class ToolsExchange {
	public static void exchange(int[] arr, int index1, int index2) {
		int temp = arr[index2];
		arr[index2] = arr[index1];
		arr[index1] = temp;
	}
}
