package Pattern2;
import java.util.*;
public class pattern14 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		for(i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print('*');
						
			}
			int spaces=2*(n-i);
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		for(i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print('*');
						
			}
			int spaces=2*(n-i);
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
