package lecture7;

public class IncreamentDecrementOperatore {

	public static void main(String[] args) {
		int a=9;
		int b=8;
//	System.out.println(a++);
//		System.out.print(a);
//		System.out.println(++a);
//		System.out.print(a);
//		System.out.println(--a);
//		System.out.println(a--);
//		System.out.print(a);
if(++a>9 || b++>8) {
	System.out.println("Inside if");
}else {
	System.out.println("Inside else");
}

System.out.print("a"+a+"b"+b);

	}

}
