package lecture7;
import java.util.*;
public class Practice13 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=2;i<=n;i++) {
			int temp=0;
			for(int j=2;j<=i-1;j++) { 
				if(i%j==0) { 
					temp++;
				}
			}
				if(temp==0) { 
					System.out.println(i);
				
				}
		}
	}

}
