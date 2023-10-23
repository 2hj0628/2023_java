package day04;

import java.util.HashSet;
import java.util.Random;

public class Work102302 {
	
	public static void main(String[] args) {
		// Set�� �̿��ؼ� �ζǹ�ȣ ������ �����
		// Random Ŭ������ HashSet�� �̿��ؼ� �ζǹ�ȣ �����⸦ ����� ����.
		Random rand=new Random();
		HashSet<Integer> lotto=new HashSet<Integer>();
		
		// lotto.size()�� 6�� �ɶ����� 1~45������ ���� �����Ѵ�.
		while(lotto.size()<6) {
			lotto.add(1+rand.nextInt(45));
		}
		
		System.out.println(lotto);
	}
	
	public static void test(String[] args) {
		// HashSet ����
		HashSet<String> animals = new HashSet<>();
		// �߰�
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Bird");
		System.out.println(animals); // [Cat, Bird, Dog] ������ ������� �ʽ��ϴ�.
		// �ߺ��� ������ �߰� �õ�
		animals.add("Dog");
		System.out.println(animals); // �ߺ��� "Dog"�� �߰����� �ʽ��ϴ�.
		// ���� ���� Ȯ��
		boolean hasCat = animals.contains("Cat"); // true
		// ����
		animals.remove("Bird");
		System.out.println(animals); // [Cat, Dog]
		// ũ�� Ȯ��
		int size = animals.size(); // 2
		System.out.println("Size: "+size);
	}
}
