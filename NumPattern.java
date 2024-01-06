package Pattern2;
import java.util.*;
public class NumPattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		//int n=s.nextInt();
//		for(int i=1;i<=n;i++){
//			for(int j=1;j<=n-i;j++){
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++){
//				//int p=j;
//				System.out.print(k);
//				//p++;
//			}
//			System.out.println();
//		}
		
//		for(int i=n;i>=1;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print('*');
//			}
////			for(int k=0;k<=i-1;k++) {
////				System.out.print(k);
////			}
//			System.out.println();
//		}
//		for(int i=n;i>=1;i--){
//			for(int j=1;j<=i;j++){
//				System.out.print(i);
//			}
//			System.out.println();
//		}
//		for(int i=1;i<=n;i++){
//			for(int j=1;j<=n-i+1;j++){
//				System.out.print(n-i+1);
//			}
//			System.out.println();
//		}
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){			//for spaces
			System.out.print(" ");
			}
			for(int k=1;k<=i;k++){			//for stars
			System.out.print('*');
			}
			for(int l=1;l<=i-1;l++){
				System.out.print('*');
			}
			System.out.println();

		}
	}

}
