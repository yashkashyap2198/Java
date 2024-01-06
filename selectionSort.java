
public class selectionSort {
	public static void printArray(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void selectionSort(int[]arr) {
		//FOR INSERT ELEMENT AT ITH POSITION
		for(int i=0;i<arr.length-1;i++) {
			int min=Integer.MIN_VALUE;
			int minIndex= -1;
			for(int j=i;j<arr.length;j++) {
				//finding the min element among jth position
				if(arr[j]<min) {
					min=arr[j];
					minIndex=j;
				}
			}
			//swap the element
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]= {1,6,4,8,0,3};
			selectionSort(arr);
			printArray(arr);
	}

}
