import java.util.Random;
import java.util.Scanner;

public class demo06_Random {
	public static void main(String[] args) {
		Random random = new Random();

//		for (int i = 0; i < 20; i ++) {
//			int ii = random.nextInt(10);
//			System.out.println(ii);
//		}

		int keyNumber = random.nextInt(100) + 1;

		Scanner scanner = new Scanner(System.in);

/*
		int inputNumber = scanner.nextInt();

		while(inputNumber != keyNumber) {
			if (inputNumber > keyNumber)
				System.out.println("猜大啦，继续猜吧");
			if (inputNumber < keyNumber)
				System.out.println("猜小啦，继续猜吧");

			inputNumber = scanner.nextInt();
		}
		System.out.println("恭喜你猜对啦🎉");
*/

		while (true) {
			int inputNumber = scanner.nextInt();
			if (inputNumber > keyNumber) {
				System.out.println("猜大啦，继续猜吧❌❌❌❌");
			}
			else if (inputNumber < keyNumber) {
				System.out.println("猜小啦，继续猜吧❌❌❌❌");
			}
			else {
				System.out.println("恭喜你猜对啦🎉🎉🎉🎉");
				break;
			}
		}

	}
}
