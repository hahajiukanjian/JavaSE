import java.util.Random;
import java.util.Scanner;

public class demo08_array2 {
	public static void main(String[] args) {
		int[] codes = new int[5];

		// 输入5名员工的工号
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < codes.length; i++) {
			System.out.print("请输入第" + (i + 1) + "号员工的工号:");
			codes[i] = scanner.nextInt();
		}
		
		System.out.println();

		System.out.print("工号为：");
		for (int i = 0; i < codes.length; i++)
			System.out.print(codes[i] + "  ");
		
		System.out.println();

		// 随机打乱顺序
		Random random = new Random();
		int temp;
		for (int i = 0; i < codes.length; i++) {
			int index = random.nextInt(5);
			temp = codes[i];
			codes[i] = codes[index];
			codes[index] = temp;
		}

		System.out.print("出场顺序为：");
		for (int i = 0; i < codes.length; i++)
			System.out.print(codes[i] + "  ");

		System.out.println();
	}
}

















































































