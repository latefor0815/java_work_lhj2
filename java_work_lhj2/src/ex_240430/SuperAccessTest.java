package ex_240430;


class Parent {
	public String parentname;
	
	public void makeNoodle() {
		System.out.println("국수 메뉴로 국수만들기");
	}
}

class Child extends Parent {
	public String childName;
}

public class SuperAccessTest {

	public static void main(String[] args) {
		//업캐스팅, 부모타입 = 자식타입
		Parent p1 = new Child();
		//부모 멤버에 접근가능
//		p1.parentName;
		//다운 캐스팅 , 자식타입 = (자식타입)부모타입
		Child c1 = (Child)p1;
		//자식 클래스 및 부모 클래스도 보임
//		c1.childName;
		//범위지정 ctrl + H 
	}

}
