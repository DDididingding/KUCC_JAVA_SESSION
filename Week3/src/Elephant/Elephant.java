package Elephant;

public class Elephant { //엘리펀트라는 클래스를 만들었어요
	String Name;
	int Age;
	String Color;
	
	public Elephant() { //아무런 인자 없이 빈껍데기를 생성
		
	}

	public Elephant(String name, int age, String color) { //특성과 함께 생성
		Name = name;
		Age = age;
		Color = color;
	}
	
	public void 울음소리() { //메서드, 함수
		System.out.println("뿌우우우");
	}
	
}
