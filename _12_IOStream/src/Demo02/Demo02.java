package Demo02;

public class Demo02 {
	public static void main(String[] args) {
		System.out.println("5的阶乘是：" + f(5));
	}

	private static int f(int n) {
		if (n == 1) {
			return 1;
		} else {
			return f(n-1) * n;
		}
	}
}
