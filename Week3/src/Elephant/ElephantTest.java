package Elephant;

public class ElephantTest {
	public static void main(String[] args) {
		Elephant A = new Elephant("Coco", 45, "grey");
		Elephant B = new Elephant();
		
		B.Name = "lili";
		B.Age = 30;
		B.color = "Red";
		
		System.out.println(A.Name);
		System.out.println(A.Age);
		
		A.울음소리();
	}

}
