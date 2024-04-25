package ex_240423;

public class sports {
	
	public static final String DDD = "풋볼은 한국에서 유명하지 않다."; //전역상수
    private String qutter;
    private String defender;
    private String runner;

    
    //전역 메서드

    public static void showComment(){
    	System.out.println("sdfsdf");
    }
    // toString() 메서드 정의
    @Override
    public String toString() {
        return "sports [qutter=" + qutter + ", defender=" + defender + ", runner=" + runner + "]";
    }

    // Getter 및 Setter 메서드
    public String getQutter() {
        return qutter;
    }

    public void setQutter(String qutter) {
        this.qutter = qutter;
    }

    public String getDefender() {
        return defender;
    }

    public void setDefender(String defender) {
        this.defender = defender;
    }

    public String getRunner() {
        return runner;
    }

    public void setRunner(String runner) {
        this.runner = runner;
    }
    

    // 게임 동작에 관련된 메서드들
    public void passboll() {
        System.out.println("쿼터백은 러너에게 공을 패스해야한다.");
    }

    public void runawy() {
        System.out.println("공을 받은 러너는 수비를 피해 골로 달려야한다.");
    }

    public void defend() {
        System.out.println("디펜더는 러너가 터치다운 할 수 있게 선수들을 막는다.");
    }

    public void selectStrategy(String strategy) {
        System.out.println("필승전략: " + strategy);
    }
}

