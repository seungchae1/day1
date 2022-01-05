package test.darr;

public class DynamicArrayTest2 {

	public static void main(String[] args) {
		//동적 2차원 배열 선언 및 생성
		int[][] nums= new int[3][];
		
		int count=1;
		for (int i = 0; i < nums.length; i++) {
			nums[i]= new int[i+1];
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j]=10*count++;
			}
		}
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
