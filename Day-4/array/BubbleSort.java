package array;

public class BubbleSort {
	
	public static void main(String [] args) {
		
		int a[] = {45,33,67,11,04};
		for(int i=0;i<a.length -1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(int x=0;x<a.length;x++) {
			System.out.println(a[x]);
		}
	}

}
