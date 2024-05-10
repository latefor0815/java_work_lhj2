package Test_240510;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("입력하세요: ");
			String input = scanner.nextLine();

			if (input.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}

			String[] words = input.split(",");
			System.out.println("어절 개수는 " + words.length);
		}

		scanner.close();
	}
}
