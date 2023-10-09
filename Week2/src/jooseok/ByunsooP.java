package jooseok;

public class ByunsooP {
	public static void main(String[] args) {

		int Byunsoo; // 정수를 담을 공간만 만든거다 - 선언
		
		Byunsoo = 30; //초기화
		
		System.out.println(Byunsoo);
		
		Byunsoo = 25;
		
		System.out.println(Byunsoo);
		
		String str = "문자열";
		String Str = "문자열1";
		int p = 0;
		int P = 2;
		
		
		int maxValue= 0; //camelCase. 안써도 되지만 국룰이다.
		long 큰수 = 1234567890; //얘는 나중에 인코딩이 깨질 가능이 있어서
								// 깨지면 실행이 안됩니다.
							//권장 ㄴㄴ
		큰수 *= 10; //큰수에다가 10을 곱하고 저장
		// 큰수 = maxValue; //얘는 오류 안남
		
		maxValue = (int) 큰수; //명시적 형변환
		System.out.println(maxValue);
//		System.out.println(큰수);
//		maxValue = (int) 큰수;
		
//		System.out.println(p+" "+P);
//		System.out.println(str);
		
//		System.out.println(큰수);
	}
}
