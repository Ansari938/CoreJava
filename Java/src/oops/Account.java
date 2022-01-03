package oops;

public class Account {
	private String Number;
    private String Accounttype;
    private double Balance;
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	public String getAccounttype() {
		return Accounttype;
	}
	public void setAccounttype(String accounttype) {
		Accounttype = accounttype;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
    public void withdrowl(double w) {
    Balance =Balance-w;
    System.out.println(Balance);
    }
    public void diposit(double d) {
		Balance=Balance+d;
System.out.println(Balance);
	}
    public void fundtransfe(double f) {
		Balance=Balance-f;
System.out.println(Balance);
	}
		public void paybill(double p) {
			Balance=Balance-p;
			System.out.println(Balance);

		}

	}


