package DemoPackage;

public class BankAccount {
		int bno,balance;
		String bname;
		
	public void setb(int balance) {
		this.balance = balance; // if parameter and attribute are name this will create shadowing problem so to
						   // avoid this problem we use "this" keyword.
	}
	
	public int getb() {
		return balance;
	}
	
	public void init() {
		bno = 1524;
		bname = "SBI";
		balance = 50000;
	
	}
	
	public void print() {
		System.out.print(" Bank number= " + bno + "\n Bank Name =" + bname + "\n Balance = " + balance);
	}
	
	public static void main(String[] args) {
		
		BankAccount b = new BankAccount ();
		b.init();
		b.print();
		
		b.setb(6000);
		System.out.print(" \nThe Updated balance : " + b.getb());

	}

}