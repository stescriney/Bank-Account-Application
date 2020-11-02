public class BankAccount{

	private double amount;
	private double balance;

	public void values(){
		amount = 0;
		balance = 0;
	}

	public void setAmount(double amount){
		this.amount = amount;
	}

	public void setBalance(double balance){
		this.balance = balance;
	}

	public void deposit(){
		balance = balance + amount;
	}

	public void withdraw(){
		balance = balance - amount;
	}

	public double getBalance(){
		return balance;
	}



}


