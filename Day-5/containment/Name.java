package containment;

public class Name {
	
	String fname;
	String mname;
	String lname;
	
	public Name() {
		fname = "Roshan";
		mname = "Anil";
		lname = "Kumar";
	}
	
	public Name(String fn, String mn,String ln) {
		fname = fn;
		mname = mn;
		lname = ln;
	}
	
	public String toString() {
		return fname+" "+mname+" "+lname;
	}

}
