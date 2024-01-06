package fundamentals;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		
		if(x%2==0) {
			System.out.println("num is even");
		}else {
			System.out.println("num is odd");
		}
		// TODO Auto-generated method stub
System.out.println("outside the if else");
	}

}
