package fundamentals;

import java.util.Scanner;

public class practice06 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);
		if(c>= 'A' && c<='Z') {
			System.out.println(" 1");
		}else if(c>='a' && c<='z') {
			System.out.println(" 0 ");
		}else {
			System.out.println("-1");
		}
		// TODO Auto-generated method stub

	}

}
