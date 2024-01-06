package lecture7;
import java.util.*;
public class Practice {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();
		int a,b,c;
		a=0;
		b=1;
		c=0;
		System.out.print(a+" "+b+" ");
		for(int i=1;i<=n;i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		
		

	}

}
