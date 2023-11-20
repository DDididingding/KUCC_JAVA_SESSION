
interface Laptop {
	
	public void Brand();
	
	default void BuyLaptop() {
		System.out.println("애플사세요");
	}
}
