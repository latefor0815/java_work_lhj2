package ex_240501_2;

import java.util.Vector;
import java.util.Scanner;

class Person {
    private String name;
    private String menu;

    public Person(String name, String menu) {
        this.name = name;
        this.menu = menu;
    }

    public String getName() {
        return name;
    }

    public String getMenu() {
        return menu;
    }
}

public class Test {

    public static void main(String[] args) {
        Vector<Person> menuVector = new Vector<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("내가 먹고 싶은 음식");

        while (true) {
            System.out.println("1. 메뉴 입력, 2. 메뉴 출력, 3. 검색하기, 4. 이름으로 삭제하기, 5. 종료하기");
            System.out.print("==메뉴를 선택하세요==");
            int pickNumber = scanner.nextInt();
            scanner.nextLine();
            switch (pickNumber) {
                case 1:
                    System.out.println("이름과 메뉴를 입력해. 입력을 완료하려면 'exit'를 입력하세요.");
                    while (true) {
                        System.out.print("이름: ");
                        String name = scanner.nextLine();
                        if (name.equals("exit")) {
                            break;
                        }
                        System.out.print("메뉴: ");
                        String menu = scanner.nextLine();
                        menuVector.add(new Person(name, menu));
                    }
                    break;
                case 2:
                    System.out.println("메뉴 출력:");
                    for (Person person : menuVector) {
                        System.out.println(person.getName() + ": " + person.getMenu());
                    }
                    break;
                case 3:
                    System.out.print("검색할 메뉴를 입력해>> ");
                    String searchItem = scanner.nextLine();
                    boolean found = false;
                    for (Person person : menuVector) {
                        if (person.getMenu().equalsIgnoreCase(searchItem)) {
                            found = true;
                            System.out.println(person.getName() + " 주문한 메뉴.");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("해당 메뉴가 없습니다ㅎㅎ.");
                    }
                    break;
                case 4:
                    System.out.print("삭제할 이름 입력해>> ");
                    String deleteName = scanner.nextLine();
                    boolean deleted = false;
                    for (int i = 0; i < menuVector.size(); i++) {
                        if (menuVector.get(i).getName().equalsIgnoreCase(deleteName)) {
                            menuVector.remove(i);
                            deleted = true;
                            System.out.println(deleteName + " 주문 삭제완료ㅎㅎ.");
                            break;
                        }
                    }
                    if (!deleted) {
                        System.out.println("해당하는 이름이 없어요.");
                    }
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("올바른 메뉴를 선택하세요.");
                    break;
            }
        }
    }
}
