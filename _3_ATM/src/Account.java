public class Account {
	private String AccountIdCard;
	private String AccountName;
	private char   AccountSex;
	private String AccountPassword;
	private double AccountMoney;
	private double limit;

	public String getAccountIdCard() {
		return AccountIdCard;
	}

	public void setAccountIdCard(String accountIdCard) {
		AccountIdCard = accountIdCard;
	}

	public String getAccountName() {
		return AccountName + (AccountSex == '男' ? "先生" : "女士");
	}

	public void setAccountName(String accountName) {
		AccountName = accountName;
	}

	public char getAccountSex() {
		return AccountSex;
	}

	public void setAccountSex(char accountSex) {
		AccountSex = accountSex;
	}

	public String getAccountPassword() {
		return AccountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		AccountPassword = accountPassword;
	}

	public double getAccountMoney() {
		return AccountMoney;
	}

	public void setAccountMoney(double accountMoney) {
		AccountMoney = accountMoney;
	}

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}

}
