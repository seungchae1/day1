package test.arr2;

public class ArrTest2 {
	public static void main(String args[]){
		//2차원 배열 선언 및 객체 생성
		int[][] nums=new int[3][4];
		
		int count= 1;
		//행을 위한 for
		for (int i = 0; i < nums.length; i++) {
			//열을 위한 for
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j]= count++ * 10;
			}
		}
		
		//배열에 저장된 데이터들을 출력
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
	}
}
