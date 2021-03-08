package containment;

public class Test2 {
	
	public static void main(String[] args) {
		Account s1=new Account();
		System.out.println(s1);
	
		Account s2=new Account(11111,"Rohit", new Address("Ahmednagar",14524));
		System.out.println(s2);
	}
}
