package toString_constructor_vargs_static;

public class MyMath {

	public  static void calculateSquare(int n)
	{
		System.out.println("square from MyMath class= "+n*n);
	}
	public static void calculateCube(int n)
	{
		System.out.println("cube from MyMath class= "+n*n*n);
	}
	public static void checkEvenOdd(int n)
	{
		if(n%2==0)
			System.out.println("even ");
		else
			System.out.println("odd ");
	}
}
