package day04;

import java.util.HashMap;
import java.util.Scanner;

interface Controller{
	// 인터페이스의 가장 큰 특징은 추상메서드와 상수 멤버만 사용한다.
	public int execute();	// 추상메서드
}

// 게시판구현 클래스
class BoardController implements Controller{
	Scanner scan=new Scanner(System.in);
	@Override
	public int execute() {
		System.out.println("1)목록 2)글쓰기 3)조회");
		return scan.nextInt();
	}
}

// 회원관리구현 클래스
class MemberController implements Controller{
	Scanner scan=new Scanner(System.in);
	@Override
	public int execute() {
		System.out.println("1)회원목록 2)회원추가 3)회원삭제");
		return scan.nextInt();
	}
}

// 쇼핑몰구현 클래스
class ShopController implements Controller{
	Scanner scan=new Scanner(System.in);
	@Override
	public int execute() {
		System.out.println("1)상품목록 2)장바구니 3)배송조회");
		return scan.nextInt();
	}
}


public class Work102304 {
	static HashMap<String, Controller> handlerMapping = new HashMap<String, Controller>();
	// static 초기화 블럭
	static {
		handlerMapping.put("/board",new BoardController());
		handlerMapping.put("/member",new MemberController());
		handlerMapping.put("/shop",new ShopController());
	}
	
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("실행할 콘트롤러 패스 입력(ex: /board ): ");
		String path=scan.next();
		// 패스 값을 이용해서 컨트롤러를 구동한다.
		Controller ctrl=handlerMapping.get(path);
		if(ctrl!=null) {
			int no=ctrl.execute();
			System.out.println("no => "+no);
		}else {
			System.out.println("해당 컨트롤러가 없습니다.");
		}
		
		
		main(null);
	}
}
