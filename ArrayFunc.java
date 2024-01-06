package array.Practice;

public class ArrayFunc {
	public static void mul(int []arr) {
		for(int i=1;i<5;i++) 
			arr[i]*=i;
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		mul(arr);
		for(int i=1;i<5;i++) {
			System.out.print(arr[i]);		}
	}

}
