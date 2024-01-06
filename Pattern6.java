package Pattern2;
import java.util.*;
public class Pattern6 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int i=1;
		while(i<=n) {
			int spaces=1;
			while(spaces<=n-i) {
				System.out.print(" ");
				spaces=spaces+1;
			}
			int stars=1;
			while(stars<=i) {
				System.out.print('*');
				stars=stars+1;
			}
			int j=1;
			while(j<=i-1) {
				System.out.print('*');
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
