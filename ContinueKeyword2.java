package lecture7;

public class ContinueKeyword2 {

	public static void main(String[] args) {
//		for(int i=1;i<=4;i++) {
//			if(i==2) {
//				continue;
//			}
//			System.out.println(i);
//		}
		int i=1;
		while(i<=4) {
			if(i==2) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}

}
