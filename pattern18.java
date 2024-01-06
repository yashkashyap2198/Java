package Pattern2;
import java.util.*;
public class pattern18 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int spaces=1;spaces<=n-i;spaces++) {		//for(int j=1;j<=n-i;j++)
				System.out.print(" ");
				
			}
			for(int j=1;j<=n;j++) {
				System.out.print('*');
			}
			System.out.println();
		}

	}

}
