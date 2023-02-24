package HomeWork5;

public class BancAccountHM {
	double balance;
	
	void PopolnenieScheta (double sum) {
		balance += sum;
		
	}
	void SnyatieSoScheta (double deduct) {
		balance -= deduct;
		
	}
	void Info () {
		System.out.println("Balance: " + balance);
	}
	


}
