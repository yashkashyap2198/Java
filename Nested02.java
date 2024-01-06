package fundamentals;
import java.util.Scanner;
public class Nested02 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		if(a>b) {
			System.out.println("first num is greater");
		}else if(b>a) {
			System.out.println("second num is greater ");
		}else {
			System.out.println("both num are equal");
		}
		// TODO Auto-generated method stub

	}

}
