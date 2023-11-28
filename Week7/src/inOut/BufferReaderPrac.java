package inOut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//코테가면 자동완성 안되니까 코테 보기전에 스펠링 외우고 가야함
public class BufferReaderPrac {
	public static void main(String[] args) throws IOException { //던져 error 
//		long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
		
		
		//시스템 입력을 InputStreamReader를 통해서 BufferdReader로 전달해준다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//기본적으로 String자료형으로 읽는다.
		String s = br.readLine();
		
		
//		String[] str = new String[3];
//		
//		str = s.split(" ");
//		
//		for(int i = 0; i<3; i++)
//		System.out.println(str[i]);
//		
		s = br.readLine();
		int[] k = new int[3];
		
		String[] temp =new String[3];
		
		temp = s.split(" ");
		
		for(int i = 0; i<3; i++) {
			k[i] = Integer.parseInt(temp[i]);
		}
		
		System.out.println(k[0]+k[1]);
		
		        
//		long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
//		long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
//		System.out.println("시간차이(m) : "+secDiffTime);
		
	}

}
