package day03;

import java.util.Scanner;
import java.util.ArrayList;

class Person {
	private String name;
	private int age;
	private String address;

	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

// Getters and Setters 추가
	@Override
	public String toString() {
		return "Name: " + name + ", Age: " + age + ", Address: " + address;
	}
}

class AddressBook {
	private ArrayList<Person> persons;

	public AddressBook() {
		this.persons = new ArrayList<>();
		this.persons.add(new Person("홍길동",28,"서울시 종로구"));
		this.persons.add(new Person("김길동",22,"서울시 강남구"));
		this.persons.add(new Person("홍길순",26,"서울시 은평구"));
	}

	public void addPerson() {
		// 기능 구현
		System.out.println("--- 연락처 추가 ---");
	}

	public void displayPersons() {
		// 기능 구현
		System.out.println("--- 목록 출력 ---");
		for(int i=0; i<this.persons.size(); i++) {
			System.out.println(this.persons.get(i).toString());	// toString()생략가능
		}
	}

	public void searchPerson() {
		// 기능 구현
		System.out.println("--- 검색 ---");
	}

	public void editPerson() {
		// 기능 구현
		System.out.println("--- 수정 ---");
	}

	public void deletePerson() {
		// 기능 구현
		System.out.println("--- 삭제 ---");
	}
}


public class Homework101901 {
	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("===================== MENU ======================");
			System.out.println("(1)연락처 추가 (2) 목록 출력 (3) 검색 (4) 수정 (5) 삭제 (6) 종료");
		
			System.out.print("선택: ");
			int choice = sc.nextInt();
			sc.nextLine(); // consume newline
			
			switch (choice) {
				case 1:
					addressBook.addPerson();
					break;
				case 2:
					addressBook.displayPersons();
					break;
				case 3:
					addressBook.searchPerson();
					break;
				case 4:
					addressBook.editPerson();
					break;
				case 5:
					addressBook.deletePerson();
					break;
				case 6:
					System.out.println("Exiting...");
					sc.close();
					return;
				default:
					System.out.println("Invalid choice! Please choose again.");
			}
		}
	}
}
