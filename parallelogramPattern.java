package Pattern2;
import java.util.*;
public class parallelogramPattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int sp=1;sp<=i-1;sp++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++) {
			System.out.print('*');
			}
			System.out.println();
		}

	}

}
