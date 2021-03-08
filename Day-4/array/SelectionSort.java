package array;

public class SelectionSort {

	public static void main(String[] args) {
		
		int a[] = {13,551,212,15,688};
		for(int i=0;i<a.length-1;i++) {
			int min = i;
			for(int j = i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min =j;
				}
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		for(int x=0;x<a.length;x++) {
			System.out.println(a[x]);
	}
	}
}
