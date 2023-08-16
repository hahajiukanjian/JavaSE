package com.dyt._5_Algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 冒泡排序算法
 */
public class Demo01 {

	public static void main(String[] args) {
		int[] arr = {5, 2, 3, 1};

		/*
								5, 2, 3, 1
		ii1		排序				 数组顺序			比较次数
		 0	 	 1				2, 3, 1, 5			   3
		 1		 2 				2, 1, 3, 5 			   2
		 2		 3    			1, 2, 3, 5			   1
		*/

		for (int ii1 = 0; ii1 < (arr.length - 1); ii1++) {
			for (int ii2 = 0; ii2 < (arr.length - ii1 - 1); ii2++) {
				/*
				通过if语句来判断是否需要交换位置。
				这是一个非常巧妙的方法。
					如果此时需要换位置，那么ii2仍然会指向两个数据中较大的数据的值
					如果此时不需要换位置，ii2也会指向两个数据中较大的值
				*/
				if (arr[ii2] > arr[ii2 + 1]) {
//					int temp = arr[ii2 + 1];
//					arr[ii2 + 1] = arr[ii2];
//					arr[ii2] = temp;
					ToolsExchange.exchange(arr, ii2, ii2 + 1);
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
