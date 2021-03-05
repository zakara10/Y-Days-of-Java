package DemoPackage;

public class BankLoan  {
		
		String name , branch,ano;
	
	
	public void init() {
		ano = "1524-4558-4555";
		name = "Rohit";
		branch = "SBI";
	}
	
	public void print() {
		System.out.print(" Account No = " + ano + " Name  =" + name + " Branch " + branch);
	}
	
	public static void main(String[] args) {
		
		BankLoan b = new BankLoan ();
		b.init();
		b.print();

	}

}