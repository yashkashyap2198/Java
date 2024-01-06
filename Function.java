package fundamentals;

import java.util.Scanner;

public class Function {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=2;
		while(i<=n/2) {
			if(n%i==0) {
				System.out.println("Not a Prime num");
				return;
			}
			i++;
		}
		System.out.println("Prime num");
		// TODO Auto-generated method stub

	}

}
