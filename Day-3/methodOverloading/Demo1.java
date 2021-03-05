package methodOverloading;

public class Demo1 {
	
	public void add(int a, int b) {
		int sum = a+b;
		System.out.print(sum);
	}
	
	public void add(double a, double b) {
		double sum = a+b;
		System.out.print("\n" + sum);
	}
	
	public void add(int a, double b) {
		double sum = a+b;
		System.out.print("\n"+ sum);
	}
	
	public static void main(String[] args) {
		
		Demo1 d = new Demo1();
		d.add(10,2);
		d.add(10.55545,10.554544);
		d.add(10,10.555);
	}

}
