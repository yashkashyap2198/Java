package lecture7;
import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int rev=0;
		while(n!=0) {
			int r1=n%10;
			rev=rev*10+r1;
			n=n/10;
		}
		System.out.println(rev);
	}

}
