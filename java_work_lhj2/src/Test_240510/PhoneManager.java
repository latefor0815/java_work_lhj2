package Test_240510;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneManager {
	private HashMap<String, Phone> phone1;

	public PhoneManager() {
		phone1 = new HashMap<>();
	}

	public void addEntry(String name, String tel, String address) {
		Phone newEntry = new Phone(name, tel, address);
		phone1.put(name, newEntry);
	}

	public Phone searchEntry(String name) {
		return phone1.get(name);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PhoneManager manager = new PhoneManager();

		System.out.print("인원수 >> ");
		int count = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < count; i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력), 주소 >> ");
			String input = scanner.nextLine();
			String[] data = input.split(" ");
			String name = data[0];
			String tel = data[1];
			String address = "";
			for (int j = 2; j < data.length; j++) {
				address += data[j] + " ";
			}
			manager.addEntry(name, tel, address.trim());
		}
		System.out.println("저장되었습니다...");

		while (true) {
			System.out.print("검색할 이름 >> ");
			String searchName = scanner.nextLine();
			if (searchName.equals("exit")) {
				System.out.println("프로그램을 종료합니다...");
				break;
			}
			Phone result = manager.searchEntry(searchName);
			if (result != null) {
				System.out.println(
						result.getName() + "의 번호와 주소는 " + result.getTel() + ", " + result.getAddress() + " 입니다.");
			} else {
				System.out.println(searchName + "은(는) 없습니다.");
			}
		}
		scanner.close();
	}
}
