package day01;

import java.util.Scanner;

import day01.Person;

//��ȣ, ����, �̸���, ���̸� �Է� �޾Ƽ� ����ϴ� ���α׷� ����.
//Person Ŭ������ ����� ��ü�� �����ؼ� ��ü�� �Է¹ޱ�

//�ϳ��� ���Ͽ� ���� Ŭ������ ���� �����ϴ�.
class Person {
	int id;
	String name;
	String email;
	int age;
//	Person p;
}

public class Hello2 {
	// ���� �����ϴ� ��ü�� ����.
	static Person[] person;	// person=null;
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		// ���� ������ ��ü�� �������Ѿ� �����͸� �Է� ���� �� �ִ�.
		person = new Person[5];
		
		for (int i=0; i<5; i++) {
			person[i] = new Person();
			
			System.out.println("���̵��Է�: ");
			person[i].id = scan.nextInt();
			System.out.println("�̸��Է�: ");
			person[i].name = scan.next();
			System.out.println("�̸����Է�: ");
			person[i].email = scan.next();
			System.out.println("�����Է�: ");
			person[i].age = scan.nextInt();
			System.out.println(person[i].id);
			System.out.printf("%d, %s, %s, %d\n",
					person[i].id, person[i].name, person[i].email, person[i].age);
		}
	}
}