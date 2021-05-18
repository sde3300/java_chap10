package java_chap10;

public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientExeption{
		if(balance < money) {
//			throw : 강제적으로 예외를 발생시키는 명령어
			throw new BalanceInsufficientExeption("잔고부족 : " + (money-balance)+ "모자람");
		}
		balance -= money;
	}
	
}
