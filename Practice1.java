package Pattern2;
import java.util.*;
public class Practice1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			char p=(char)'A';
			while(j<=i) {
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
