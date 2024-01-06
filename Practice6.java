package lecture7;

public class Practice6 {

	public static void main(String[] args) {
		//int a=10,b=20;
		//System.out.println(a+++--b);
		//System.out.println(a--+++b); wrong representation(++b)
		//System.out.println(a++-++b);
		//System.out.println(a+++++b); for right(++b)
		int a=10;
		a+=++a-5/3+6*a;
		System.out.print(a);
	}

}
