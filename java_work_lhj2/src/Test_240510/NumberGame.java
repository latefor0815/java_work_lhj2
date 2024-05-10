package Test_240510;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int secretNumber = random.nextInt(100);
		int guess;
		int attempts = 0;

		System.out.println("=== 숫자 맞추기 게임을 시작합니다. ===");
		System.out.println("컴퓨터가 숫자를 생각했습니다.");

		
		if (secretNumber % 2 == 0) {
			System.out.println("힌트: 홀수입니다.");
		} else {
			System.out.println("힌트: 짝수입니다.");
		}

		do {
			System.out.print("1~100 사이의 값을 입력하세요: ");
			guess = scanner.nextInt();
			attempts++;

			if (guess > secretNumber) {
				System.out.println("더 작은 수입니다.");
			} else if (guess < secretNumber) {
				System.out.println("더 큰 수입니다.");
			} else {
				System.out.println("=== 게임을 종료합니다. ===");
				System.out.println(attempts + "회만에 맞췄습니다.");
			}
		} while (guess != secretNumber);

		scanner.close();
	}
}