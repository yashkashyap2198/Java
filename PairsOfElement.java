package array.Practice;

public class PairsOfElement {
	public static void printAllPairs(int a[]) {
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				System.out.println("("+a[i]+","+a[j]+")");
			}
		}
	}

	public static void main(String[] args) {
		int a[]= {5,4,7,6,8};
		printAllPairs(a);

	}

}
