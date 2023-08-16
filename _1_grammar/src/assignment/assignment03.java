package assignment;

public class assignment03 {
	public static void main(String[] args) {

		String enc = encrypt(8346);
		System.out.println("最终的加密结果为：" + enc);

	}

	public static String encrypt(int number) {
		// 1. 分割传入的一串数字为单个数字
		int[] numbers = Split(number);

		// 2. 对每个数字进行加密处理
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (numbers[i] + 5) % 10;
		}

		// 3. 反转数组
		Reversal(numbers);

		// 4. 将数组内容拼接到字符串中返回
		String enc = "";
		for (int ii = 0; ii < numbers.length; ii++) {
			enc += numbers[ii];
		}

		return enc;
	}

	private static void Reversal(int[] numbers) {
		int temp = 0;
		for (int ii = 0; ii < (numbers.length / 2); ii++) {
			temp = numbers[ii];
			numbers[ii] = numbers[numbers.length - ii - 1];
			numbers[numbers.length - ii - 1] = temp;
		}
	}

	public static int[] Split(int number) {
		// number = 1983
		int[] SplitNumber = new int[4];

		SplitNumber[0] = number / 1000;
		SplitNumber[1] = (number / 100) % 10;
		SplitNumber[2] = (number / 10) % 10;
		SplitNumber[3] = number % 10;

		return SplitNumber;
	}
}
