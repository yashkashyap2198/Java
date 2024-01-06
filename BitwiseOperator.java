package lecture7;

public class BitwiseOperator {

	public static void main(String[] args) {
		int a=10,b=2;
		System.out.println(a&b);		//AND operator
		System.out.println(a|b);		//OR operator
		System.out.println(a^b);		//XOR operator
		System.out.println(~a);			//NOT operator
		System.out.println(a<<1);		//Bitwise left shift operator
		System.out.println(a>>1);
	}

}
