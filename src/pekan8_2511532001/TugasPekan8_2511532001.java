package pekan8_2511532001;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TugasPekan8_2511532001 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JComboBox<String> cbA;
    private JComboBox<String> cbB;
    private JTextField txtHasil;

    private void warning(String msg) {
        JOptionPane.showMessageDialog(this, msg, "Warning", JOptionPane.WARNING_MESSAGE);
    }

    private void error(String msg) {
        JOptionPane.showMessageDialog(this, msg, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                TugasPekan8_2511532001 frame = new TugasPekan8_2511532001();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public TugasPekan8_2511532001() {
        setTitle("Operator Logika");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 520, 380);

        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);

        JLabel lblTitle = new JLabel("OPERATOR LOGIKA");
        lblTitle.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
        lblTitle.setBounds(165, 10, 200, 30);
        contentPane.add(lblTitle);

        JLabel lblA = new JLabel("Boolean A");
        lblA.setBounds(55, 60, 100, 25);
        contentPane.add(lblA);

        JLabel lblB = new JLabel("Boolean B");
        lblB.setBounds(55, 100, 100, 25);
        contentPane.add(lblB);

        JLabel lblOp = new JLabel("Operator");
        lblOp.setBounds(55, 140, 100, 25);
        contentPane.add(lblOp);

        JLabel lblHasil = new JLabel("Hasil");
        lblHasil.setBounds(55, 180, 100, 25);
        contentPane.add(lblHasil);

        cbA = new JComboBox<>();
        cbA.setModel(new DefaultComboBoxModel<>(new String[]{"true", "false"}));
        cbA.setBounds(150, 60, 80, 25);
        contentPane.add(cbA);

        cbB = new JComboBox<>();
        cbB.setModel(new DefaultComboBoxModel<>(new String[]{"true", "false"}));
        cbB.setBounds(150, 100, 80, 25);
        contentPane.add(cbB);

        txtHasil = new JTextField();
        txtHasil.setEditable(false);
        txtHasil.setBounds(150, 180, 80, 25);
        contentPane.add(txtHasil);

        JComboBox<String> cbOp = new JComboBox<>();
        cbOp.setModel(new DefaultComboBoxModel<>(new String[]{"&&", "||", "!"}));
        cbOp.setBounds(150, 140, 80, 25);
        contentPane.add(cbOp);

        JButton btnProses = new JButton("Proses");
        btnProses.setBounds(270, 140, 100, 25);
        contentPane.add(btnProses);

        btnProses.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String A = cbA.getSelectedItem().toString();
                String B = cbB.getSelectedItem().toString();
                String op = cbOp.getSelectedItem().toString();

                boolean a = Boolean.parseBoolean(A);
                boolean b = Boolean.parseBoolean(B);
                boolean hasil = false;

                switch (op) {
                    case "&&":
                        hasil = a && b;
                        break;

                    case "||":
                        hasil = a || b;
                        break;

                    case "!":
                        hasil = !a;
                        break;
                }

                txtHasil.setText(String.valueOf(hasil));
            }
        });
    }
}
