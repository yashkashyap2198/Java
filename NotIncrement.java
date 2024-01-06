package array.Practice;

public class NotIncrement {
	public static void increment(int a[]) {
		int a1[]= {1,2,3,4,5};
		a=a1;
		for(int i=0;i<a.length;i++) {
			a[i]++;
		}
	}

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		increment(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
		//here pass the reference to main, not value; main did not reflect