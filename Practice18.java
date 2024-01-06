
package fundamentals;
import java.util.Scanner;
public class Practice18 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int sumEven=0;
		int sumOdd=0;
		
		while(n>0) {
			int r=n%10;
			if(r%2==0) {
			
			sumEven=sumEven+r;
			//System.out.println(sumEven);
			} else {
				sumOdd=sumOdd+r;
				//System.out.println(sumOdd);
			}
			n=n/10;
		}
		System.out.println(sumEven);
	System.out.println(sumOdd);

		// TODO Auto-generated method stub

	}

}
