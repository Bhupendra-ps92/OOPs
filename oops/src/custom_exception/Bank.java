package custom_exception;

public class Bank {
	double balance;

	Bank(double balance) {
		this.balance = balance;
	}

	public void Withdraw(int amt) throws InsufficientBalanceException {
		if (amt > this.balance) {
			throw new InsufficientBalanceException();
		} else {
			System.out.println(amt + ": money processing");
		}
	}

	public static void main(String[] args) throws InsufficientBalanceException {
		Bank b = new Bank(45000);
		b.Withdraw(60000);
	}

}
