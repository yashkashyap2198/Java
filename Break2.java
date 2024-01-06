package lecture7;

public class Break2 {

	public static void main(String[] args) {
//		for(int i=1;i<=4;i++) {
//			System.out.println(i);
//			for(int j=1;j<=4;j++) {
//				System.out.println("in");
//				if(j==1) {
//					break;
//				}
//			}
//		}
		int i=1;
		while(i<=4) {
			System.out.println(i);
			int j=1;
			while(j<=5) {
				System.out.println("in");
				if(j==1) {
					break;
				}
				j++;
			}
			i++;
		}

	}

}
