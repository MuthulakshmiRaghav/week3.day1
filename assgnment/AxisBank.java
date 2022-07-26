package week3.day1.assgnment;

public class AxisBank extends BankInfo{
	
	public void deposit()
	{
		System.out.println("Override the deposit");
	}

	public static void main(String[] args) {
		AxisBank bank = new AxisBank();
		bank.deposit();
		
	}
}
