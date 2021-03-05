package DemoPackage;

public class  Cement {
		int id;
		String name , type;
	
	public void init() {
		id = 101;
		name = "Abuja Cemnt";
		type = "House Construction";
	}
	
	public void print() {
		System.out.print(" Cement id = " + id + " Cement Name = " + name  + " Type  " + type);
	}
	
	public static void main(String[] args) {
		
		Cement c = new Cement();
		c.init();
		c.print();

	}

}