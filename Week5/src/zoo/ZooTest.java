package zoo;

public class ZooTest {
	public static void main(String[] args) {
		
//		Animal a = new Animal();
//		
////		a.cry();
//		
//		Cat c = new Cat();
//		
////		c.cry();
////		c.박스_들어가기();
//		
//		Dog d = new Dog();
////		d.walk("준현이");
//		
//		a.name = "동물";
//		c.name = "고양이";
//		
//		d.cry();
//		c.cry(3); //얘는 오버라이드 아니다! 그냥 어노테이션 실험 해본 결과다.
		
		Animal a = new Cat(); //얘는 아무 문제가 없다
//		Cat c = new Animal(); //얘는 빨간줄이 뜬다!!
//		Cat c = (Cat) new Animal(); //얘는 명시적 형변환이 필요하다. //요 내용은 피피티에 추가해서 올려놓겠다
		
		Cat c = new Cat();
		//a라는 애는 캣도 되고 Animal도 된다.
		
//		if(c instanceof Animal) {
//			System.out.println("맞음");
//			
//		}else {
//			System.out.println("틀림");
//		}
//		
//		if(a instanceof Cat) {
//			System.out.println("응응");
//		}else {
//			System.out.println("ㄴㄴ");
//		}
		//요것도 좀 자세히 추가해 놓겠다
		
	
		Animal[] cats = new Animal[2];
		
		Animal x = new Animal();
		Cat y = new Cat();
		
		cats[0] = x;
		cats[1] = y;
		//분명 두 객체의 종류가 다른데, 오류 없이 잘 들어간다.
		//궁금하면 출력해봐라 // 근데 보통 이러면 안하더라!!
		//과제 곧 내줄게용
		
		
	}

}
