import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
	private ArrayList<Account> accountList = new ArrayList<>();
	private Account accountlogin = new Account();
	private Scanner scanner = new Scanner(System.in);

	public void start() {
		while (true) {
			System.out.println("=========欢迎您使用ATM系统=========");
			System.out.println("1、用户登录");
			System.out.println("2、用户开户");
			System.out.print("请选择：");
			int command = scanner.nextInt();
			switch (command) {
				case 1:
					AccountLogin();
					break;
				case 2:
					AccountCreate();
					break;
				default:
					System.out.println("没有该操作❌❌❌");
			}
		}
	}

	private void AccountLogin() {

		int conn = 0;
		if (accountList.isEmpty()) {
			System.out.println("当前系统无用户，请先开户吧");
			return;
		}

		System.out.println("=============用户登录=============");

		while (true) {
			System.out.print("请输入您的卡号：");
			String ID = scanner.next();
			Account acc = getAccountByIDCard(ID);
			if (acc == null) {
				System.out.println("您输入的卡号不存在，是否要继续登录（1-继续，2-退出登录）");
				conn = scanner.nextInt();
				if (conn == 2) break;
			} else {
				while (true) {
					System.out.print("请输入您的登录密码：");
					String password = scanner.next();
					if (acc.getAccountPassword().equals(password)) {
						accountlogin = acc;
						System.out.println("欢迎" + acc.getAccountName() + "登录成功，您的卡号是：" + acc.getAccountIdCard());
						// 登录界面展示
						ShowLogin();
						return;
					} else {
						System.out.println("您输入的密码不正确");
					}
				}
			}
		}

	}

	private void ShowLogin() {

		while (true) {
			System.out.println("=========" + accountlogin.getAccountName() + "您可进行一下操作=========");
			System.out.println("1、账户信息");
			System.out.println("2、转账");
			System.out.println("3、取款");
			System.out.println("4、存款");
			System.out.println("5、更改密码");
			System.out.println("6、退出登录");
			System.out.println("7、注销账户");
			System.out.print("请选择：");
			int command = scanner.nextInt();

			switch (command) {
				case 1:
					// 账户信息
					ShowAccount();
					break;
				case 2:
					// 转账
					break;
				case 3:
					// 取款
					break;
				case 4:
					// 存款
					break;
				case 5:
					// 更改密码
					break;
				case 6:
					// 退出登录
					System.out.println(accountlogin.getAccountName() + "欢迎下次使用");
					return;
				case 7:
					// 注销账户
					break;
				default:
					System.out.println("您选择的操作不存在");
			}
		}


	}

	private void ShowAccount() {

		System.out.println("=========" + accountlogin.getAccountName() + "您的账户信息为=========");
		System.out.println("户主：" + accountlogin.getAccountName());
		System.out.println("卡号：" + accountlogin.getAccountIdCard());
		System.out.println("性别：" + accountlogin.getAccountSex());
		System.out.println("余额：" + accountlogin.getAccountMoney());
		System.out.println("每日限额：" + accountlogin.getLimit());

	}

	private void AccountCreate() {
		System.out.println("=============用户开户=============");

		Account acc = new Account();

		// 接收用户名
		System.out.print("请输入您的用户名：");
		String name = scanner.next();
		acc.setAccountName(name);

		// 接收性别
		while (true) {
			System.out.print("请输入您的性别：");
			char sex = scanner.next().charAt(0);
			if (sex == '男' || sex == '女') {
				acc.setAccountSex(sex);
				break;
			} else {
				System.out.println("输入性别有误，请重新输入");
			}
		}

		// 接收密码
		while (true) {
			System.out.print("请输入您的密码：");
			String password1 = scanner.next();

			System.out.print("请再次输入您的密码：");
			String password2 = scanner.next();
			if (password1.equals(password2)) {
				acc.setAccountPassword(password1);
				break;
			} else {
				System.out.println("两次密码不一致，请重新输入");
			}
		}

		// 接收限额
		System.out.print("请输入您的每日限额：");
		double limit = scanner.nextDouble();
		acc.setLimit(limit);

		// 生成卡号，用系统自动生成，不能与其他用户的卡号重复
		String ID = createIDCard();
		acc.setAccountIdCard(ID);

		accountList.add(acc);
		System.out.println("恭喜您" + acc.getAccountName() + "开户成功，您的卡号是：" + acc.getAccountIdCard());
	}

	private String createIDCard() {

		while (true) {
			String ID = "";
			Random random = new Random();
			for (int ii = 0; ii < 8; ii++) {
				ID += random.nextInt(10); // 0 - 9
			}
			// 判断当前卡号是否存在
			Account acc = getAccountByIDCard(ID);
			if (acc == null) {
				return ID;
			}
		}

	}

	private Account getAccountByIDCard(String ID) {
		for (int ii = 0; ii < accountList.size(); ii++) {
			Account acc = accountList.get(ii);
			if (acc.getAccountIdCard().equals(ID)) {
				return acc;
			}
		}

		return null;
	}

}