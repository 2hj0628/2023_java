package day01;

import java.util.Scanner;

import day01.Person;

//번호, 성명, 이메일, 나이를 입력 받아서 출력하는 프로그램 구현.
//Person 클래스를 만들고 객체를 선언해서 객체에 입력받기

//하나의 파일에 여러 클래스를 선언 가능하다.
class Person {
	int id;
	String name;
	String email;
	int age;
//	Person p;
}

public class Hello2 {
	// 아직 참조하는 객체가 없다.
	static Person[] person;	// person=null;
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		// 참조 변수에 객체를 참조시켜야 데이터를 입력 받을 수 있다.
		person = new Person[5];
		
		for (int i=0; i<5; i++) {
			person[i] = new Person();
			
			System.out.println("아이디입력: ");
			person[i].id = scan.nextInt();
			System.out.println("이름입력: ");
			person[i].name = scan.next();
			System.out.println("이메일입력: ");
			person[i].email = scan.next();
			System.out.println("나이입력: ");
			person[i].age = scan.nextInt();
			System.out.println(person[i].id);
			System.out.printf("%d, %s, %s, %d\n",
					person[i].id, person[i].name, person[i].email, person[i].age);
		}
	}
}