package Pattern2;
import java.util.*;
public class pattern17 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if((i+j)%2==0) {
					System.out.print(1+" ");

				}else {
					System.out.print(0+" ");
				}
				
			}
			System.out.println();
		}

	}

}
