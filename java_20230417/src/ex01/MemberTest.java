package ex01;

import java.util.Scanner;

class Member {
	String name;
	String id; //인스턴스 변수
	String password;
	int age;
	
	
	//인스턴스메소드
	
	boolean login(String id, String password) {  		//지역변수	//위의 스트링 네임, 아이디. 패스워드, 에이지와 다름
		if(id.equals("홍길동") && password.equals("12345"))			//요소들끼리 연결되어야함
			return true;
		else return false; 
	}

void logout(String id) {
	
	System.out.println(id + "님 로그아웃 되었습니다.");
	
	}
}

public class MemberTest {

	public static void main(String[] args) {
		
		Member m = new Member();
		
		boolean b = m.login("로이", "1234");

		m.logout(m.id);
		boolean b2 = m.login("홍길동", "12345");
		
		if(b2==true)
			System.out.println("로그인 성공");
			
		else	
			System.out.println();
		
			System.out.println("로그인 실패");
		
		
		m.logout("홍길동");
		
			}

}
