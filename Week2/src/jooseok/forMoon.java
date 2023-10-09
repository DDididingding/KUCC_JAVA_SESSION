package jooseok;

public class forMoon {
	
	public static void main(String[] args) {
		
		int repeatTime = 5;
		for(int i = 0; i<repeatTime; i++) {
			System.out.println(i);
		}
		
		int howmany = 6;
		int now = 0;
		while(now<howmany) {
			System.out.println(now++);
//			now++;
		}
		
		
		do {
			System.out.println("일단 한 번은 출력");
		}while(howmany == 4);
		
		for(int i = 0; i<5; i++) {
//			if(i == 3) break;
			System.out.println("이거 출력");
			if(i%2 == 0) continue;
			System.out.println("저거 출력");
		}
	}
	
	
	
}
