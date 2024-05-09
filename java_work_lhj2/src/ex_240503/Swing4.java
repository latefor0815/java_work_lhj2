package ex_240503;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import ex_240503.Swing4;

public class Swing4 extends JFrame{
	public Swing4() {
		//제목
		setTitle("300x300 스윙 프레임 만들기");
		//창의 X 표시를 클릭시 종료하는 코드
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//창사이즈
		setSize(1000, 800);
 
		// 프레임의 컨텐트팬을 알아낸다.
		Container contentPane = getContentPane(); 
	
		//패널 더 추가해보기
		//Container contentPane = getContentPane(); // 컨텐트팬 알아내기 
		contentPane.setBackground(Color.ORANGE); // 오렌지색 배경 설정
		//html flex랑 동일, 기본 가로 순차배치
		//마진처럼 왼쪽 오른쪽 저렬 : 수평 : 수직 간격주고
		//new FlowLayout(정렬방법, 수평간격, 수직간격)
		//new BorderLayout(수평간격, 수직간격)
		//new GridLayout(행,열,수직,수평) 
		contentPane.setLayout(null); // 컨텐트팬에 FlowLayout
		//new BorderLayout()-> , 
		//contentPane.add(요소, 위치)
		JLabel la = new JLabel("Hello, Press Buttons!"); 
		  la.setLocation(130, 50); // la를 (130,50) 위치로 지정  오른쪽 130 만큼 이동 아랫쪽으로 50만큼 이동
		  la.setSize(200, 20); // la를 200x20 크기로 지정 
		  contentPane.add(la); // la를 컨텐트팬에 부착 
		 
		  // 9개의 버튼 컴포넌트를 생성하고 동일한 크기로 설정한다. 
		  // 위치는 서로 겹치게 설정한다. 
		  for(int i=1; i<=9; i++) { 
		   JButton b = new JButton("버튼 " + Integer.toString(i)); // 버튼 생성 
		   b.setLocation(i*15, i*15); // 버튼의 위치 설정  
		   b.setSize(200, 150); // 버튼의 크기는 동일하게 50x20 
		   contentPane.add(b); // 버튼을 컨텐트팬에 부착 
		  } 
		
		
		//임의로 버튼 오른쪽에 하나 더 추가해보기
		  JButton tempBtn = new JButton("TempBtn");
		  tempBtn.setLocation(500,400);
		  tempBtn.setSize(200, 150);
		  contentPane.add(tempBtn);
	
		
		//창 보여줄지 여부
		setVisible(true);
		
		
		}

	public static void main(String[] args) {
		// 인스턴스를 생성하는 과정 중에, 기본 생성자를 호출해서, 실행함. 
		Swing4 swing1 = new Swing4();

	}

}
