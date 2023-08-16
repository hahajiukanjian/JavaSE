package Demo02;

/*
 * 猴子第一天摘下若干桃子，当即吃了一半，觉得好不过癮，于是又多吃了一个第二天又吃了前天剩余桃子数量的一半，觉得好不过瘾，于是又多吃了一个以后每天都是吃前天剩余批子数量的一半，觉得好不过糖，又多吃了一个等到第10天的时候发现桃子只有1个了。
 * 需求：请问猴子第一天摘了多少个桃子？
 */

public class Demo03 {
	public static void main(String[] args) {

		// 公式：	[f(x)] - [f(x) / 2 - 1] = [f(x+1)]
		// 			昨天		  吃了的		 今天
		// 化简：	2f(x) - f(x) -2 = 2f(x+1)
		// 		   f(x) = 2f(x+1) + 2

		System.out.println(f(10));
		System.out.println(f(9));
		System.out.println(f(1));
		System.out.println(f(2));
		System.out.println(f(3));
	}

	public static int f(int x) {
		if (x == 10) return 1;

		else return 2 * f(x + 1) + 2;
	}
}
