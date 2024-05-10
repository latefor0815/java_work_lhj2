package Test_240510;

import java.util.HashMap;
import java.util.Scanner;

public class TestHash {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> accounts = new HashMap<>();

		System.out.println("<< 통장 관리 프로그램입니다. >>");

		while (true) {
			System.out.print("이름과 금액 입력 >> ");
			String input = scanner.nextLine();

			if (input.equals("exit")) {
				System.out.println("프로그램을 종료합니다...");
				break;
			}

			String[] data = input.split(" ");
			String name = data[0];
			int amount = Integer.parseInt(data[1]);

			if (accounts.containsKey(name)) {
				int balance = accounts.get(name) + amount;
				accounts.put(name, balance);
			} else {
				accounts.put(name, amount);
			}

			StringBuilder sb = new StringBuilder();
			sb.append("(");
			for (String key : accounts.keySet()) {
				sb.append("(").append(key).append(">").append(accounts.get(key)).append("원").append(")");
			}
			sb.append(")");
			System.out.println(sb.toString());
		}
		scanner.close();
	}
}