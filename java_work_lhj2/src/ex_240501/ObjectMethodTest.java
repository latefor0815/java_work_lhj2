package ex_240501;

class Person { //암묵적으로 object클래스를 상속 받고있다.
	private String name, email;

	public Person(String name, String email) {
	super();
	this.name = name;
	this.email = email;
}

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + "]";
	}

	public String getName() { 
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	//toString 아직 재정의 안했음 toString 메섣를 부모꺼를 사용하고있음
}

public class ObjectMethodTest {

	public static void main(String[] args) {
		Person p1 = new Person("이현종","vlddia@naver.com");
		Person p2 = new Person("이현종","vlddia@naver.com");
		//object의 toString 메서드임.
		String result = p1.toString();
		System.out.println("Object의 toStrign 이용해서 출력한 결과 :" + result);

		
		
		//object의 기보 ㄴequals 비교시 메모리위치 주솟값 비교한다.
	}

}
