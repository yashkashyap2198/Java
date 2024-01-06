package fundamentals;
import java.util.Scanner;
public class Pratcice16 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		double hra,da,pf;
		double basic=s.nextDouble();
		double allow;
		char grade=s.next().charAt(0);
		hra=(20/100.0)*basic;
		da=(50/100.0)*basic;
		pf=(11/100.0)*basic;
		if(grade=='A') {
			allow=1700;

		}else if(grade=='B') {
			allow=1500;
		}else {
			allow=1300;
		}
		double totalSalary= basic+hra+da+allow-pf;
		System.out.println(Math.round(totalSalary));
		// TODO Auto-generated method stub

	}

}
