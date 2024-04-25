package ex_240424;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		Scanner lunch = new Scanner(System.in);
		String lunchString[] = new String[5];
		System.out.println("음식을넣으세요");
		
		for (int i = 0; i < lunchString.length; i++) {
			lunchString[i]  = lunch.next();
			
		}
		for (int i = 0; i < lunchString.length; i++) {
			System.out.println(lunchString[i]);
	
			
		}
		System.out.println("이제 그만");
		
		lunch.close();
		
		//랜덤한 숫자 하나 선택후 임시변수에 담아서 정의
		Random random = new Random();
		//함수사용 랜덤 뽑기
		int randomNumber = random.nextInt(5);
		System.out.println("랜덤한 숫자 : " + randomNumber);
		
	}

}



	//







//food[0] = "라면";
//food[1] = "떡볶이";
//food[2] = "피자";
//food[3] = "파스타";
//food[4] = "돈까스";