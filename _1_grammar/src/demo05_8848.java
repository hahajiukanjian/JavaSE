public class demo05_8848 {
	public static void main(String[] args) {
		int len = 1;
		int h_len = 0;
		int cnt = 0;
		
		while (len < 88488600) {
//			h_len = h_len + len;
//			len = h_len;
//			System.out.println(len);
			len *= 2;
			cnt++;
		}

		System.out.println(cnt);
		System.out.println(len);

	}
}
