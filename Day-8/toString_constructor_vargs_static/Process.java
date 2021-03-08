package toString_constructor_vargs_static;

public class Process {

	
	public  static void calculateSquare(int n)
	{
		System.out.println("square from process class = "+n*n);
	}
	public static void calculateCube(int n)
	{
		System.out.println("cube from process class= "+n*n*n);
	}
	
	public static void main(String[] args) {
		
		calculateSquare(3);
		calculateCube(2);
		MyMath.checkEvenOdd(6);
	}
	
}
