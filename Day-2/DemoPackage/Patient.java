package DemoPackage;

public class Patient {
	
	int pid;
	String pname,pno;
	
	
	public void init() {
		
		pid = 101;
		pname = "Rohit";
		pno = "7894545616";
	
	}
	
	public void print() {
		System.out.print(" patient id = " + pid + " patient name  = " + pname + " patient contact name =  " + pno);
	}
	
	public static void main(String[] args) {
		
		Patient p = new Patient ();
		p.init();
		p.print();

	}

}