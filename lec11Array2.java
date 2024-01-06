
public class lec11Array2 {
	public static int moveAllZeroToEnd(int[]arr) {
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
		}
		return arr[j];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,2,0,0,3,0};
		int res= moveAllZeroToEnd(arr);
		System.out.println(res);
	}

}
