package DemoPackage;

public class Mobile {
	
	int id;
	String company,name;
	
	public void init() {
		
		id = 101;
		company = "Samsung";
		name  = "M31";
	}
	
	public void print() {
		System.out.print(" ID = " + id + " company = " + company + " name = " + name );
	}
	
	public static void main(String[] args) {
		
		Mobile m = new Mobile ();
		m.init();
		m.print();

	}

}
