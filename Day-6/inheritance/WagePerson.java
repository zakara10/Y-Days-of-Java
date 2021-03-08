package inheritance;

public class WagePerson extends Employee{
	
	int hrs;
	double wages;

	public WagePerson() {
		hrs = 5;
		wages = 100;
	}
	
	public WagePerson(int eno, String nm,int hr,double wag) {
		super(eno,nm);
		hrs = hr;
		wages = wag;
	}
	
	public String toString()
	{
		return super.toString()+"  "+hrs+"  "+wages;
	}
	
	public double calculateSalary()
	{
		return  hrs*wages;
	}
	
public static void main(String[] args) {
		
		WagePerson w1=new WagePerson();
		System.out.println(w1);
		System.out.println("w1 = "+w1.calculateSalary());
		
		System.out.println("-------------------------------------------");
		
		WagePerson w2=new WagePerson(2,"Roshan",6,200);
		System.out.println("w2 = "+w2);
		System.out.println("Total salary = "+w2.calculateSalary());
}
}