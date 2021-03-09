package final_equal;

public class Final {
	public static void main(String[] args) {
		/* FINAL VARIABLE
		final int i=5;
		i = 9;//error since i is already defined as final
		System.out.println(i);
		*/
		B ob  = new B();
		ob.show();
	}
}
/* FINAL METHOD
class A{
	//Since method show is final 
	final public void show() {
		System.out.println("In A show");
	}
}

class B extends A{
	public void show() {
		System.out.println("In B show");
	}
}
*/ 
/* FINAL CLASS --> Final class cannot be inherit
final class A{
		public void show() {
		System.out.println("In A show");
	}
}

class B extends A{
	public void show() {
		System.out.println("In B show");
	}
}
*/