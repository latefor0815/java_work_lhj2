package ex_240423;

public class zerg {
	//멤버들
	private String drone;
	private String zergling;
	private String hydra;
	
	//멤버의 값에 접근 또는 설정을 위해서 getter/setter을 만든다
	
	
	public String getDrone() {
		return drone;
	}
	public void setDrone(String drone) {
		this.drone = drone;
	}
	public String getZergling() {
		return zergling;
	}
	public void setZergling(String zergling) {
		this.zergling = zergling;
	}
	public String getHydra() {
		return hydra;
	}
	public void setHydra(String hydra) {
		this.hydra = hydra;
	}
	
	// 드론 일하기 메서드 만들기.
	public void makeMoney() {
		System.out.println("드론으로 미네랄,가스 채취하기.");
	}

	// 정찰을 반드시 보내야함.
	public void patrolDrone() {
		System.out.println("드론으로 스타팅 포인트로 정찰 보내기 매우 중요.!!");
	}
	
	//전략을 선택 9 오버풀, 12앞, 3해처리 뮤, 럴, 3해처리 노스포닝 풀
	//초반에 빨리 애들 꺠우러 가야지 4드론 9드론

	
	public void selectgogo(String gogo) {
		System.out.println("내가 선택한 전략 :" + gogo);
	}
	public void selectStrategy(String lsyZerStrateString) {
		// TODO Auto-generated method stub
		
	}
	public zerg(String drone, String zergling, String hydra) {
		super();
		this.drone = drone;
		this.zergling = zergling;
		this.hydra = hydra;
	}
	
	//매개변수 없는 생성자 = 디폴트 생성자라고함
	//별로 말이 없으면 시스템이 알아서 만들어줌
	//하지만 내가 따로 매개변수가 있는 생성잘르 만들면 기본생성자를 안만들어줌
	public zerg() {
		// TODO Auto-generated constructor stub
	}
	
	//tostring 해당 객체에 있는 내용을 한방에 출력해주는 메서드 만들기
	//우클릭 -> 소스 -> generate tostring -> 멤버 3개 선택하고 만들기, 옵션 선택 무
	@Override
	public String toString() {
		return "zerg [drone=" + drone + ", zergling=" + zergling + ", hydra=" + hydra + "]";
	}
	
	
	
	
	
	
}
