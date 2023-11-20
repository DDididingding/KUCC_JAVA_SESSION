
public class TestTest {
	public static void main(String[] args) {
		//추상클래스가 되어 객체를 만들 수 없다
//		Developer d = new Developer(); //얘는 안된다.
		
//		Developer a = new JavaDeveloper();//얘는 된다
//		
//		JavaDeveloper j = new JavaDeveloper();
//		CDeveloper c = new CDeveloper();
		
//		d.Develop(); //얘도 안됨. 더이상 d가 없다.
//		d.Hobby();
//		j.Develop();
//		c.Develop();
//		j.Hobby();
//		j.Study();
		
		//----------------------------------
		
		MyDeveloper m = new MyDeveloper();
		System.out.println(m.ide);
		
		m.Tool();
		m.Brand();
		System.out.println("------------------");
		YourDeveloper y = new YourDeveloper();
		
		y.Brand();
		y.Tool();
		y.howToCode();
		y.BuyLaptop();
		skill.friend(); //인터페이스 이름을 불러와서 메소드를 사용할 수 있다~~ 신기하다
	}

}
