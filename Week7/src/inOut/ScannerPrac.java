package inOut;

import java.util.Scanner;

public class ScannerPrac {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //system.in == 시스템의 입력
		
		//Scanner를 호출한 횟수만큼 입력을 받을 수 있다.
		
		// 10 20 30 40 50
		int a = sc.nextInt(); //보통 숫자들은 공백을 기준으로 구분되어 주어진다.
		
		// int b = sc.nextInt(); 얘를 반복하면 다 받아올 수 있다
		
		String one = sc.next(); //공백을 기준으로 구분된 문자를 입력받을 때.
		String two = sc.next();

		String b = sc.nextLine(); // 줄단위로 주어진 문자 받을때
		String c = sc.nextLine();
		
//		double d = sc.nextDouble();
		//다른 타입들은 어떻게 받을까?
		//다른 문자를 기준으로 구분해야할 때 어떻게 할까?
		sc.useDelimiter("/"); //이건 해보세용
		
		System.out.println(a + " " + one + " " + two + " " + b + " " + c);
		
		//스캐너 느린데 언제써요 그럼?
		//입력이 매우 적을 때 내가 손가락으로 셀 수 있을 때
		//편하게 쓸 수 있다.
		
		
	}

}
