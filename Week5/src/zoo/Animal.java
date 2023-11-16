package zoo;

//얘를 다들 상속 받고있죠? 그러면 얘가 상위/부모/슈퍼클래스다
public class Animal {
	String name;
	int age;
	int height;
	
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String name, int age, int height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public void cry() {
		System.out.println("으르렁");
	}

	public void cry(int howMany) {
		System.out.println(howMany);
		
	}
	

}
