package Pattern2;
import java.util.*;
public class Pattern3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int spaces=1;
			while(spaces<=n-i) {
				System.out.print(" ");
				spaces++;
			}
			int stars=1;
			while(stars<=i) {
				System.out.print('*');
						stars++;
			}
			System.out.println();
			i++;
			
		}
		// TODO Auto-generated method stub

	}

}
