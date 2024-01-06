package Pattern2;
import java.util.*;
public class Practice9 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		
		while(i<=n) {
			int j=1;
			char p=(char)('A');
			while(j<=n-i+1) {
				System.out.print(p);
				p++;
				j++;
			}
			
			
			
			
			System.out.println();
			i++;

		}
		// TODO Auto-generated method stub

	}

}
