package fundamentals;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int i=2;
		boolean isprime=false;
		if(n%2==0)
			isprime = true;
			
			
		
		while(isprime&&i<n) {
			isprime=!(n%i==0);
			i+=2;
		}
		if(isprime) {
			System.out.println("Prime");
		}else {
			System.out.println("Composite");
			
		}
		// TODO Auto-generated method stub

	}

}
