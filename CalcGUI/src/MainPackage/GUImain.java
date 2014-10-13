package MainPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUImain extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUImain frame = new GUImain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUImain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInvestmentAmount = new JLabel("Investment Amount");
		lblInvestmentAmount.setBounds(37, 35, 126, 14);
		contentPane.add(lblInvestmentAmount);
		
		JLabel lblYears = new JLabel("Years");
		lblYears.setBounds(37, 72, 33, 14);
		contentPane.add(lblYears);
		
		JLabel lblAnnualInterestRate = new JLabel("Annual Interest Rate");
		lblAnnualInterestRate.setBounds(37, 114, 126, 14);
		contentPane.add(lblAnnualInterestRate);
		
		JLabel lblFutureValue = new JLabel("Future Value");
		lblFutureValue.setBounds(37, 156, 106, 14);
		contentPane.add(lblFutureValue);
		
		textField_1 = new JTextField();
		textField_1.setBounds(182, 35, 114, 20);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(182, 72, 114, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(182, 114, 114, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(182, 156, 114, 20);
		contentPane.add(textField_4);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(207, 208, 89, 23);
		btnCalculate.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						String tF1String = textField_1.getText();
						double tF1double = Double.parseDouble(tF1String);
						String tF2String = textField_2.getText();
						int tF2double = Integer.parseInt(tF2String);
						String tF3String = textField_3.getText();
						double tF3double = Double.parseDouble(tF3String);
						Calculator calc = new Calculator(tF1double, tF2double, tF3double);
						double future_value = Calculator.round2Places(calc.calculate());
						String future_value_string = String.valueOf(future_value);
						textField_4.setText(future_value_string);
					}
				}
		);
		contentPane.add(btnCalculate);
		
	}
}
