package importprac;

public class Customer {
	private String name;
	private String grade;
	private int money;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, String grade, int money) {
		super();
		this.name = name;
		this.grade = grade;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
	

}
