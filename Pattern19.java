package Pattern;
import java.util.Scanner;
public class Pattern19 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
		
			while(j<=i) {
			char p=(char)('A'+i+j-2);
				System.out.print(p+" ");
				
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
