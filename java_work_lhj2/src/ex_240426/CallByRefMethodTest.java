package ex_240426;

public class CallByRefMethodTest {
	public static void increase(int m) {
		// int m = n
		// m 지역변수 함수 시작과 종료시에만 있음
		m = m + 1;
	}
	//int[] array = a = 0x100
	public static void increaseArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
	
	public static void main(String[] args) {
		// 기본형vs 참조형, 메소드의 인자값으로 전달ㄷ시 생존여부
		//결론 기본형은 소멸 참조형은 메모리 위치 주솟값 생존
		int n =10;
		increase(n);
		System.out.println("n : " + n);
		
		//참조형 , a= 0x100
		int [] a = {1,2,3,4,5};
		increaseArray(a);
		
		//출력해보기
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] : " + a[i]);
		}
	}

}
