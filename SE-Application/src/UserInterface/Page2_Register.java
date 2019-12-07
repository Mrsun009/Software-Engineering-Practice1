package UserInterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Page2_Register extends JFrame {

	private JPanel contentPane;
	private JTextField textstudentid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page2_Register frame = new Page2_Register();
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
	public Page2_Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color (23, 147, 61));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(300, 120, 600, 500);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textstudentid = new JTextField();
		textstudentid.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num = evt.getKeyChar();
				if(!(Character.isDigit(num)) || (num == KeyEvent.VK_BACK_SPACE) || (num == KeyEvent.VK_DELETE))
				{
					evt.consume();
				}
			
			if(textstudentid.getText().length()==10)
			{
				evt.consume();
			}
			
			}
		});
		textstudentid.setBackground(Color.WHITE);
		textstudentid.setHorizontalAlignment(SwingConstants.LEFT);
		textstudentid.setFont(new Font("Lucida Bright", Font.BOLD, 30));
		textstudentid.setBounds(175, 196, 250, 40);
		panel.add(textstudentid);
		textstudentid.setColumns(10);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Page1_LogIn login = new Page1_LogIn();
				login.setVisible(true);
				setVisible(false);
				JOptionPane.showMessageDialog(null,"Register complete","Register",JOptionPane.PLAIN_MESSAGE);
			}
		});
		btnRegister.setFont(new Font("Bodoni MT Black", Font.PLAIN, 20));
		btnRegister.setBounds(225, 274, 150, 30);
		panel.add(btnRegister);
		
		JLabel lblNewAccount = new JLabel("New Account");
		lblNewAccount.setFont(new Font("Rockwell", Font.PLAIN, 30));
		lblNewAccount.setBounds(200, 13, 200, 30);
		panel.add(lblNewAccount);
		
		Button btnBack = new Button("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Page1_LogIn login = new Page1_LogIn();
				login.setVisible(true);
				setVisible(false);
			}
		});
		btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 25));
		btnBack.setBounds(27, 455, 100, 30);
		panel.add(btnBack);
		
		JLabel lblstudentid = new JLabel("Student ID");
		lblstudentid.setFont(new Font("Sitka Heading", Font.BOLD, 25));
		lblstudentid.setBounds(175, 167, 150, 30);
		panel.add(lblstudentid);
	}

}
