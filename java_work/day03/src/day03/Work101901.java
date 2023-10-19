package day03;

class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void sleep() {
		// �ڹٿ����� ���ڿ� �񱳸� == ���� �ϸ� ����!
		// if("buddy".equals(name)) = if(name.equals("buddy"))
		if(name.equals("Buddy")) {
			System.out.println("�� ���� ���� �¾�.");
		}
		System.out.println(name+"�� ���� �ܴ�.");
	}
}

class Dog extends Animal{
	// ��� �ʵ�(���� ����)
	// �ڹ��� ĸ��ȭ: �ʵ�� private, �޼ҵ�� public ����������
	private String name;
	
	// ������ �޼ҵ��� �̸��� Ŭ�������� �����ϰ� �������� ����.
	// �Լ� ���� (){}
	public Dog(){
		// ����Ʈ ������
		this("�̸�����");	// �ٸ� ������ ȣ��
	}
	
	// ������ �����ε�(�߰�)
	public Dog(String name){
		// �θ��� ������ ȣ��, �Ű����� ���� �θ�� ����.
		super(name);
		
		// �ʵ忡 �Ű��������� ����(����)
		// this�� ��ü �ڽ��� ����Ű�� ���� ��
		this.name = name;
	}
	
	// void -> return�� ����.
	public void bark() {
		System.out.println(name+"�̶�� ���� ¢�´�. �۸�!");
	}
	
}

public class Work101901 {
	static Dog myDog = new Dog("Buddy");	// �����ڸ� ȣ��
	public static void main(String[] args) {
		myDog.bark();
		myDog.sleep();
	}
}