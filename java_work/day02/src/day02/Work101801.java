package day02;

import java.util.Scanner;

public class Work101801 {
	public static void main(String[] args) {
		// ������ �Է¹޾Ƽ� ������ ���
		Scanner scan = new Scanner(System.in);
		int score = 0;	// ���������� �ʱ�ȭ�� �ʼ�
		String grade = "F";
		
		System.out.print("�����Է�: ");
		score=scan.nextInt();
		
		if(score < 0 || score >100) {
			System.out.println("������ �ʰ��߽��ϴ�.");
//			System.exit(0);
			main(null);	// ���ȣ��
			return;	// �Լ� ȣ�� �� �ٷ� ������
		}
		
		if(score >=90) {
			grade = "A";
		} else if(score >=80) {
			grade = "B";
		} else if(score >=70) {
			grade = "C";
		} else if(score >=60) {
			grade = "D";
		} 
		
		// ��ȣ ������
		if(score>=60) {
			int tmpNum = score%10;
			if(tmpNum>=7 || score == 100) {
				grade+="+";
			}else if(tmpNum<=3) {
				grade+="-";
			}
		}
		
		System.out.println("������ "+grade+"�Դϴ�.");
	}
}