package Pattern2;

import java.util.Scanner;

public class OsceeceTriangle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++) {
				if(i==j) {
					System.out.print('*');
				}
				int p=1;
				for(int k=1;k<=i;k++){
					System.out.print(p);
					p++;
				}
			}
			System.out.println();
		}
	}

}
