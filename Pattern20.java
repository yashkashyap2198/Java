package Pattern;
import java.util.Scanner;
public class Pattern20 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			char p=(char)('A'+i-1);
			while(j<=i) {
				System.out.print(p);
				
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
