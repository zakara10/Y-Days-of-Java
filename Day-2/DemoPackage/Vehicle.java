package DemoPackage;

public class  Vehicle {
		int vno;
		String vname,com;
	
	public void init() {
		vno = 5647;
		vname = "Creta";
		com = "Mahindra";
	
	}
	
	public void print() {
		System.out.print("Vehicle Number = " + vno + " Vehicle name = " + vname + " Company " + com );
	}
	
	public static void main(String[] args) {
		
		Vehicle v = new Vehicle ();
		v.init();
		v.print();

	}

}