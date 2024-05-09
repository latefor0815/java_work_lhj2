package ex_240508;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import ex_240508.CheckBoxItemEventEx.MyItemListener;
import util.eventListener.MyItemListener1;

public class CheckBoxItemEventEx2 extends JFrame {
    private JCheckBox[] foods = new JCheckBox[3];
    private String[] names = { "카레", "라멘", "돈까스" };
    public JLabel sumLabel;

    public CheckBoxItemEventEx2() {
        setTitle("먹고 싶은 점심 메뉴");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        
        // 패널에 라벨붙이기
        c.add(new JLabel("카레 1000원, 라멘 1500원, 돈까스 2000원"));
        
        // 이벤트 처리기작업
        MyItemListener1 listener = new MyItemListener1(this);
        for (int i = 0; i < foods.length; i++) {
            //fruits[i] 요소로 JCheckBox 인스턴스
            //String[] names = { "사과", "배", "체리" }
            foods[i] = new JCheckBox(names[i]);
            foods[i].setBorderPainted(true);
            c.add(foods[i]);
            foods[i].addItemListener(listener);
        }
        sumLabel = new JLabel("현재 0 원 입니다.");
        c.add(sumLabel);
        setSize(250, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBoxItemEventEx2();
    }
}
