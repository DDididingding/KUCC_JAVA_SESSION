package zoo;

public class Dog extends Animal{
	
	String owner;
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	@Override //어노테이션. 요놈을 적어놓으면 내가 할 행동을 미리 정의해놓은것!!
	public void cry(int howMany) {//여기서 오버로딩을 볼 수 있다. 메서드 이름 같지만, 매개변수가 달라지면 다르게 동작
		for(int i = 0; i<howMany; i++) {			
			System.out.println("멍멍");
		}
	}
	
	public void walk(String Who) {
		System.out.println(Who+ "랑 산책간다");
	}

}
