package day04;

import java.util.HashMap;

public class Work102303 {
	public static void main(String[] args) {
		// HashMap 생성
		HashMap<String, Integer> studentGrades = new HashMap<>();
		// 값 추가
		studentGrades.put("Alice", 85);
		studentGrades.put("Bob", 90);
		studentGrades.put("Charlie", 78);
		System.out.println(studentGrades); // {Alice=85, Bob=90, Charlie=78}
		// 중복된 키로 값 추가 시도
		studentGrades.put("Alice", 88); // "Alice"의 점수를 88로 업데이트
		System.out.println(studentGrades); // {Alice=88, Bob=90, Charlie=78}
		// 키로 값 검색
		int aliceGrade = studentGrades.get("Alice"); // 88
		// 키의 존재 여부 확인
		boolean hasBob = studentGrades.containsKey("Bob"); // true
		// 값의 존재 여부 확인
		boolean hasGrade85 = studentGrades.containsValue(85); // false, because Alice's grade was updated to 88
		// 키/값 삭제
		studentGrades.remove("Bob");
		System.out.println(studentGrades); // {Alice=88, Charlie=78}
		// 모든 키와 값을 출력
		for (String key : studentGrades.keySet()) {
		System.out.println(key + ": " + studentGrades.get(key));
		}

	}
}
