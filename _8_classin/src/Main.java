import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		JFrame win = new JFrame("登录界面");
		JPanel pan = new JPanel();
		win.add(pan);

		JButton btn = new JButton("登录");
		pan.add(btn);

		win.setSize(499, 499);
		win.setLocationRelativeTo(null);
		win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		win.setVisible(true);

		pan.setSize(400, 400);
	}
}