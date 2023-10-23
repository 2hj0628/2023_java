package day04;

import java.util.ArrayList;
import java.util.Objects;

// 빈으로 사용할 객체
// DTO, VO,Bean, Entity
class Person{
	private int no;
	private String id;
	private String phone;
	
	public Person() {
		// 이것은 디폴트 생성자
	}
	// 생성자 오버로드
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
	
	// 이름으로 검색되도록 haxhCode와 equals를 재정의한다.
	// ArrayList 같은 컬렉션에서 indexOf를 사용 가능하게 된다.
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
		// Person 객체를 저장하는 ArrayList 생성
		ArrayList<Person> personList=new ArrayList<Person>();
		// person 데이터 3개 추가
		personList.add(new Person(1,"KIM","010-1111-1111"));
		personList.add(new Person(2,"LEE","010-1111-1111"));
		personList.add(new Person(3,"PARK","010-1111-1111"));
		
		// 새 person 데이터 삽입
		personList.add(new Person(4,"HONG","010-1111-1111"));
		//System.out.println(personList);
		for(Person p:personList) {
			System.out.println(p);
		}
		System.out.println();
		
		// person 데이터 제거
		personList.remove(2);
		for(Person p:personList) {
			System.out.println(p);
		}
		System.out.println();
		
		// person 데이터 검색(이름으로 검색)
//		int idx=-1;
//		for(int i=0; i<personList.size(); i++) {
//			if(personList.get(i).equals("HONG")) {
//				idx=i;
//				break;
//			}
//		}
//		System.out.println("HONG Person의 위치: "+idx);
		
		// 객체를 저장한 List는 CO객체의 hashCode와 equals를 재정의해야 indexOf 사용가능
		int idx=personList.indexOf(new Person(0,"HONG",null));
		System.out.println("Find index : "+idx);
	}
	
	public static void test(String[] args) {
		// ArrayList 생성
		ArrayList<String> fruits=new ArrayList<String>();
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("체리");
		System.out.println(fruits);
		
		fruits.add(1,"망고");		// 삽입
		System.out.println(fruits);
		
		System.out.println(fruits.indexOf("바나나"));
		fruits.remove(2);
		System.out.println(fruits);
	}
}
