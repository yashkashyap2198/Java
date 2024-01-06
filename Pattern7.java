package Pattern2;
import java.util.*;
public class Pattern7 {

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
			int num=1;
			int k=i-1;
k++;

			while(num<=i) {
				System.out.print(k);

				num++;
			}
			int dec=i-1;
			
			while(dec>=1) {
				k--;
				System.out.print(k);
				dec=dec-1;
			}
			System.out.println();
			i++;
		}
	}

}
