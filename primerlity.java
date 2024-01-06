package fundamentals;
import java.util.Scanner;
public class primerlity {

	public static void main(String[] args) {
int i=2;
boolean isPrime=true;
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		while(i<=n/2) {
			if(n%i==0) {
				// System.out.println(i +" "+ "composite");
				isPrime=false;
	
			}
			i=i+1;
		}
		if(isPrime) {
			System.out.println("Prime");
		}else {
			System.out.println("composite");
		}
		// TODO Auto-generated method stub

	}

}
