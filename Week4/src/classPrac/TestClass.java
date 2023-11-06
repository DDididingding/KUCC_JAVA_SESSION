package classPrac;

import importprac.HelloHello;
import importprac.Customer;


public class TestClass {
	//메인에서 테스트해보자
	public static void main(String[] args) {
		
//		Person p = new Person();
//		
//		System.out.println(p.age);
//		System.out.println(p.name);
//		
		Person p1 = new Person("안준현", 20, "코딩");
//		
//		System.out.println(p1.age);
//		System.out.println(p1.name);
		
//		System.out.println(p1.introduce());
//		p1.introduce2();
//		
//		p1.yell("나는 짱이다");
//		p1.yell(10101);

		
//		inner a = new inner();
//		
//		a.innerTest();
//		
//		Cat c = new Cat();
//		
//		c.meow("멍멍");
		
//		HelloHello h = new HelloHello();
//		
//		h.a = 100;
//		h.b = 300;
//		
//		System.out.println(h.a+ " "+h.b);
		
		Customer cus = new Customer("주년", "골드", 10000);
		
		//캡슐화를 진행하면 이렇게 직접 접근은 더이상 안된다!
//		System.out.println(cus.money);
//		
//		cus.money = 1000;
//		
//		System.out.println(cus.money);
		
		System.out.println(cus.getMoney());
		
		cus.setMoney(1000);
		
		System.out.println(cus.getMoney());
		
	}
	
	//중첩클래스
	//사용하려면 static으로 전역 클래스로 선언해줘야함
	//같은 패키지 내에서 활용가능
	public static class inner{
		int Id;
		String content;
		
		public inner() {

		}
		
		public void innerTest(){
			System.out.println("동작 중");
		}
		
	}

}
