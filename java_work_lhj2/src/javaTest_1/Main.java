package javaTest_1;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Main extends JFrame {
	private final ArrayList<String> selectedBurgers = new ArrayList<>();
	private final ArrayList<String> selectedIngredients = new ArrayList<>();

	public Main() {
		super("햄버거 주문 및 회원가입");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(650, 650);

		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(10, 10, 10, 10);
		gbc.anchor = GridBagConstraints.WEST;

		// 회원가입 입력 필드
		JLabel nameLabel = new JLabel("이름:");
		JTextField nameField = new JTextField(15);
		JLabel emailLabel = new JLabel("이메일:");
		JTextField emailField = new JTextField(15);
		JLabel passwordLabel = new JLabel("비밀번호:");
		JPasswordField passwordField = new JPasswordField(15);
		//비밀번호 암호화해버리기

		gbc.gridx = 0;
		gbc.gridy = 0;
		panel.add(nameLabel, gbc);
		gbc.gridx = 1;
		panel.add(nameField, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		panel.add(emailLabel, gbc);
		gbc.gridx = 1;
		panel.add(emailField, gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		panel.add(passwordLabel, gbc);
		gbc.gridx = 1;
		panel.add(passwordField, gbc);

		// 회원가입 버튼
		JButton signUpButton = new JButton("회원가입");
		signUpButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 회원가입 로직을 여기에 추가
				String name = nameField.getText();
				String email = emailField.getText();
				String password = new String(passwordField.getPassword());

				// 회원가입 정보 처리
				JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다.");
			}
		});
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 2;
		panel.add(signUpButton, gbc);

		// 햄버거 선택 체크박스
		JLabel burgerLabel = new JLabel("햄버거를 선택하세요:");
		JCheckBox bulgogiCheckBox = new JCheckBox("불고기 버거");
		JCheckBox cheeseCheckBox = new JCheckBox("치즈 버거");
		JCheckBox chickenCheckBox = new JCheckBox("치킨 버거");

		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		panel.add(burgerLabel, gbc);
		gbc.gridx = 1;
		panel.add(bulgogiCheckBox, gbc);
		gbc.gridx = 2;
		panel.add(cheeseCheckBox, gbc);
		gbc.gridx = 3;
		panel.add(chickenCheckBox, gbc);

		// 재료 선택 체크박스
		JLabel ingredientLabel = new JLabel("추가할 재료를 선택하세요:");
		JCheckBox lettuceCheckBox = new JCheckBox("양상추");
		JCheckBox tomatoCheckBox = new JCheckBox("토마토");
		JCheckBox onionCheckBox = new JCheckBox("양파");
		JCheckBox pickleCheckBox = new JCheckBox("피클");

		gbc.gridx = 0;
		gbc.gridy = 5;
		panel.add(ingredientLabel, gbc);
		gbc.gridx = 1;
		panel.add(lettuceCheckBox, gbc);
		gbc.gridx = 2;
		panel.add(tomatoCheckBox, gbc);
		gbc.gridx = 3;
		panel.add(onionCheckBox, gbc);
		gbc.gridx = 4;
		panel.add(pickleCheckBox, gbc);

		// 주문 및 클리어 버튼
		JButton orderButton = new JButton("주문");
		orderButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				selectedBurgers.clear();
				selectedIngredients.clear();

				int totalPrice = 0;
				// 버거
				if (bulgogiCheckBox.isSelected()) {
					selectedBurgers.add("불고기 버거");
					totalPrice += 5000;
				}
				if (cheeseCheckBox.isSelected()) {
					selectedBurgers.add("치즈 버거");
					totalPrice += 4500;
				}
				if (chickenCheckBox.isSelected()) {
					selectedBurgers.add("치킨 버거");
					totalPrice += 5500;
				}
				// 재료선택
				if (lettuceCheckBox.isSelected()) {
					selectedIngredients.add("양상추");
					totalPrice += 500;
				}
				if (tomatoCheckBox.isSelected()) {
					selectedIngredients.add("토마토");
					totalPrice += 300;
				}
				if (onionCheckBox.isSelected()) {
					selectedIngredients.add("양파");
					totalPrice += 200;
				}
				if (pickleCheckBox.isSelected()) {
					selectedIngredients.add("피클");
					totalPrice += 400;
				}

				StringBuilder orderDetails = new StringBuilder("주문 내역:\n");

				if (!selectedBurgers.isEmpty()) {
					orderDetails.append("햄버거: ").append(String.join(", ", selectedBurgers)).append("\n");
				} else {
					orderDetails.append("햄버거: 없음\n");
				}

				if (!selectedIngredients.isEmpty()) {
					orderDetails.append("추가된 재료: ").append(String.join(", ", selectedIngredients)).append("\n");
				} else {
					orderDetails.append("추가된 재료: 없음\n");
				}

				orderDetails.append("총 가격: ").append(totalPrice).append("원");

				JOptionPane.showMessageDialog(null, orderDetails.toString(), "주문 내역", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		gbc.gridx = 0;
		gbc.gridy = 6;
		panel.add(orderButton, gbc);

		JButton clearButton = new JButton("클리어");
		clearButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				selectedBurgers.clear();
				selectedIngredients.clear();
				bulgogiCheckBox.setSelected(false);
				cheeseCheckBox.setSelected(false);
				chickenCheckBox.setSelected(false);
				lettuceCheckBox.setSelected(false);
				tomatoCheckBox.setSelected(false);
				onionCheckBox.setSelected(false);
				pickleCheckBox.setSelected(false);
			}
		});
		gbc.gridx = 1;
		panel.add(clearButton, gbc);

		add(panel);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Main();
	}
}
