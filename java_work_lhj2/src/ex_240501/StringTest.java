package ex_240501;

public class StringTest {

	public static void main(String[] args) {
		String java = "java";
		String bus = "bus";
		//compareTo(String anotherStr) : 기존 문자열과 anotherStr 비교
		//기존 문자열이 anoherStr보다 먼저 나오면 음수
		//기존 문자열이 anoherStr보다 나중에 나오면 양수
		//같으면 0
		int javaCompareBus = java.compareTo(bus);
		System.out.println("javaCompareBus :" + javaCompareBus);
		
		int busCompareJava = java.compareTo(bus);
		System.out.println("busCompareJava :" + busCompareJava);
	}

}
