package ex_240425;

public class horseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 고양이 만들기. 
		horse horse1 = new horse();
		// 고양이 정보도 설정. 
		horse1.setName("적토마");
		horse1.setAge(7);
		String[] horseFoodList = {"건초","당근","당근당근"};
		horse1.setFavoriteFood(horseFoodList);
		horse1.setPlace("마굿간");
		// 말 정보 출력하기. 
		String horseInformation = horse1.toString();
		System.out.println("말 정보 : " + horseInformation);
		// 말 기능 출력하기.
		horse1.moveAction("다그닥 다닌다.");
		horse1.speakSound("히히힝~~~");
		System.out.println("말 사는 곳 : " + horse1.getPlace());
	}

}
