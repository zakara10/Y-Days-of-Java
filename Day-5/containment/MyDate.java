package containment;

public class MyDate {
	
	int day,month,year;

	public MyDate() {
		day = 10;
		month = 8;
		year= 2000;
	}
	
	public MyDate(int d, int m,int y) {
		day =d;
		month =m;
		year = y;
	}
	public String toString()
	{
		return day+"/"+month +"/"+ year;
	}
	

}
class Product{
	
	String name ;
	int id;
	MyDate date;
	
	public Product() {
		 name = "LG";
		 id = 101;
		 date = new MyDate();
	}
	
	public Product(String n,int i,MyDate d) {
		name = n;
		id = i;
		date = d;
	}
	
	public String toString()
	{
		return name+" "+id +" "+date;
	}	
}