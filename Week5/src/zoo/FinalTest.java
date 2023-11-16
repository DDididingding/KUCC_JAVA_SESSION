package zoo;

public class FinalTest {
	public static void main(String[] args) {
		
		God g = new God();
		
		g.power = "timeStop";
		
		System.out.println(g.power);
		
		int hour = 24;
		
		hour = 23; //이렇게 원래 바꿀 수 있음
		//근데 하루에 24시간인게 바껴요??
		//안바뀌죠!!
		
		final int HOUR = 24;
		
//		HOUR = 12; //얘 오류난다! 왜? final붙었으면 더이상 값 수정 불가능!!
		//보통 언제쓰냐? 알고리즘에서 상수 받았을때, 혹은 진짜 상수값을 쓸때 ex)pi
	}

}
