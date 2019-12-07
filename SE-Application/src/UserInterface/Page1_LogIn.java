package UserInterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import java.awt.Panel;
import java.awt.Button;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Page1_LogIn extends JFrame {

	private JPanel contentPane;
	private JTextField textStudentID;
	private void JTextFieldKeyTyped(java.awt.event.KeyEvent evt){
		
		
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page1_LogIn frame = new Page1_LogIn();
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
	public Page1_LogIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color (23, 147, 61));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(200, 209, 800, 350);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textStudentID = new JTextField();
		textStudentID.setBounds(475, 129, 250, 40);
		panel.add(textStudentID);
		textStudentID.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				
				// text get number
				char num = evt.getKeyChar();
					if(!(Character.isDigit(num)) || (num == KeyEvent.VK_BACK_SPACE) || (num == KeyEvent.VK_DELETE))
					{
						evt.consume();
					}
				// Input number
				if(textStudentID.getText().length()==10)
				{
					evt.consume();
				}
			}
			
		});
		textStudentID.setHorizontalAlignment(SwingConstants.LEFT);
		textStudentID.setFont(new Font("Engravers MT", Font.PLAIN, 30));
		textStudentID.setColumns(10);
		
		Button btnLogin = new Button("Log in");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textStudentID.getText().equals("009") || textStudentID.getText().equals("6231305009")) {
					Page3_Home home = new Page3_Home();
					home.setVisible(true);
					setVisible(false);
				}else if (textStudentID.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Invalid Login Details" , "Login Error" , JOptionPane.ERROR_MESSAGE);
				}else {JOptionPane.showMessageDialog(null, "Invalid Login Details" , "Login Error" , JOptionPane.ERROR_MESSAGE);}
			}
		});
		btnLogin.setFont(new Font("Stencil", Font.BOLD, 30));
		btnLogin.setBounds(525, 180, 150, 40);
		panel.add(btnLogin);
		
		Button btnRegister = new Button("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Page2_Register register = new Page2_Register();
				register.setVisible(true);
				setVisible(false);
				
			}
		});
		btnRegister.setFont(new Font("Courier New", Font.BOLD, 20));
		btnRegister.setBounds(540, 280, 120, 30);
		panel.add(btnRegister);
		
		JLabel lblStudentId = new JLabel("Student ID");
		lblStudentId.setVerticalAlignment(SwingConstants.TOP);
		lblStudentId.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentId.setFont(new Font("Sitka Display", Font.BOLD, 20));
		lblStudentId.setBounds(475, 96, 100, 20);
		panel.add(lblStudentId);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(425, 255, 350, 1);
		panel.add(separator);
		
		JLabel lblPicture = new JLabel("");
		lblPicture.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\se.png"));
		lblPicture.setBounds(100, 50, 200, 200);
		panel.add(lblPicture);
		
		JLabel lblSE = new JLabel("Software Engineering");
		lblSE.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblSE.setBounds(80, 270, 240, 20);
		panel.add(lblSE);
		
		JLabel lblMFU = new JLabel("MAE FAH LUANG UNIVERSITY");
		lblMFU.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblMFU.setVerticalAlignment(SwingConstants.TOP);
		lblMFU.setHorizontalAlignment(SwingConstants.CENTER);
		lblMFU.setBounds(50, 290, 300, 20);
		panel.add(lblMFU);
	}
}
