package containment;

public class Test1 {
	
	public static void main(String[] args) {
		Product s1=new Product();
		System.out.println(s1);
	
		Product s2=new Product("Samsung",505, new MyDate(11,5,2000)  );
		System.out.println(s2);
	}

}
