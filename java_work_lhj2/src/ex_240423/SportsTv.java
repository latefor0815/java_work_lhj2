package ex_240423;

public class SportsTv {

    public static void main(String[] args) {
        System.out.println("게임 방법");

        // sports 클래스의 인스턴스 생성
        sports football = new sports();

        // 메서드 호출을 통한 동작 확인
        football.passboll();
        football.runawy();
        football.defend();
        
        
        // 전략 선택 및 출력
        String strategy = "킥으로 점수 내야한다";
        football.selectStrategy(strategy);

        System.out.println("파이팅");
        
        System.out.println(football.toString());
        System.out.println("DDD :" + sports.DDD);
       
    }
}
///인스턴스는 new를 사용해야함.