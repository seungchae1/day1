package test.arr2;

public class ArrTest2 {
	public static void main(String args[]){
		//2���� �迭 ���� �� ��ü ����
		int[][] nums=new int[3][4];
		
		int count= 1;
		//���� ���� for
		for (int i = 0; i < nums.length; i++) {
			//���� ���� for
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j]= count++ * 10;
			}
		}
		
		//�迭�� ����� �����͵��� ���
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
	}
}
