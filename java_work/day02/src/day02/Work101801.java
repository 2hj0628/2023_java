package day02;

import java.util.Scanner;

public class Work101801 {
	public static void main(String[] args) {
		// 성적을 입력받아서 학점을 출력
		Scanner scan = new Scanner(System.in);
		int score = 0;	// 지역변수는 초기화가 필수
		String grade = "F";
		
		System.out.print("점수입력: ");
		score=scan.nextInt();
		
		if(score < 0 || score >100) {
			System.out.println("범위를 초과했습니다.");
//			System.exit(0);
			main(null);	// 재귀호출
			return;	// 함수 호출 후 바로 끝내기
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
		
		// 부호 붙히기
		if(score>=60) {
			int tmpNum = score%10;
			if(tmpNum>=7 || score == 100) {
				grade+="+";
			}else if(tmpNum<=3) {
				grade+="-";
			}
		}
		
		System.out.println("학점은 "+grade+"입니다.");
	}
}