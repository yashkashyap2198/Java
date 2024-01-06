package lecture7;
import java.util.*;
public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int num=0;
		int i=0;
		while(n>0) {
			int r=n%10;
			n=n/10;
			num=num+r*(int)Math.pow(2,i++);
		}
		System.out.print(num);
	}

}
