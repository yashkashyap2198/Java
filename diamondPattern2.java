package Pattern2;
import java.util.*;
public class diamondPattern2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j,k;
		for(i=1;i<=n;i++) {
			for(j=n;j>=i;j--) {
				System.out.print(" ");
				
			}
			for(k=1;k<=2*i-1;k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		for(i=n-1;i>=1;i--) {
			for(j=n;j>=i;j--) {
				System.out.print(" ");
				
			}
			for(k=1;k<=2*i-1;k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		
		
	}

}
