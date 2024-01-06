package fundamentals;
import java.util.*;
public class SumOfEven {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++){
				
		
			if(i%2==0){
				sum=sum+i;
				
				
			}
			
		}
		// TODO Auto-generated method stub
		System.out.println(sum);
	}

}
