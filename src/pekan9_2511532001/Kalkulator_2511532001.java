package pekan9_2511532001;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Kalkulator_2511532001 {

	private JFrame frame;
	private JTextField textField_2511532001;
	private JButton btnC_2511532001;
	private JButton btn00_2511532001;
	private JButton btnPlus_2511532001;
	private JButton btn7_2511532001;
	private JButton btn4_2511532001;
	private JButton btn1_2511532001;
	private JButton btn0_2511532001;
	private JButton btn8_2511532001;
	private JButton btn5_2511532001;
	private JButton btn2_2511532001;
	private JButton btnDot_2511532001;
	private JButton btn9_2511532001;
	private JButton btn6_2511532001;
	private JButton btn3_2511532001;
	private JButton btnEqual_2511532001;
	private JButton btnMinus_2511532001;
	private JButton btnMul_2511532001;
	private JButton btnDiv_2511532001;
	private JButton btnMod__2511532001;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulator_2511532001 window = new Kalkulator_2511532001();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Kalkulator_2511532001() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 348, 397);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField_2511532001 = new JTextField();
		textField_2511532001.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_2511532001.setBounds(10, 10, 314, 55);
		frame.getContentPane().add(textField_2511532001);
		textField_2511532001.setColumns(10);
		
		JButton btnB_2511532001 = new JButton("\uF0E7");
		btnB_2511532001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField_2511532001.getText().length()>0) {
					StringBuilder str=new StringBuilder (textField_2511532001.getText());
					str.deleteCharAt (textField_2511532001.getText().length()-1);
					backSpace=str.toString();
					textField_2511532001.setText(backSpace);
				}
			}
		});
		btnB_2511532001.setFont(new Font("Wingdings", Font.BOLD, 18));
		btnB_2511532001.setBounds(10, 86, 68, 46);
		frame.getContentPane().add(btnB_2511532001);
		
		btnC_2511532001 = new JButton("C");
		btnC_2511532001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2511532001.setText(null);
			}
		});
		btnC_2511532001.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnC_2511532001.setBounds(88, 86, 68, 46);
		frame.getContentPane().add(btnC_2511532001);
		
		btn00_2511532001 = new JButton("00");
		btn00_2511532001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        String number = textField_2511532001.getText() + btn00_2511532001.getText();
		        textField_2511532001.setText(number);
			}
		});
		btn00_2511532001.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn00_2511532001.setBounds(168, 86, 68, 46);
		frame.getContentPane().add(btn00_2511532001);
		
		btnPlus_2511532001 = new JButton("+");
		btnPlus_2511532001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField_2511532001.getText());
				textField_2511532001.setText("");
				operation = "+";

			}
		});
		btnPlus_2511532001.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus_2511532001.setBounds(246, 86, 68, 46);
		frame.getContentPane().add(btnPlus_2511532001);
		
		btn7_2511532001 = new JButton("7");
		btn7_2511532001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        String number = textField_2511532001.getText() + btn7_2511532001.getText();
		        textField_2511532001.setText(number);
			}
		});
		btn7_2511532001.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7_2511532001.setBounds(10, 142, 68, 46);
		frame.getContentPane().add(btn7_2511532001);
		
		btn4_2511532001 = new JButton("4");
		btn4_2511532001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        String number = textField_2511532001.getText() + btn4_2511532001.getText();
		        textField_2511532001.setText(number);
			}
		});
		btn4_2511532001.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4_2511532001.setBounds(10, 199, 68, 46);
		frame.getContentPane().add(btn4_2511532001);
		
		btn1_2511532001 = new JButton("1");
		btn1_2511532001.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String number = textField_2511532001.getText() + btn1_2511532001.getText();
		        textField_2511532001.setText(number);
		    }
		});

		btn1_2511532001.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1_2511532001.setBounds(10, 257, 68, 46);
		frame.getContentPane().add(btn1_2511532001);
		
		btn0_2511532001 = new JButton("0");
		btn0_2511532001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        String number = textField_2511532001.getText() + btn0_2511532001.getText();
		        textField_2511532001.setText(number);
			}
		});
		btn0_2511532001.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0_2511532001.setBounds(10, 313, 68, 46);
		frame.getContentPane().add(btn0_2511532001);
		
		btn8_2511532001 = new JButton("8");
		btn8_2511532001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        String number = textField_2511532001.getText() + btn8_2511532001.getText();
		        textField_2511532001.setText(number);
			}
		});
		btn8_2511532001.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8_2511532001.setBounds(88, 142, 68, 46);
		frame.getContentPane().add(btn8_2511532001);
		
		btn5_2511532001 = new JButton("5");
		btn5_2511532001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        String number = textField_2511532001.getText() + btn5_2511532001.getText();
		        textField_2511532001.setText(number);
			}
		});
		btn5_2511532001.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5_2511532001.setBounds(88, 199, 68, 46);
		frame.getContentPane().add(btn5_2511532001);
		
		btn2_2511532001 = new JButton("2");
		btn2_2511532001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        String number = textField_2511532001.getText() + btn2_2511532001.getText();
		        textField_2511532001.setText(number);
			}
		});
		btn2_2511532001.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2_2511532001.setBounds(88, 257, 68, 46);
		frame.getContentPane().add(btn2_2511532001);
		
		btnDot_2511532001 = new JButton(".");
		btnDot_2511532001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        String number = textField_2511532001.getText() + btnDot_2511532001.getText();
		        textField_2511532001.setText(number);
			}
		});
		btnDot_2511532001.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot_2511532001.setBounds(88, 313, 68, 46);
		frame.getContentPane().add(btnDot_2511532001);
		
		btn9_2511532001 = new JButton("9");
		btn9_2511532001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        String number = textField_2511532001.getText() + btn9_2511532001.getText();
		        textField_2511532001.setText(number);
			}
		});
		btn9_2511532001.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9_2511532001.setBounds(168, 142, 68, 46);
		frame.getContentPane().add(btn9_2511532001);
		
		btn6_2511532001 = new JButton("6");
		btn6_2511532001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        String number = textField_2511532001.getText() + btn6_2511532001.getText();
		        textField_2511532001.setText(number);
			}
		});
		btn6_2511532001.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6_2511532001.setBounds(168, 199, 68, 46);
		frame.getContentPane().add(btn6_2511532001);
		
		btn3_2511532001 = new JButton("3");
		btn3_2511532001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        String number = textField_2511532001.getText() + btn3_2511532001.getText();
		        textField_2511532001.setText(number);
			}
		});
		btn3_2511532001.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3_2511532001.setBounds(168, 257, 68, 46);
		frame.getContentPane().add(btn3_2511532001);
		
		btnEqual_2511532001 = new JButton("=");
		btnEqual_2511532001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField_2511532001.getText());
				if (operation == "+")
				{
				    result = first + second;
				    answer = String.format("%.2f", result);
				    textField_2511532001.setText(answer);
				}
				else if (operation == "-")
				{
				    result = first - second;
				    answer = String.format("%.2f", result);
				    textField_2511532001.setText(answer);
				}
				else if (operation == "*")
				{
				    result = first * second;
				    answer = String.format("%.2f", result);
				    textField_2511532001.setText(answer);
				}
				else if (operation == "/")
				{
				    result = first / second;
				    answer = String.format("%.2f", result);
				    textField_2511532001.setText(answer);
				}
				else if (operation == "%")
				{
				    result = first % second;
				    answer = String.format("%.2f", result);
				    textField_2511532001.setText(answer);
				}

			}
		});
		
		btnEqual_2511532001.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual_2511532001.setBounds(168, 313, 68, 46);
		frame.getContentPane().add(btnEqual_2511532001);
		
		btnMinus_2511532001 = new JButton("-");
		btnMinus_2511532001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField_2511532001.getText());
				textField_2511532001.setText("");
				operation = "-";
			}
		});
		btnMinus_2511532001.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMinus_2511532001.setBounds(246, 142, 68, 46);
		frame.getContentPane().add(btnMinus_2511532001);
		
		btnMul_2511532001 = new JButton("*");
		btnMul_2511532001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField_2511532001.getText());
				textField_2511532001.setText("");
				operation = "*";
			}
		});
		btnMul_2511532001.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMul_2511532001.setBounds(246, 199, 68, 46);
		frame.getContentPane().add(btnMul_2511532001);
		
		btnDiv_2511532001 = new JButton("/");
		btnDiv_2511532001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField_2511532001.getText());
				textField_2511532001.setText("");
				operation = "/";
			}
		});
		btnDiv_2511532001.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDiv_2511532001.setBounds(246, 257, 68, 46);
		frame.getContentPane().add(btnDiv_2511532001);
		
		btnMod__2511532001 = new JButton("%");
		btnMod__2511532001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField_2511532001.getText());
				textField_2511532001.setText("");
				operation = "%";
			}
		});
		btnMod__2511532001.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMod__2511532001.setBounds(246, 313, 68, 46);
		frame.getContentPane().add(btnMod__2511532001);
	}
}
