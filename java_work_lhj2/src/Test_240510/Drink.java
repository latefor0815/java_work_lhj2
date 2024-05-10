package Test_240510;

import java.util.HashMap;
import java.util.Scanner;

public class Drink {
	public static void main(String[] args) {

		HashMap<String, Integer> drinkPrices = new HashMap<>();
		drinkPrices.put("밀키스", 700);
		drinkPrices.put("코카콜라", 800);
		drinkPrices.put("펩시", 1000);
		drinkPrices.put("칠성사이다", 1200);

		Scanner scanner = new Scanner(System.in);

		System.out.println("밀키스, 코카콜라, 펩시, 칠성사이다 있습니다.");

		while (true) {
			System.out.print("선택 >> ");
			String input = scanner.nextLine();

			if (input.equals("그만")) {
				System.out.println("종료합니다....");
				break;
			}

			Integer price = drinkPrices.get(input);
			if (price != null) {
				System.out.println(input + "는 " + price + "원 입니다.");
			} else {
				System.out.println("해당 음료수는 없습니다.");
			}
		}

		scanner.close();
	}
}
