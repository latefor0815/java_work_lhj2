package ex_240426_2;

public class ProtectedTest_2 {

	public class B{
		//접근조건 상속받은 클래스
		protected int n;
		protected void g(){
			n=5;
		}
	}
	
	class C {
		public void k() {
			B b = new B();
			b.n = 7;
			b.g();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
