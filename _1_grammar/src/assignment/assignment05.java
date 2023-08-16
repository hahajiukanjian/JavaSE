package assignment;

/*
 * 双色球实现
 * 6个红球(范围在1-33) 1个蓝球(范围在1-16)
 * 将用户选择的双色球与
 * 系统生成的双色球进行对比
 * 判断中奖的金额
 */

import java.util.Scanner;

public class assignment05 {

	public static void main(String[] args) {

		int[] userNumbers = userSelectNumbers();
		int[] sysmNumbers = sysmRandomNumbers();

	}

	private static int[] sysmRandomNumbers() {
		return new int[0];
	}

	public static int[] userSelectNumbers() {
		Scanner sc = new Scanner(System.in);

		int[] Numbers = new int[7];
		//    Numbers = [0, 0, 0, 0, 0, 0, 0]

		// 获取用户选择的球号，将其存入Numbers数组中
		int number;
		for (int ii = 0; ii < Numbers.length - 1; ii++) {
			// 如果用户选择的红色球号不正确，需要通过循环重新进行选择
			while (true) {
				// 获取用户选择的红色球号
				System.out.print("请选择第" + (ii + 1) + "号红色球：");
				number = sc.nextInt();

				// 判断用户选择的红色球号是否符合标准（不能重复，在0-33之内）
				if (number > 33 || number < 1) {
					System.out.println("您选择的红色球号不在范围内（1 - 33）");
				}
				// 如果符合范围标准，判断是否已经选择过了
				else if (isSelected(Numbers, number)) {
					System.out.println("您选择的红色球号" + number + "已经被选择过了");
				}
				else {
					Numbers[ii] = number;
					break;
				}
			}
		}

		while (true) {
			// 获取用户选择的红色球号
			System.out.print("请选择第1号蓝色球：");
			number = sc.nextInt();

			// 判断用户选择的红色球号是否符合标准（不能重复，在0-33之内）
			if (number > 16 || number < 1) {
				System.out.println("您选择的蓝色球号不在范围内（1 - 33）");
			}
			else {
				Numbers[6] = number;
				break;
			}
		}

		return Numbers;
	}

	private static boolean isSelected(int[] Numbers, int number) {
		for (int ii = 0; ii < Numbers.length; ii++) {
			if (Numbers[ii] == 0)
				break;
			if (number == Numbers[ii])
				return true;
		}
		return false;
	}

}
