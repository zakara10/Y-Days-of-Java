package toString_constructor_vargs_static;

public class MyDate {
	
	int day,month,year;
	public MyDate() {
		this(2,2021);
		day = 27;
	}
	public MyDate(int m , int y) {
		month = m;
		year = y;
	}
	public MyDate(int d,int m ,int y) {
		day = d;
		month = m;
		year = y;
	}
	public void printMyDate() {
		System.out.println("Date = "+ day +" Month="+month+" Year="+year);
	}
	
	
	public static void main(String[] args) {
		MyDate d = new MyDate(13,5,1997);
		d.printMyDate();
	}

}
