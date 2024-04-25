package ex_240424;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
 		Scanner lunch = new Scanner(System.in);
 		System.out.println("오늘 점심 뭐먹지?");
 		System.out.println("exit를 입력하면 종료합니다");

 		while(true) {
 			System.out.println("날씨 1.맑다 2.흐리다 3.비 4.바람");
 			String text = lunch.nextLine();
 			if(text.equals("exit"))break;
 			else if(lunch.equals("1.맑다")) {System.out.println("라면");}
 			else if(lunch.equals("2.흐리다")) {System.out.println("밥");}
 			else if(lunch.equals("3.비")) {System.out.println("국");}
 			else if(lunch.equals("4.바람")) {System.out.println("야채");}
 			else {System.out.println("그런건 없어");}
 			
 		}
 		System.out.println("종료합니다");
			lunch.close();
	}
}
