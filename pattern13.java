package Pattern2;
import java.util.*;
public class pattern13 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			int num=2*i-1;
			
			while(j<=n-i+1) {
				System.out.print(num);
				num+=2;
				j++;
			}
				int k=1;
				int p=1;
				while(k<=n-j+1) {
					System.out.print(p);
					p+=2;
					k++;
				}
			
				
			
			System.out.println();
			i++;
		}
		
	}

}
