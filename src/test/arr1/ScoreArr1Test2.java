package test.arr1;

import java.util.Scanner;

public class ScoreArr1Test2 {

	public static void main(String[] args) {
		// 1���� �迭�� ���� �� ��ü ����
		int scores[]= new int[5];
		
		//keyboard�� �Է� ���� �ܺ� �����͸� ���α׷����� �������� ���� Scanner ��ü ����
		Scanner s=new Scanner(System.in); //in�� �������� System�̶�� Ŭ�������� ������ static����
		
		int sum= 0;
		double avg= 0; //0.0���� ���� (�ڵ�/������ ����ȯ)
		
		//���� ������ �Է� �޾Ƽ� �迭�� �����ϰ� �հ赵 ���Ѵ�.
		String[] subjects= {"Java", "C���", "����", "����", "����"};
		
		for(int i=0; i<scores.length; i++) {
			System.out.print(subjects[i] + "���� ���� �Է� : ");
			scores[i]= s.nextInt();
			sum+=scores[i];
		}

		avg = (double)sum/subjects.length;
		
		//�迭�� ����� ������ ����ϱ� ���� �ݺ���
		for(int i=0; i<scores.length; i++) {
			System.out.print(scores[i] + ":: ");
		}
		System.out.println();
		System.out.println("* �հ�: " + sum);
		System.out.printf("* ���: %.2f\n", avg); //�Ҽ��� ��° �ڸ����� ���
		
		s.close();
	}

}
