package toString_constructor_vargs_static;

public class VarArgsDemo {
	
	public static void calAvg(int ... m) {
		int sum = 0;
		for(int ele:m) {
			sum = sum + ele;
		}
		float avg=(float)sum/m.length;
		System.out.println("average : "+avg);
		
		
	}
	
	public static void main(String[] args) {
		calAvg(10,20);
		calAvg(10,20,30);
		calAvg(10,20,3,4);
		calAvg(67,77,88,99,76);
		
		int[] arr=new int[]{30,33,32,32,31,34,35};		
		calAvg(arr);
		
	}

}
