package interface_Demo;

public interface Movable {
	void move();
}
class Person implements Movable{
	public void move() {
		System.out.println("Person Moves");
	}
}

class Animal implements Movable{
	public void move() {
		System.out.println("Animal Moves");
	}
}

class Electronic{
	
}

class Toy extends Electronic implements Movable{
	public void move() {
		System.out.println("Toy Moves");
	}
}