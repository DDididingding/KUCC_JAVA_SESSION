
public class Array_02 {
	public static void main(String[] args) {
//		int[] nums = new int[5];
		int[] nums = {3,4,5,1,2};
		
		//배열 순회하며 값 입력
//		for(int i = 0 ; i<5; i++) {
//			nums[i] = i;
//		}
		
		//배열 순회하며 값 출력
		for(int i = 0 ; i<5; i++) {
			System.out.println(nums[i]);
		}
		
		//얘는 어떻게 될까??
		System.out.println(nums);
		
		
		for(int i : nums) {
			System.out.println(i);
		}
		
		
	}
}
