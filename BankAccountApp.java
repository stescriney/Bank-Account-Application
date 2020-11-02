import java.util.*;

public class BankAccountApp{
	public static void main(String args[]){

		double amount;
		double balance = 1000;
		String option;

		Scanner sc = new Scanner(System.in);
		BankAccount bA = new BankAccount();

		System.out.println("Please one of the below options:");
		System.out.println("Enter 1 to - Show Balance");
		System.out.println("Enter 2 to - Withdraw");
		System.out.println("Enter 3 to - Deposit");
		option = sc.nextLine();

		//Show Balance
		if (option.equalsIgnoreCase("1")){

				//Output
				System.out.println("Your balance is: " +balance);
			}else if (option.equalsIgnoreCase("2")){//withdrawl
				//input
				System.out.println("Please enter the amount you would like to withdraw: ");
				amount = sc.nextDouble();
				bA.setAmount(amount);
				bA.setBalance(balance);

				//Process
				bA.withdraw();
				balance = bA.getBalance();

				//Output
				System.out.println("Your new balance is: " +balance);
			}else if (option.equalsIgnoreCase("3")){//deposit
				//input
				System.out.println("Please enter the amount you would like to deposit: ");
				amount = sc.nextDouble();
				bA.setAmount(amount);
				bA.setBalance(balance);

				//Process
				bA.deposit();
				balance = bA.getBalance();

				//Output
				System.out.println("Your new balance is: " +balance);
		}
	}
}


