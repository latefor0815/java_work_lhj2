package ex_240424;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// 문자열로 하는 방법입니디ㅏ.
		Scanner lunch = new Scanner(System.in);
		System.out.println("점심 뭐 먹을래?");
//		System.out.println("번호를 입력하세요 (1~5)");
//		int weather = lunch.nextInt();
		System.out.println("하하하");
		String weather = lunch.next();
//		if(weather.equals ("비")) {System.out.println("하나");}
//		else if(weather.equals ("날")) {System.out.println("둘");}
//		else if(weather.equals ("달")) {System.out.println("셋");}
//		else if(weather.equals ("흐림")) {System.out.println("넷");}
//		else if(weather.equals ("막음")) {System.out.println("다섯");}
//		else {
//			System.out.println("여섯");
//		}
		switch(weather) {
		case "비" : System.out.println("하나");break;
		case "날" : System.out.println("둘");break;
		case "달" : System.out.println("셋");break;
		case "흐림" : System.out.println("넷");break;
		default: System.out.println("다섯");
		}
		lunch.close();
	}
	
}

	

