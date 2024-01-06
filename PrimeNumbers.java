package lecture7;
import java.util.*;
public class PrimeNumbers {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int j;
		for(int i=2;i<=n;i++){
			for(j =2;j<=i;j++) {
				if(i%j==0)
					break;
			}
			if(i==j)
			System.out.println(j);
			
		// TODO Auto-generated method stub
		}
		
		
	}

}
