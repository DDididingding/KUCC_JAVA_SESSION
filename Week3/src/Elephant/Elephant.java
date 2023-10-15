package Elephant;

public class Elephant {
	String Name;
	int Age;
	String color;
	
	public Elephant() { //아무런 인자 없이 빈껍데기를 생성
		
	}

	public Elephant(String name, int age, String color) { //특성과 함께 생성
		Name = name;
		Age = age;
		this.color = color;
	}
	
	public void 울음소리() { //메서드, 함수
		System.out.println("뿌우우우");
	}
	
}
