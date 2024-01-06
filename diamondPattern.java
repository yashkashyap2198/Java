package Pattern2;
import java.util.*;
public class diamondPattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j,k;
		for(i=1;i<=n;i++) {
			for(j=n;j>=i;j--) {
				System.out.print(" ");
				
			}
			for(k=1;k<=i;k++) {
				System.out.print(k);
			}
			for(int dec=i-1;dec>=1;dec--) {
				System.out.print(dec);
			}
			System.out.println();
		}
		for(i=n-1;i>=1;i--) {
			for(j=n;j>=i;j--) {
				System.out.print(" ");
				
			}
			for(k=1;k<=i;k++) {
				System.out.print(k);
			}
				for(int dec=i-1;dec>=1;dec--) {
					System.out.print(dec);
					
				
				
				
				
			}
			System.out.println();
		}
		
		
		
	}

}
