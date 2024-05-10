package Test_240510;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Nation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> nations = new HashMap<>();

        System.out.println("나라 이름과 인구를 5개 입력하세요. (예: Korea 5000)");
        for (int i = 0; i < 5; i++) {
            System.out.print("나라 이름, 인구 >> ");
            String country = scanner.next();
            int population = scanner.nextInt();
            scanner.nextLine(); 
            nations.put(country, population);
        }
 
        String smallestCountry = null;
        int minPopulation = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> entry : nations.entrySet()) {
            if (entry.getValue() < minPopulation) {
                smallestCountry = entry.getKey();
                minPopulation = entry.getValue();
            }
        }

        if (smallestCountry != null) {
            System.out.println("제일 인구가 적은 나라는 (" + smallestCountry + ", " + minPopulation + ")입니다.");
        } else {
            System.out.println("나라 정보가 없습니다.");
        }

        scanner.close();
    }
}
