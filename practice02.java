package Pattern2;

public class practice02 {

	public static void main(String[] args) {
		int n=5;
//		for(int i=1;i<=4;i++){
//			for(int j=1;j<=i-1;j++) {
//				System.out.print(" ");
//			}
//		for(int j=1;j<=n-i+1;j++) {				
//			System.out.print('*');
//			}
//			System.out.println();
//		}
		
		for(int i=1;i<=5;i++){
			for(int j=6;j>=1;j--){
				if(j==i) {
					System.out.print('*');
				}
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
