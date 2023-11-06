
public class Array_02 {
	public static void main(String[] args) {
		
		int[] nums = new int[5];
		
		//정수형 배열의 성질을 가진 nums = 새로운 정수형배열을 생성해서 넣어준다.
		
//		int[] nums = {3,4,5,1,2};
		
		//배열 순회하며 값 입력
		for(int i = 0 ; i<5; i++) {
			nums[i] = i;
		}
		
		//배열 순회하며 값 출력
		for(int i = 0 ; i<5; i++) {
			System.out.println(nums[i]);
		}
		
		//얘는 어떻게 될까??
		System.out.println(nums);
		
		
		for(int i : nums) {
			System.out.println(i);
		}
		
		String[] str = new String[3];
		str[0] = "고";
		str[1] = "연";
		str[2] = "서";
		
		for(String s : str) { //은근 자주 쓰인다
			//하지만 몰라도 큰 지장은 없다.
			//하우에버 알면 너무 좋다
			System.out.println(s);
		}
		
		
	}
}
