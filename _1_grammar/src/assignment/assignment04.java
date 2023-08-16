package assignment;

/*
打印
   *
  ***
 *****
*******

		行号			列（空格）n-i 	列（星星）2*i-1
		 1			     3		   		  1
		 2			     2		   		  3
		 3			     1		   		  5
		 4			     0		   		  7

*/

public class assignment04 {
	public static void main(String[] args) {
		printStar(10);
	}

	public static void printStar(int number) {
		// 控制行号
		for (int ii = 1; ii <= number; ii++) {
			// 打印空格
			for (int jj = 1; jj <= number - ii; jj++) {
				System.out.print(" ");
			}
			// 打印星星
			for (int jj = 1; jj <= 2 * ii - 1; jj++) {
				System.out.print((jj % 2) == 0 ? " " : "*");
			}
			System.out.println();
		}
	}
}
