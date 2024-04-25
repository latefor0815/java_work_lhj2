package ex_240423;

public class todayLunchMenu {

	//자바는 메인에서 시작해서 메인으로 끝남
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메인시작");
		
		//임의로 진도 상관없이 설계도면으로 사용하는 클래스를 사용하는 방법.
		// A a = new A()
		// A: 클래스명, ex) KoreanFood
		// a : 참조형 변수, ex) bibimbab
		// new : 예약어, 시스템에서 미리 선정해서 사용해서 이름사용불가
		// A() : 생성자라고 이름 부름
		// 객체만들어보기, 인스턴스화 하기, 이렇게 이름을 불러요
		KoreanFood bibimbabFood = new KoreanFood("비빔밥",9000,"본죽비빔밥");
		KoreanFood bulgogi = new KoreanFood("불고기",7500,"태산");
		KoreanFood doll = new KoreanFood("돌솥",7500,"본죽비빔밥");
		// 객체 -> 수납도구-> 멤버와 함수가있다
		
		System.out.println("오늘 점심 메뉴 :" + bibimbabFood.getFoodName());
		System.out.println("오늘 점심 메뉴 가격 :" + bibimbabFood.getFoodPrice()+"원");
		System.out.println("오늘 점심 메뉴 장소 :" + bibimbabFood.getFoodPlace());
		
		//전역 상수 및 전역 메서드 사용해보기. 클래스명 : koreanFood
		//사용방버 : 클래스명,멤버 또는 클래스명.함수
		String test=KoreanFood.showStaticMember();
		System.out.println("test 변수에 담긴 내용 출력");
		
		//변수를 사용할때
		//1) 인스턴스 멤버, 객첼르 생성해야 사용 가능함
		//2) static 멤버, 클래스명으로 객체 생성없이 바로 사용가능
		
		//hello.java 파일안에 있는 전역 하뭇 사용해보기
		//같은 패키지 폴더 안에 있어서 따로 임포트를 안해도 됩니다.
	}

}
