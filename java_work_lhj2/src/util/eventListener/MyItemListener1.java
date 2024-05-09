package util.eventListener;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;

import ex_240508.CheckBoxItemEventEx2;

public class MyItemListener1 implements ItemListener {
    private int sum = 0; // 가격의 합
    private CheckBoxItemEventEx2 frame;

    public MyItemListener1(CheckBoxItemEventEx2 frame) {
        this.frame = frame;
    }

    public void itemStateChanged(ItemEvent event) {
        JCheckBox checkBox = (JCheckBox) event.getItem();
        if (event.getStateChange() == ItemEvent.SELECTED) {
            if (checkBox.getText().equals("카레"))
                sum += 1000;
            else if (checkBox.getText().equals("라멘"))
                sum += 1500;
            else
                sum += 2000;
        } else {
            if (checkBox.getText().equals("카레"))
                sum -= 1000;
            else if (checkBox.getText().equals("라멘"))
                sum -= 1500;
            else
                sum -= 2000;
        }
        frame.sumLabel.setText("현재 " + sum + "원 입니다.");
    }
}
