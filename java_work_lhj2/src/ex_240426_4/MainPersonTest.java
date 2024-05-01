package ex_240426_4;

public class MainPersonTest {

	public static void main(String[] args) {
		// 다형성
		Person lsy = new Student();
		
		//
		Person lcs = new StudentWorker();
		
		//lsy는 Person, Student ->부모 메서드까지 즉,student의 study가 안보임.
		//보려고하면?? downcasting
		//lcs는 Person, Student
		//다운캐스팅 그냥하면 안됨 유효성 타입 체크 먼저. 그전에 타입 일치 시키고 작업
		//유효성 타입체크
		if (lsy instanceof Student) {
			//타입 맞는지 확인 후 다운 캐스팅 해야함.
			//문법상 체크상에는 표가 안남
			//실행시점에서 클래스캐스트 예외가 발생해서
			Student lsyStudent = (Student)lsy;
		}
		
	}

}
