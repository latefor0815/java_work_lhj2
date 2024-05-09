package ex_240508;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldExTest extends JFrame implements ActionListener {
    private JLabel infoLabel;
    private JTextField nameField;
    private JTextField emailField;
    private JTextField passwordField;
    private JTextField confirmPasswordField;
    private JTextField infoTextField;

    public TextFieldExTest() {
        setTitle("회원가입창");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new GridLayout(10,10));
       

        c.add(new JLabel("이름 "));
        nameField = new JTextField("예) 홍길동", 21);
        c.add(nameField);

        c.add(new JLabel("이메일 "));
        emailField = new JTextField("예)showme@themoney.com", 20);
        c.add(emailField);

        c.add(new JLabel("패스워드"));
        passwordField = new JTextField(18);
        c.add(passwordField);

        c.add(new JLabel("비번확인"));
        confirmPasswordField = new JTextField(18);
        c.add(confirmPasswordField);
        
        JButton registerButton = new JButton("회원가입");
        registerButton.addActionListener(this);
        add(registerButton);
        
        infoLabel = new JLabel("정보 출력해보기");
        add(infoLabel);

        setSize(400, 400);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("회원가입")) {
            // 회원 가입 버튼을 클릭했을 때 실행되는 코드
            displayInformation();
        }
    }

    private void displayInformation() {
        String name = nameField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();

        String information = "이름: " + name + ", 이메일: " + email + ", 비밀번호: " + password + ", 비밀번호 확인: " + confirmPassword;
        infoLabel.setText(information);
    }

    public static void main(String[] args) {
        new TextFieldExTest();
    }
}