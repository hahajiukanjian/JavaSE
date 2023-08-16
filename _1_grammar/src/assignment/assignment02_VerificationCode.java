package assignment;

import java.util.Random;

public class assignment02_VerificationCode {
	public static void main(String[] args) {

		String verification = Verification();
		System.out.println(verification);

	}

	/*
	 *
	 */

	public static String Verification() {
		Random random = new Random();
		// 验证码
		String verion = "";

		// 随机生成三个数 0 1 2 0-数字 1-小写字母 2-大写字母
		int ii = 0;
		while (ii < 4) {
			int randomNumber = random.nextInt(3);

			switch (randomNumber) {
				case 0:
					verion += random.nextInt(10);
					break;
				case 1:
					char tempCh1 = (char) (random.nextInt(26) + 97);
					verion += tempCh1;
					break;
				case 2:
					char tempCh2 = (char) (random.nextInt(26) + 65);
					verion += tempCh2;
					break;
			}
			ii ++;
		}

		return verion;
	}
}