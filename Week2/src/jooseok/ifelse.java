package jooseok;

public class ifelse {
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		
		String c = "박상윤";
		String d = "고윤경";
		if(a==b) { //만약 a와 b가 같다면
			System.out.println("똑같다");
		}else if(a!=b) { //아니면 만약에 a랑 b가 다르면
			System.out.println("다르다");
		}else {//아니면 아래를 출력해라
			System.out.println("왓!");
		}
		
		if(!c.equals(d)) { //문자열은 equals로 비교를 한다	
							//맨앞에 !를 붙이면 not이 된다
			System.out.println("다른 사람입니다");
		}
		if(c.equals(d)) {
			System.out.println("같은 사람입니다");
		}

	}
	

}
