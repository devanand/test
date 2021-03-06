import java.util.HashMap;

public class AdditionWithoutOperator {
	static int add(int a, int b) {
		if(b == 0) return a;
		int sum = a ^ b;
		int carry = (~a & b) << 1; 
		return add(sum, carry);
	}
	
	public static void main(String[] args) {
		System.out.println(add(50, 40));
		
	}
}
