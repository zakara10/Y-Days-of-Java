package toString_constructor_vargs_static;

public class BankAccount {
	//data members/instance fields/variables/attributes
		private  int accno;
		private  String name;
		private  double balance;
		
		// single copy is created per class 
		private static  double rateofInt; //class variable
		
		static int count=0;
		//static  block	
		static {
			rateofInt=9.5;
		}
		
		public BankAccount() {
			System.out.println("default constructor called...");
			accno = 101454;
			name = "Roshan";
			balance = 50000;
			count++;
		}
		public BankAccount(int no,String nm,double b) {
			System.out.println("paramaeterized constructor called...");
			accno = no;
			name = nm;
			balance = b;
			count++;
		}
		//static method can be called using class name
		public static void printRateofInt()
		{
			System.out.println("Rate of Interest = "+rateofInt);
		}
		//static method can be called using class name
		public static void printCount()
		{
			System.out.println("Count = "+count);
		}
		//non-static method -- called using object
		public void printBankAccount()
		{
			System.out.println("Accno = "+accno+" Name = "+name+" Balance = "+balance);
		}
		
		
	
	public static void main(String[] args) {
		
		BankAccount.printRateofInt();
		
		BankAccount.printCount();

		BankAccount b1=new BankAccount();
		b1.printBankAccount();
		
		BankAccount b2=new BankAccount();
		
		BankAccount b3=new BankAccount(21011,"Rahul",80000);
		
		BankAccount.printCount();
		
	}

}
