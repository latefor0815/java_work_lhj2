package ex_240423_2;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//사용법 scanner 클래스 객체를 생성 A a = new A();
		//                          Scanner scanner = new Scanner();
		//import되었음 밑에 Scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름이뭐?");
		System.out.println("어디살아?");
		System.out.println("취미는뭐?");
		
		String nameString = scanner.next();
		String adressString = scanner.next();
		String hobbyString = scanner.next();
		
		System.out.println("이름 : " + nameString);
		System.out.println("이름 : " + adressString);
		System.out.println("이름 : " + hobbyString);
		
		
		
		
	}

}
