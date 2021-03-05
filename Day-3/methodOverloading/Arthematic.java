package methodOverloading;

public class Arthematic {
	

	public void mul(int a , int b) {
		int mul = a*b;
		System.out.print(" Int * Int mul = " + mul);
	}
	
	public void mul(float a , float b) {
		float mul = a*b;
		System.out.print("\n Float * Float mul = " + mul);
	}
	
	public void mul(double a , double b) {
		double mul = a*b;
		System.out.print("\n Double * Double mul = " + mul);
	}
	
	public void mul(int a , float b) {
		float mul = a*b;
		System.out.print("\n Int * Float mul = " + mul);
	}
	
	public void mul(int a , double b) {
		double mul = a*b;
		System.out.print("\n Int * Double mul = " + mul);
	}
	

}
