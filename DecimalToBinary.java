package lecture7;
import java.util.*;
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String b="";
		
		while(n>0) {
			int r=n%2;
			n=n/2;
			b=r+b;
			
		}
		System.out.println(b);

	}

}
