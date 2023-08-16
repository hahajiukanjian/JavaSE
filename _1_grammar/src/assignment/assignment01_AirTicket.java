package assignment;

import java.util.Scanner;

public class assignment01_AirTicket {
	public static void main(String[] args) {
		
		// 用户购买机票时，机票原价会按照淡季、旺季，头等舱还是经济舱的情况进行相应的优惠，
		// 优惠方案如下：5-10月为旺季，头等舱9折，经济舱8.5折；
		// 11月到来年4月为淡季，头等舱7折，经济舱6.5折，
		// 请开发程序计算出用户当前机票的优惠价。

		/*
		 * 获取当前月份 购买头等舱还是经济舱
		 * pos == 1 经济舱  == 2 头等舱
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入您想要去的月份：");
		int month = scanner.nextInt();
		System.out.println();
		System.out.print("请输入您想要乘坐的舱：");
		String pos = scanner.next();
		System.out.println();

		System.out.println("您需要支付的价格为：" + Preferential(pos, month, 1000));

	}

	public static double Preferential(String pos, int month, double price) {
		if ((month >= 1 && month < 5) || (month > 10 && month <= 12)) {

			switch (pos) {
				case "头等舱":
					System.out.println("当前为旅游淡季。您选择头等舱，将获得7折的优惠");
					price *= 0.7;
					break;
				case "经济舱":
					System.out.println("当前为旅游淡季。您选择经济舱，将获得6.5折的优惠");
					price *= 0.65;
					break;
				default:
					System.out.println("输入的座位不正确");
			}

			return price;
		}

		else if ((month >= 5) && (month <= 10)) {

			switch (pos) {
				case "头等舱":
					System.out.println("当前为旅游旺季。您选择头等舱，将获得9折的优惠");
					price *= 0.9;
					break;
				case "经济舱":
					System.out.println("当前为旅游旺季。您选择经济舱，将获得8.5折的优惠");
					price *= 0.85;
					break;
				default:
					System.out.println("输入的座位不正确");
			}

			return price;
		}
		else {
			System.out.println("输入的月份不合理🙅");
			return -1;
		}
	}
}
