package day04;

import java.util.ArrayList;
import java.util.Objects;

// ������ ����� ��ü
// DTO, VO,Bean, Entity
class Person{
	private int no;
	private String id;
	private String phone;
	
	public Person() {
		// �̰��� ����Ʈ ������
	}
	// ������ �����ε�
	public Person(int no, String id, String phone) {
		this.no = no;
		this.id = id;
		this.phone = phone;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Person [no=" + no + ", id=" + id + ", phone=" + phone + "]";
	}
	
	// �̸����� �˻��ǵ��� haxhCode�� equals�� �������Ѵ�.
	// ArrayList ���� �÷��ǿ��� indexOf�� ��� �����ϰ� �ȴ�.
	@Override
	public int hashCode() {
		final int prime=31;
		int result=1;
		result=prime*result+((id==null)?0:id.hashCode());
		return result;	
//		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if(id==null) {
			if(other.id!=null)
				return false;
		} else if(!id.equals(other.id))
			return false;
		return true;
//		return Objects.equals(id, other.id);
	}
}

public class Work102301 {
	public static void main(String[] args) {
		// Person ��ü�� �����ϴ� ArrayList ����
		ArrayList<Person> personList=new ArrayList<Person>();
		// person ������ 3�� �߰�
		personList.add(new Person(1,"KIM","010-1111-1111"));
		personList.add(new Person(2,"LEE","010-1111-1111"));
		personList.add(new Person(3,"PARK","010-1111-1111"));
		
		// �� person ������ ����
		personList.add(new Person(4,"HONG","010-1111-1111"));
		//System.out.println(personList);
		for(Person p:personList) {
			System.out.println(p);
		}
		System.out.println();
		
		// person ������ ����
		personList.remove(2);
		for(Person p:personList) {
			System.out.println(p);
		}
		System.out.println();
		
		// person ������ �˻�(�̸����� �˻�)
//		int idx=-1;
//		for(int i=0; i<personList.size(); i++) {
//			if(personList.get(i).equals("HONG")) {
//				idx=i;
//				break;
//			}
//		}
//		System.out.println("HONG Person�� ��ġ: "+idx);
		
		// ��ü�� ������ List�� CO��ü�� hashCode�� equals�� �������ؾ� indexOf ��밡��
		int idx=personList.indexOf(new Person(0,"HONG",null));
		System.out.println("Find index : "+idx);
	}
	
	public static void test(String[] args) {
		// ArrayList ����
		ArrayList<String> fruits=new ArrayList<String>();
		fruits.add("���");
		fruits.add("�ٳ���");
		fruits.add("ü��");
		System.out.println(fruits);
		
		fruits.add(1,"����");		// ����
		System.out.println(fruits);
		
		System.out.println(fruits.indexOf("�ٳ���"));
		fruits.remove(2);
		System.out.println(fruits);
	}
}
