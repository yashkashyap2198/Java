package lecture7;
import java.util.*;
public class XthTerm {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int temp=1;
		int i=1;
		while(temp<=x) {
			int term=3*i+2;
			if(term%4!=0) {
				System.out.print(term+" ");
				temp++;
			}
			i++;
		}
		
	}

}
