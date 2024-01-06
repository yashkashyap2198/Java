package fundamentals;
import java.util.Scanner;
public class Nested01 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a= s.nextInt();
		int b=s.nextInt();

		if(a>b) {
			System.out.println("first is greater");
		}
		if(b>a) {
			System.out.println("second is greater");
		}if(a==b) {
			System.out.println("both are equal");
		}


		/* if(a>b) {
			System.out.println("first is greater");
		}else {
			if(b>a) {
				System.out.println("second is greater");
			}else {
				System.out.println("both are equal");


		 }    */
	// TODO Auto-generated method stub

}

}
