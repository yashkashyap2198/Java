package fundamentals;
import java.util.Scanner;
public class practice14 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int  n,count=0;
		n=s.nextInt();
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==0&& n!=1) {
			System.out.println("Prime num");
		}else {
			System.out.println("Not Prime number");
		}
		// TODO Auto-generated method stub

	}

}
