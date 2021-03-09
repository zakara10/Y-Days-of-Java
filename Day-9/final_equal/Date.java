package final_equal;

import toString_constructor_vargs_static.MyDate;

public class Date {
int day,month,year;
	
    public Date() {
		day=6;
		month=3;
		year=2021;
	}
	public Date(int d,int m,int y) {
		
		day=d;
		month=m;
		year=y;
	}
	public String toString() 
	{
		return day+"/"+month+"/"+year;
	}
	
	public boolean equals(Object ob2)
	{
		Date dd2=(Date) ob2;
		if(this.day==dd2.day && this.month==dd2.month && this.year==dd2.year)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
	
		MyDate d1=new MyDate(2,3,2020);
		MyDate d2=new MyDate(2,3,2020);
		if(d1.equals(d2))
		{
			System.out.println("same ");
		}
		else
		{
			System.out.println("not same ");
		}
		
		
		/*if(d1==d2)
			System.out.println("same ");
		else
			System.out.println("not same ");*/
		
		
	
	}

}
