package custom_exception;

public class InsufficientBalanceException extends Exception {
	InsufficientBalanceException() {
		super();
	}

	InsufficientBalanceException(String s) {
		super(s);
	}

}
