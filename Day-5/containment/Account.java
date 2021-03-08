package containment;

public class Account {
	
	int accno;
	String name;
	Address add;
	
	public Account() {
		accno = 154854;
		name = "Roshan";
		add = new Address();
	}
	
	public Account(int a,String n,Address ad) {
		accno = a;
		name = n;
		add = ad;
	}
	
	public String toString() {
		return accno+" "+name +" "+add;
	}
	
	

}



class Address {
	
	String city;
	int pinno;
	
	public Address() {
	
		city="Nashik";
		pinno=411011;
	}
	public Address(String ct,int pn) {
		
		city=ct;
		pinno=pn;
	}
	public String toString()
	{
		return city+"  "+pinno;
	}
}
