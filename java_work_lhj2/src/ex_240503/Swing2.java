package ex_240503;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import ex_240503.Swing2;

public class Swing2 extends JFrame{
	public Swing2() {
		//제목
		setTitle("300x300 스윙 프레임 만들기");
		//창의 X 표시를 클릭시 종료하는 코드
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//창사이즈
		setSize(300, 300);
 
		// 프레임의 컨텐트팬을 알아낸다.
		Container contentPane = getContentPane(); 
	
		//패널 더 추가해보기
		//Container contentPane = getContentPane(); // 컨텐트팬 알아내기 
		contentPane.setBackground(Color.ORANGE); // 오렌지색 배경 설정
		//html flex랑 동일, 기본 가로 순차배치
		//마진처럼 왼쪽 오른쪽 저렬 : 수평 : 수직 간격주고
		//new FlowLayout(정렬방법, 수평간격, 수직간격)
		//new BorderLayout(수평간격, 수직간격)
		contentPane.setLayout(new BorderLayout(50,30)); // 컨텐트팬에 FlowLayout
		//new BorderLayout()-> , 
		//contentPane.add(요소, 위치)
		contentPane.add(new JButton("OK"),BorderLayout.CENTER); // OK 버튼 달기 
		contentPane.add(new JButton("Cancel"),BorderLayout.EAST); // Cancel 버튼 달기 
		contentPane.add(new JButton("Ignore"),BorderLayout.WEST); // Ignore 버튼 달기
		contentPane.add(new JButton("Home"),BorderLayout.SOUTH);
		// 버튼 컴포넌트 생성
		JButton button = new JButton("Click");
		// 컨텐트팬 여기에 버튼을 붙이는 코드 
		contentPane.add(button,BorderLayout.NORTH); // 컨텐트팬에 버튼 부착
		
		//창 보여줄지 여부
		setVisible(true);
		
		
		}

	public static void main(String[] args) {
		// 인스턴스를 생성하는 과정 중에, 기본 생성자를 호출해서, 실행함. 
		Swing2 swing1 = new Swing2();

	}

}
