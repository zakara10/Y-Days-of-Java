package interface_Demo;

public class Movable_Test {
	
	public static void main(String[] args) {
		
	
	Movable m1 = new Person();
	m1.move();
	
	Movable m2 = new Animal();
	m2.move();
	
	Movable m3 = new Toy();
	m3.move();
	}
}
