package com.dyt._5_Algorithm;

import java.util.Arrays;

/**
 * 选择排序算法
 */
public class Demo02 {

	public static void main(String[] args) {
		int[] arr = {5, 2, 3, 1};
		/*
		是用ii1的位置的值与ii2遍历的位置进行比较，数组顺序从第0位开始慢慢变得有序

		ii1的值		排序		 数组顺序		比较次数
		   0		 1		1, 5, 3, 2		   3
		   1		 2  	1, 2, 5, 3		   2
		   2		 3 		1, 2, 3, 5		   1
		*/
//		for (int ii1 = 0; ii1 < (arr.length - 1); ii1++) {
//			for (int ii2 = ii1 + 1; ii2 < arr.length; ii2++) {
//				if (arr[ii1] > arr[ii2]) {
//					ToolsExchange.exchange(arr, ii1, ii2);
//				}
//			}
//		}

		/*
		提升性能，减少交换次数，在ii2的遍历中，只记录最小值的索引位置，与ii1进行比较，进行交换
		*/
		for (int ii1 = 0; ii1 < (arr.length - 1); ii1++) {
			int minIndex = ii1;
			for (int ii2 = ii1 + 1; ii2 < arr.length; ii2++) {
				if (arr[minIndex] > arr[ii2]) {
					minIndex = ii2;
				}
			}
			if (arr[ii1] > arr[minIndex]) {
				ToolsExchange.exchange(arr, ii1, minIndex);
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
