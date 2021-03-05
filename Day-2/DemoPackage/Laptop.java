package DemoPackage;

public class  Laptop {
	
	int lid;
	String lname,lmodel;
	
	public void init() {
		
		lid = 100;
		lname  = "Dell";
		lmodel = "Inspiron";
	}
	
	public void print() {
		System.out.print(" Laptop Id = " + lid + " Laptop name  =" + lname + " Laptop Model no " + lmodel);
	}
	
	public static void main(String[] args) {
		
		Laptop l = new Laptop();
		l.init();
		l.print();

	}

}