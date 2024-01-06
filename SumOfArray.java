package array.Practice;
import java.util.*;
public class SumOfArray {
	public static int arraySum(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int a[]= {2,5,7,8,3};
		int res=arraySum(a);
		System.out.print(res);
	}

}
