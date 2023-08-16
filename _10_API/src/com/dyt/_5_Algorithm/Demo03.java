package com.dyt._5_Algorithm;

/**
 * 二分查找法
 */

public class Demo03 {

	public static void main(String[] args) {
		// 1、定义一个排好序的数组
		int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};

		// 2、输入一个数据，找到该数据在数组中的索引值，并输出索引值
		System.out.println(binarySearch(arr, 105));
	}

	private static int binarySearch(int[] arr, int val) {
		// 定义代表左右两边的索引
		int l = 0;
		int r = arr.length - 1;

		while (l <= r) {
			// 计算中间位置mid的值
			int mid = (l + r) / 2;
			if (arr[mid] > val) {
				r = mid - 1;
			} else if (arr[mid] < val) {
				l = mid + 1;
			} else {
				return mid;
			}
		}

		return -1;
	}

}
