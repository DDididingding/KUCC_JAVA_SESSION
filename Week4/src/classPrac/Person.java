package classPrac;

//접근 제한자   활용 제한자  class class명

public class Person {
	//속성 정의
	String name;
	int age;
	String hobby;
	
	//생성자
	public Person() {
		
	}

	public Person(String name, int age, String hobby) {
		super();
		this.name = name;
		this.age = age;
		this.hobby = hobby;
		//뒤에꺼는 나중에
	}
	
	
	//기능정의
	
	public String introduce() {
		
		return ("저는 "+ name + " 입니다");
	}
	
	public void introduce2() {
		System.out.println("저는저는 "+ name + " 입니다입니다");
	}
	
	public void yell(String what) {
		System.out.println(what+"!!!!!");
	}
	
	public void yell(int a) {
		System.out.println(a+" 어 숫자네");
	}
	
}
