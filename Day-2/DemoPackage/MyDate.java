package DemoPackage;

public class MyDate {
	int date,month, year;
	public void init() {
		date = 11;
		month = 8;
		year = 1997;
	}
	public void print() {
		System.out.print("DATE = " + date + " MONTH = " + month + " YEAR = " + year);
	}

	public static void main(String[] args) {
		MyDate d1 = new MyDate();
		d1.init();
		d1.print();
	}
}
