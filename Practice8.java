package Pattern2;
import java.util.*;
public class Practice8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		
		while(i<=n) {
			int j=1;
			
			while(j<=n) {
				System.out.print(i+j-1);
				
				j++;
			}
			
			
			
			System.out.println();
			i++;

		}
		// TODO Auto-generated method stub

	}

}
