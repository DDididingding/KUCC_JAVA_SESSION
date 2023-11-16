package zoo;

//얘네는 extends로 상속 받고있죠?? 얘네가 자식/하위/sub클래스다!!
public class Cat extends Animal {
	
	String color;
	
	public Cat() {
		// TODO Auto-generated constructor stub
	}
	
	//한글로도 메서드 이름이 정의가 된다.
	//하지만 굉장히 안좋은 습관이다. 하지마라
	public void 박스_들어가기() {
//		System.out.println("으르렁렁"); //이렇게 우는거, 동물이 다르게 울기 시작하면 
		//클래스마다 다시 설정해줘야한다.
		//일괄로 관리하려면
		
		super.cry(); //내 부모 클래스의 메서드 가져왔어.
		System.out.println("박스에 들어갔다!");
	}
	//상속을 받으면 얘를 반복해서 쓰지 않아도 된다.
//	String name;
//	int age;
//	int height;
	

}
