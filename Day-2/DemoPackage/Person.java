package DemoPackage;

public class  Person {
	 
	String pname,paddress,pno;
	
	public void init() {
		
		pname = "Roshan";
		paddress = "Pune";
		pno = "702081258";
	
	}
	
	public void print() {
		System.out.print(" Name = " + pname + " Address = " + paddress + " Number  " + pno );
	}
	
	public static void main(String[] args) {
		
		Person p  = new  Person();
		p.init();
		p.print();

	}

}