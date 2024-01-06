package Pattern2;
import java.util.*;
public class practice11 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;//or int spaces=1;
			
		//	while(j<=n-i) {
				while(j<=n) {
					if(j<=n-i)
						System.out.print(" ");
					else
						System.out.print('*');
					j++;
//				System.out.print(" ");
//				j++;
//			}
//			int stars=1;
//			while(stars<=i) {
//				System.out.print('*');
//				stars++;
			}
			System.out.println();
			i++;
			
			
		}
	}

}
