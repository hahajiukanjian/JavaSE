package Demo02;

public class Demo07 {

	public static int totalNumber;
	public static int lastBottleNumber;
	public static int lastCoverNumber;

	public static void main(String[] args) {
		// 啤酒问题：啤酒2元一瓶，4个盖子可以换一瓶，2个空瓶可以换一瓶，请问10元可以喝多少瓶？
		buy(10);
		System.out.println("啤酒数：" + totalNumber);
		System.out.println("瓶子数：" + lastBottleNumber);
		System.out.println("盖子数：" + lastCoverNumber);
	}

	public static void buy(int money) {
		// 先不考虑盖子和瓶子的问题。把所有的钱拿去买酒
		int buyNumber = money / 2;
		// 将最终购买的啤酒数累加
		totalNumber += buyNumber;

		// 计算盖子数和瓶子数
		int buyBottleNumber = buyNumber + lastBottleNumber;
		int buyCoverNumer   = buyNumber + lastCoverNumber;

		// 将2个瓶子换算成2元
		// if (buyBottleNumber >= 2)
			money = (buyBottleNumber / 2) * 2;
		// 将剩余的瓶子数赋值给last...以供递归时使用
		lastBottleNumber = buyBottleNumber % 2;

		// 将4个盖子换成2元
		// if (buyCoverNumer >= 4)
			money += (buyCoverNumer / 4) * 2;
		lastCoverNumber = buyCoverNumer % 4;

		if (money >= 2) {
			buy(money);
		}
	}

}
