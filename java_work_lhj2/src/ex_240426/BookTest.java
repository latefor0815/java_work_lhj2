package ex_240426;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		//book 인스턴스 3개 만들어주세요.
		//Book 3개를 받는 배열도 만들어주세요.
		//배열에 담아서 반복문으로 출력해주세요
//		Scanner Book = new Scanner(System.in);
//			System.out.println("1번 책입니다");
//		Scanner Book1 = new Scanner(System.in);
//			System.out.println("2번 책입니다");
//		Scanner Book2 = new Scanner(System.in);
//			System.out.println("3번 책입니다");
	
		Book book[] = new Book[3];
		
//			String bookarray[] = new String[3];
		Book[] bookarrary = new Book[3];

			book[0] = new Book("뇌","베르나르베르베르", 20000);
			book[1] = new Book("개미","베르나르베르베르", 21000);
			book[2] = new Book("파피용","베르나르베르베르", 21000);
			
	        for (Book Book : book) {
	            System.out.println("책 제목: " + Book.getBookName());
	            System.out.println("저자: " + Book.getBookAuthor());
	            System.out.println("가격: " + Book.getBookPrice() + "원\n");
	        }
			
		
		
		


	}

}
