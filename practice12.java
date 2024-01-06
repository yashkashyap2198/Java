package Pattern2;
import java.util.*;
public class practice12 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int spaces=1;
			while(spaces<=i-1) {
				System.out.print(" ");
				spaces++;
				
			}
			int stars=1;
			while(stars<=n) {
				System.out.print('*');
				stars++;
			}
			System.out.println();
			i++;
		}
	}

}
