package Pattern2;
import java.util.*;
public class sumpattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j,sum;
		for(i=1;i<=n;i++) {
			sum=0;
			for(j=1;j<=i;j++) {
				System.out.print(j);
				sum+=j;
				if(i==j) {
					System.out.print("=");
				}else {
					System.out.print("+");
				}
			}
			System.out.print(sum);
			System.out.println();
		}
		
	}

}
