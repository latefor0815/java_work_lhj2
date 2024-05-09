package javaTest;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 회원가입
        System.out.println("회원가입을 시작합니다.");
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.print("이메일을 입력하세요: ");
        String email = scanner.nextLine();

        System.out.print("비밀번호를 입력하세요: ");
        String password = scanner.nextLine();

        // 회원 객체 생성
        User newUser = new User(name, email, password);

        // 회원가입 완료 메시지 출력
        System.out.println("회원가입이 완료되었습니다.");
        System.out.println("이름: " + newUser.getName());
        System.out.println("이메일: " + newUser.getEmail());

        // 햄버거 선택
        // 햄버거 종류 출력
        System.out.println("햄버거를 선택하세요:");
        System.out.println("1. 불고기 버거 - 5000원");
        System.out.println("2. 치즈 버거 - 4500원");
        System.out.println("3. 치킨 버거 - 5500원");

        // 선택 받기
        System.out.print("원하는 햄버거를 선택하세요 (1~3): ");
        int choice = scanner.nextInt();

        // 주문한 햄버거 객체 생성
        Burger selectedBurger = null;
        switch (choice) {
            case 1:
                selectedBurger = new BulgogiBurger();
                break;
            case 2:
                selectedBurger = new CheeseBurger();
                break;
            case 3:
                selectedBurger = new ChickenBurger();
                break;
            default:
                System.out.println("잘못된 선택입니다.");
                return;
        }

        // 햄버거 선택 메시지 출력
        System.out.println(selectedBurger.getName() + "를 선택하셨습니다. 가격은 " + selectedBurger.getPrice() + "원 입니다.");

        // 재료 선택
        while (true) {
            // 재료 종류 출력
            System.out.println("추가할 재료를 선택하세요:");
            System.out.println("1. 양상추 - 500원");
            System.out.println("2. 토마토 - 300원");
            System.out.println("3. 양파 - 200원");
            System.out.println("4. 피클 - 400원");
            System.out.println("0. 주문 완료");

            // 선택 받기
            System.out.print("추가할 재료를 선택하세요 (1~4, 0은 종료): ");
            choice = scanner.nextInt();
            if (choice == 0) {
                break;
            }
            switch (choice) {
                case 1:
                    selectedBurger.addIngredient(new Lettuce());
                    break;
                case 2:
                    selectedBurger.addIngredient(new Tomato());
                    break;
                case 3:
                    selectedBurger.addIngredient(new Onion());
                    break;
                case 4:
                    selectedBurger.addIngredient(new Pickle());
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }

        // 최종 주문한 햄버거와 추가된 재료 출력
        System.out.println("주문한 햄버거: " + selectedBurger.getName());
        System.out.println("가격: " + selectedBurger.getPrice() + "원");
        System.out.println("추가된 재료:");
        for (Ingredient ingredient : selectedBurger.getIngredients()) {
            System.out.println("- " + ingredient.getName());
        }
        System.out.println("주문이 완료되었습니다.");
    }
}

