package inOut;

import java.util.Scanner;

public class StringBuilderPrac {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int[] N = new int[10];
		
		for(int i = 0 ; i<10; i++) {
			N[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i<10; i++) {
			N[i] = 2*N[i];
		}

		
//
//		for(int i = 0 ; i<10; i++) {
//			System.out.print(N[i]+" ");
//		}
		
		for(int i = 0 ; i<10; i++)
			sb.append(N[i]+" ");
		
		System.out.println(sb);
		
		//테스트케이스별로 돌때가 있어요
		//그러면 sb에 점점 쌓기만 한다 출력한다고 비워지는 게 아님
		
		sb.setLength(0); //현재 스트링빌더의 길이를 0으로 한다 == 스트링빌더 내용 초기화
		
		
	}

}
