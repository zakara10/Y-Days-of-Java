package DemoPackage;


public class imp
{
	public static void main(String[] args) {
		
		// primitive data types are stored in stack
		// eg.   int a=10;
		
		//Arrays in java are always stored on heap
		//arrays in java are objects
		
		
		int []arr=new int[5];
		
		
		//we can create array object without using new keyword
		//first class object
		int []c={10,20,30,40};
		
		int[]d;
		d=new int[10];
		
		
		int []b=new int[]{10,20,30,43};		
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		int sum=0;
		for(int i=0;i<b.length;i++)
		{
			sum+=b[i];
		}
		float avg=(float)sum/b.length;
		System.out.println("average = "+avg);
		
		
		sum=0;
		System.out.println("display array using for each loop ");
		// for each loop
		for(int ele:b)
		{
			System.out.println(ele);
			sum+=ele;
		}
		avg=(float)sum/b.length;
		System.out.println("average = "+avg);
		
		// can't travel in backward direction
		// cannot remove element
		// cannot modify any element
		
		System.out.println("******************************");
		int m[]={11,21,31,41,51};
		
		/*for(int i=0;i<m.length;i++){
			
			m[i]=m[i]+10;
		}*/
		for(int ele:m)
		{
			 ele=ele+10;
		}
		for(int i=0;i<m.length;i++){
			
			System.out.println(m[i]);
		}
		
		
		
		
	}
	

}