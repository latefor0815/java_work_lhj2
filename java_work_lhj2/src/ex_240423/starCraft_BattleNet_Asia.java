package ex_240423;

public class starCraft_BattleNet_Asia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("게임방법");
		//작업순서 1, 저그 객체를 생성한다
		zerg zerg1 = new zerg();
		// 작업순서 2 드론을 만들기.
		zerg1.setDrone("9드론 생산함");
		//작업순서3, 드론으로 자원 채취
		zerg1.makeMoney();
		//작업순서4, 드론으로 정찰보내기, 상대 종족, 날빌? 운영?
		zerg1.patrolDrone();
		//작업순서5, 전략선택하기
		String lsyZerStrateString = "이상용씨는 오늘 주말 새벽 아침부터 저그에 온 힘을 닿고 있다"
				+ "촨 정찰시 상대가 12앞 프로토스로 포지도 안짓고 있어서, 아싸리, 4드론을 간다.";
		zerg1.selectStrategy(lsyZerStrateString);
		
		System.out.println("오늘도 이사용씨는 주말마다 새벽에 몰래 게임하는 방법 연구 공부안함?");
	}

}
