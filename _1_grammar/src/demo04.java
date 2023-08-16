import java.util.Scanner;

public class demo04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入您的年龄");
		byte age = sc.nextByte();
		System.out.println(age);

		System.out.println("请输入您的姓名");
		String name = sc.next();
		System.out.println(name);
	}
}
