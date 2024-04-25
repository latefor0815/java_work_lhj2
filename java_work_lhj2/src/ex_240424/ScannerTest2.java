package ex_240424;

import java.awt.GraphicsDevice;
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class ScannerTest2 {
	//메뉴 추천해주는메서드 만
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lunch = new Scanner(System.in);
		System.out.println("오늘의 점심메뉴 무엇을 먹을까요??");
		System.out.println("번호를 입력하세요(1~5):");
		int weather = lunch.nextInt();
		System.out.println("점심은 뭐?");
		if(weather ==  1) {System.out.println("라면");}
		else if(weather == 2) {System.out.println("밥");}
		else if(weather == 3) {System.out.println("국");}
		else if(weather == 4) {System.out.println("야채");}
		else if(weather == 5) {System.out.println("굶어");}
		else {System.out.println("그런건 없어");}
			
		
	
		
		
	}

}
