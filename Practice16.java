package lecture7;
import java.util.*;
public class Practice16 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int c=s.nextInt();
//		int z=s.nextInt();
//		int ans=1;
//		switch(z){
//		case 1:
//		ans=(n*n+n)/2;
//		System.out.println(ans);
//		break;
//	
//		case 2:
//		for(int i=1;i<=n;i++) {
//			ans=ans*i;
//		}
//			
//		System.out.println(ans);
//		break;
//		default:
//			System.out.println(-1);
//			break;
//		}
		int i=1;
		if(c==1) {
			int sum=0;
			while(i<=n) {
			sum=sum+i;
			i++;
		}
			System.out.println(sum);
		}else if(c==2){
			int m=1;
			while(i<=n) {
			m=m*i;
			i++;
		}
			System.out.println(m);
		}else {
			System.out.println(-1);
		}
	}

}
