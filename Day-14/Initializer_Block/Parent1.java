package Initializer_Block;

public class Parent1 {
	Parent1() {
		System.out.println("Parent Class Constructor ");
	}
	{
		System.out.println("Initializer Block of Parent Class");
	}
		
}

class Child extends Parent1{
	Child(){
		super();
		System.out.println("Child Class Constructor ");
	}
	{
		System.out.println("Initializer Block of Child Class");
	}
}
