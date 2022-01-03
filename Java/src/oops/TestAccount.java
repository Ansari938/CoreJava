package oops;

public class TestAccount {
	public static void main(String[] args) {
		Account a= new Account();
		a.withdrowl(500);
		a.diposit(700);
		a.paybill(500);
		a.fundtransfe(700);
		a.setNumber("423562646246");
		a.setAccounttype("saving");
		a.setBalance(2000);
	System.out.println(a.getAccounttype());
	System.out.println(a.getNumber());
	System.out.println(a.getBalance());
	}
}