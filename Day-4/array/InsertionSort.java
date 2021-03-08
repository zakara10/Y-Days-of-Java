package array;

public class InsertionSort {
	public static void main(String[] args) {
		int a[] = {8,3,5,2,7};
		for(int i=1;i<a.length;i++) {
			int key = a[i];
			int j = i-1;
			while(j>= 0 && a[j]>key) {
				a[j+1]=a[j];
				j = j-1;
						
			}
			a[j+1]=key;
		}
		for(int x=0;x<a.length;x++) {
			System.out.println(a[x]);
	}
	}
}
