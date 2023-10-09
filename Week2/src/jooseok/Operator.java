package jooseok;

public class Operator {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 7;
		System.out.println("a = "+ a+ " b = "+b);
		
		a++; // 나한테 1더하기
		System.out.println("a = "+ a+ " b = "+b);
		
//		+, -, *, /, %  = 더하기 빼기 곱하기 나누기 나머지
		System.out.println("a = "+ (++a)+ " b = "+b);//얘는 1더하고 사용
		System.out.println("a = "+ (a++)+ " b = "+b);//얘는 사용하고 1더하기
		System.out.println("a = "+ a+ " b = "+b);
		
		System.out.println(a!=b);
	}
}
