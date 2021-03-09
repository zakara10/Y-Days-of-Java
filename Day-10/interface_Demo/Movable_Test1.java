package interface_Demo;

public class Movable_Test1 {
	
	public static void make(Movable m) {
		m.move();
	}
	public static void main(String[] args) {
		make(new Person());
		make(new Animal());
		make(new Toy());
	}
}
