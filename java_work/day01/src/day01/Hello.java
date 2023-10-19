package day01;

import java.util.Scanner;

//클래스는 객체를 만들기 위해 만든 틀이다.
public class Hello {
	//(클래스의)멤버 필드 변수
	// 자바는 변수를 선언할 때 데이터타입을 표시해야 한다.
	static final Scanner scan = new Scanner(System.in);
	static final Scanner scanline = new Scanner(System.in);
	
	// 클래스의 멤버에는 메서드와 필드가 있다.
	// 멤버에는 static을 붙이는 것과 안붙히는 것이 있다.
	// 멤버 메서드
	public static void main(String[] args) {
		// (메서드의) 로컬변수: 로컬변수는 초기화 필수
		String name = "홍길동";
		String address = "파주시";
		int age = 25;	// Integer age;
		
		// 이름, 주소, 나이입력
		System.out.print("이름입력: ");
		name = scan.next();
		System.out.print("주소입력: ");
		address = scanline.nextLine();
		System.out.print("나이입력: ");
		age = scan.nextInt();
		
		System.out.println("Hello world");
		System.out.println("이름: " + name);
		System.out.println("주소: " + address);
		System.out.println("나이: " + age);
	}
}

