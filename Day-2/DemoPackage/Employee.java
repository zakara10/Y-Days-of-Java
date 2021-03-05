package DemoPackage;

public class   Employee {
		int eid;
		String ename, eno;
	
	public void init() {
		eid = 101;
		ename = "Roshan";
		eno = "7020815748";
	
	}
	
	public void print() {
		System.out.print(" Employee Id = " + eid + " Name =" + ename + " Employee Number " + eno );
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.init();
		e.print();

	}

}