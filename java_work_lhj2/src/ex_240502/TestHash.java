package ex_240502;


import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Scanner;
import util.dto.TestHashUtil;


class Person {
    private String name;
    private String phoneNumber;
    private String registrationDateTime;

    public Person(String name, String phoneNumber, String registrationDateTime) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.registrationDateTime = registrationDateTime;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getRegistrationDateTime() {
        return registrationDateTime;
    }
}



public class TestHash {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Person> dic = new HashMap<String, Person>();

        while (true) {
            System.out.println("=================");
            System.out.println("연락처 프로그램 만들기");
            System.out.println("1. 연락처 입력, 2. 출력, 3. 검색, 4. 삭제, 5. 연락하고 싶은 멤버, 6. 종료하기");
            System.out.println("=================");
            System.out.print("번호 선택해: ");
            String number = scanner.next();

            if (number.equals("1")) {
                addContact(scanner, dic);
            } else if (number.equals("2")) {
                displayContacts(dic);
            } else if (number.equals("3")) {
                searchContact(scanner, dic);
            } else if (number.equals("4")) {
                deleteContact(scanner, dic);
            } else if (number.equals("5")) {
                pickRandomContact(dic);
            } else if (number.equals("6")) {
                System.out.println("프로그램을 종료합니다.");
                scanner.close();
                System.exit(0);
            } else {
                System.out.println("올바른 번호를 입력하세요.");
            }
        }
    }

    private static void addContact(Scanner scanner, HashMap<String, Person> dic) {
        scanner.nextLine(); // 버퍼 비우기
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();
        System.out.print("전화번호를 입력하세요: ");
        String phoneNumber = scanner.nextLine();
        String registrationDateTime = getCurrentDateTime(); // 현재 날짜와 시간 가져오기
        Person person = new Person(name, phoneNumber, registrationDateTime);
        dic.put(name, person);
        System.out.println("연락처가 추가되었습니다.");
    }

    private static void displayContacts(HashMap<String, Person> dic) {
        System.out.println("전체 연락처 목록:");
        for (Person person : dic.values()) {
            System.out.println("이름: " + person.getName() + ", 전화번호: " + person.getPhoneNumber() + ", 등록날짜: " + person.getRegistrationDateTime());
        }
    }

    private static void searchContact(Scanner scanner, HashMap<String, Person> dic) {
        System.out.print("검색할 이름을 입력하세요: ");
        String name = scanner.next();
        if (dic.containsKey(name)) {
            Person person = dic.get(name);
            System.out.println("이름: " + person.getName() + ", 전화번호: " + person.getPhoneNumber() + ", 등록날짜: " + person.getRegistrationDateTime());
        } else {
            System.out.println("해당하는 연락처를 찾을 수 없습니다.");
        }
    }

    private static void deleteContact(Scanner scanner, HashMap<String, Person> dic) {
        System.out.print("삭제할 이름을 입력하세요: ");
        String name = scanner.next();
        if (dic.containsKey(name)) {
            dic.remove(name);
            System.out.println("연락처가 삭제되었습니다.");
        } else {
            System.out.println("해당하는 연락처를 찾을 수 없습니다.");
        }
    }

    private static void pickRandomContact(HashMap<String, Person> dic) {
        if (dic.isEmpty()) {
            System.out.println("연락처가 비어있습니다.");
        } else {
            String[] names = dic.keySet().toArray(new String[0]);
            int randomIndex = (int) (Math.random() * names.length);
            String randomName = names[randomIndex];
            Person randomPerson = dic.get(randomName);
            System.out.println("랜덤한 연락처: " + randomPerson.getName() + ", 전화번호: " + randomPerson.getPhoneNumber() + ", 등록날짜: " + randomPerson.getRegistrationDateTime());
        }
    }

    private static String getCurrentDateTime() {
        return java.time.LocalDateTime.now().toString();
    }
}
