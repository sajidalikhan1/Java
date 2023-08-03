package Banking;



import java.util.Scanner;


class Account {
	double balance = 0;



	public void deposit(double amount) {
		balance += amount;
	}

	public boolean withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			return true;
		} else {
			return false;

		}
	}

	public double getBalance() {
		return balance;
	}
}

class SavingsAccount extends Account {
	public void calculateInterest() {
		double interest = balance * 0.07;
		balance += interest;
	}

	public void process() {
    	System.out.println("AccountType : SavingsAccount");
    	
    	while (true) {
            System.out.println("Select the option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            
            Scanner scanner= new Scanner(System.in);

             int choice = scanner.nextInt();
             switch(choice) {
             case 1:
            	 System.out.print("Deposit: ");
                 double depositAmount = scanner.nextDouble();
                 deposit(depositAmount);
                 System.out.println("Balance: " + getBalance());
            	 break;
            
             case 2:
            	 System.out.print("Withdrawal amount: ");
                 double withdrawalamount = scanner.nextDouble();
                 
                 if(withdraw(withdrawalamount)) {
                 	 System.out.println("Balance : " + getBalance());
                 	 calculateInterest();
                 	 System.out.println("Account Balance after interest: " + getBalance());
                 } else {
                     System.out.println("Insufficient balance: ");
                 }
                 break;
            	 case 3:
            		 scanner.close();
            		 return;
            	default:
            		 System.out.println("Invalid choice.");
             }
    	}
	}
}


class CheckingAccount extends Account {
//	public void deductFee() { 
//		//
//    }
	public void process() {
    	System.out.println("AccountType : SavingsAccount");
    	
    	while (true) {
            System.out.println("Select the option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            
            Scanner scanner= new Scanner(System.in);

             int choice = scanner.nextInt();
             switch(choice) {
             case 1:
            	 System.out.print("Deposit: ");
                 double depositAmount = scanner.nextDouble();
                 deposit(depositAmount);
                 System.out.println("Balance: " + getBalance());
            	 break;
            
             case 2:
            	 System.out.println("Enter the amount to withdraw: ");
 				double withdrawAmount = scanner.nextDouble();
 				if (withdraw(withdrawAmount)) {
 					System.out.println("Balance: " + getBalance());
 					if (withdrawAmount > 50000) {
 						double feePer10000 = 5;
 				        double amountExceedingLimit = withdrawAmount - 50000;
 				        double num_of_10000s = amountExceedingLimit / 10000;
 				        double fee = Math.floor(num_of_10000s) * feePer10000;
 				        balance -= fee;
 				        System.out.println("Balance after deduction: " + getBalance());
 	                }
 	            } else {
 	                System.out.println("Insufficient balance.");
 	            
 				}
 				break;
            	 case 3:
            		 scanner.close();
            		 return;
            	default:
            		 System.out.println("Invalid choice.");
             }
    	}


}
}

public class BankingProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account account;
		int choice;

		System.out.println("Choose the account type:");
		System.out.println("1. SavingsAccount");
		System.out.println("2. CheckingAccount");
		choice = scanner.nextInt();

		if (choice == 1) {
			 SavingsAccount account1 = new SavingsAccount();
			account1.process();
		} else if (choice == 2) {
			CheckingAccount account1 = new CheckingAccount();
			account1.process();
		} else {
			System.out.println("Invalid choice.");
		}
	}
}

