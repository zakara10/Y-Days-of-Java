package inheritance;

public class Employee {
	
	private int empid;
	private String ename;
	
	public Employee()
	{
		empid=1;
		ename="John";
	}
	public Employee(int eid,String enm)
	{
		empid=eid;
		ename=enm;
	}
	public String toString()
	{
		return empid+" "+ename;
	}

}
