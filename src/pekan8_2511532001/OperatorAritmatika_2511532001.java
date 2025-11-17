package pekan8_2511532001;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatorAritmatika_2511532001 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBil1;
	private JTextField txtBil2;
	private JTextField txtHasil;
	
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Peringatan",JOptionPane.WARNING_MESSAGE);
	}
	private void pesanError(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Kesalahan",JOptionPane.WARNING_MESSAGE);
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatika_2511532001 frame = new OperatorAritmatika_2511532001();
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
	public OperatorAritmatika_2511532001() {
		setResizable(false);
		setTitle("Operator Aritmatika");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ARITMATIKA");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		lblNewLabel.setBounds(158, 10, 188, 55);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bilangan 1");
		lblNewLabel_1.setBounds(55, 62, 76, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Bilangan 2");
		lblNewLabel_1_1.setBounds(55, 103, 76, 30);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Operator");
		lblNewLabel_1_1_1.setBounds(55, 152, 76, 30);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Hasil");
		lblNewLabel_1_1_1_1.setBounds(55, 192, 76, 30);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		txtBil1 = new JTextField();
		txtBil1.setBounds(130, 68, 64, 19);
		contentPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		txtBil2 = new JTextField();
		txtBil2.setColumns(10);
		txtBil2.setBounds(130, 109, 64, 19);
		contentPane.add(txtBil2);
		
		txtHasil = new JTextField();
		txtHasil.setEditable(false);
		txtHasil.setColumns(10);
		txtHasil.setBounds(130, 198, 64, 19);
		contentPane.add(txtHasil);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		cbOperator.setBounds(130, 157, 64, 21);
		contentPane.add(cbOperator);
		
		JButton btnNewButton = new JButton("Proses");
		btnNewButton.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent arg0) {
				if(txtBil1.getText().trim().isEmpty()) {
					pesanPeringatan ("Silahkan Input Bilangan 1");
				} else if(txtBil2.getText().trim().isEmpty()) {
					pesanPeringatan ("Silahkan Input Bilangan 2");
				} else {
					try {
						int a = Integer.parseInt(txtBil1.getText());
				int b = Integer.parseInt(txtBil2.getText());
				int c = cbOperator.getSelectedIndex();
				if(c==0) {
					hasil= a+b;
				}
				if(c==1) {
					hasil= a-b;
				}
				if(c==2) {
					hasil= a*b;
				}
				if(c==3) {
					hasil= a/b;
				}
				if(c==4){
					hasil= a%b;
				}
				txtHasil.setText(String.valueOf(hasil));
				//txtHasil.setText("HelloWorld");
						
					}catch (NumberFormatException ex) {
						pesanError("Bilangan 1 dan Bilangan 2 Harus Angka");
					}
				}
				
				
				}
			
		});
		btnNewButton.setBounds(245, 157, 85, 21);
		contentPane.add(btnNewButton);

	}
}
