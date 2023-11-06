package Elephant;

public class ElephantTest {
	public static void main(String[] args) {
		Elephant A = new Elephant("Coco", 45, "grey");
		//파라미터를 포함한 생성
		//거기에 coco 45 grey를 미리 입력하면서 만들거다
		
		Elephant B = new Elephant();
		//아래가 기본 생성자
		//엘리펀트라는 속성을 가진 B를 만들거다. 거기에 엘리펀트를 생성해서 넣어준다
		
		
		B.Name = "lili";
		B.Age = 30;
		B.Color = "Red";
		
		System.out.println(A.Name);
		System.out.println(A.Age);
		
		A.울음소리();
	}

}
