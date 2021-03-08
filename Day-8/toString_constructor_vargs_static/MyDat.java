package toString_constructor_vargs_static;

public class MyDat {
	
	int day,month,year;
	public MyDat() {
		day =12;
		month = 2;
		year = 1997;
	}
	
	public MyDat(int d, int m , int y) {
		day = d;
		month = m;
		year = y;
	}
	//to convert / represent object into String form
	// always return String value
	public String toString() {
		return day+"/"+month+"/"+year;
	}
	
	public static void swap(MyDat []d) {
		MyDat  temp;
		temp = d[0];
		d[0] = d[1];
		d[1] = temp;
		
	}

	public static void main(String[] args) {
		MyDat darr[] = new MyDat[2];
		darr[0] = new MyDat(2,3,2003);
		darr[1] = new MyDat(4,5,1997);
		System.out.println("before swap  " + darr[0] + "  "+ darr[1]);
		swap(darr); //base address
		System.out.println("before swap  " + darr[0] + "  "+ darr[1]);

	}

}
