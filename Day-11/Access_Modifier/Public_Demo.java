package Access_Modifier;

public class Public_Demo {
	public int  val = 07;
	public void msg () {
		System.out.println("Hello Zakara !!!");
	}
	
	public static void main(String[] args) {
		Public_Demo p = new Public_Demo();
		System.out.println(p.val);
		p.msg();
	}
}

