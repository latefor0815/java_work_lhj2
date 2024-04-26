package ex_240426;

class Sample{
	public int a;
	private int b = 100;
	int c;
	public int getB() {
		return b;
	}
  //전역만 확인해보기 -> 공용
	static int tvChannel =3; //차달남
	public static void channelUp() {
		tvChannel++;
	}
	public static void channelDown() {
		tvChannel--;
	}
	
	
}

public class AccessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample sample = new Sample();
//		sample.b=3;
		int result = sample.getB();
		System.out.println("result :" + result);
		//직접쓰기
		sample.a = 200;
		//직접읽기
		System.out.println("sample.a의 값 :" + sample.a);
		
		//이사용ㅇ씨가 강루키 홍사자 프로젝트로 인해 합숙중 공용거실에 쉬는중.
		Sample lsy = new Sample();
		Sample krk = new Sample();
		Sample hsj = new Sample();
		System.out.println("이상용씨가 티비를" +lsy.tvChannel +"번 채널 시청중");
		System.out.println("강루키 씨가 UFC를 보고 싶어서 채널 1올림" );
		//강루키씨가 채널 변경
		krk.channelUp();
		System.out.println("이상용씨와, 홍사자는 같이 채널"+lsy.tvChannel +"번 채널 시청중");
	}

}
