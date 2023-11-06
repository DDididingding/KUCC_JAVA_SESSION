import java.util.Arrays;

public class Array_04 {
	public static void main(String[] args) {
		int[][] nums = new int[3][3];
		
		int a = 1;
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j< 3; j++) {
				nums[i][j] = a++;
			} //입력을 위해서 각 인덱스에 접근
		}
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j< 3; j++) {
				System.out.print(nums[i][j] + " ");
			} //출력을 위해서
			System.out.println();
		}
		
		
		
		
	}
}
