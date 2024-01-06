package array.Practice;

public class IncrementArray {
	public static void increment(int a[]) {
		for(int i=0;i<a.length;i++) {
			a[i]++;
		}
	}

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int n=a.length;
		increment(a);
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
