package UserInterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Page3_Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page3_Home frame = new Page3_Home();
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
	public Page3_Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color (23, 147, 61));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(150, 501, 880, 2);
		contentPane.add(separator);
		
		JButton btnLogout = new JButton("");
		btnLogout.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Page1_LogIn login = new Page1_LogIn();
				login.setVisible(true);
				setVisible(false);
			}
		});
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Page5_Vote vote = new Page5_Vote();
				vote.setVisible(true);
				setVisible(false);
			}
		});
		button.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\Vote.png"));
		button.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		button.setBounds(414, 530, 50, 50);
		contentPane.add(button);
		btnLogout.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\logout.png"));
		btnLogout.setBounds(834, 530, 50, 50);
		contentPane.add(btnLogout);
		
		JButton btnCalculate = new JButton("");
		btnCalculate.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Page6_Calculation cgpa = new Page6_Calculation();
				cgpa.setVisible(true);
				setVisible(false);
			}
		});
		btnCalculate.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\calculate.png"));
		btnCalculate.setBounds(691, 530, 50, 50);
		contentPane.add(btnCalculate);
		
		JLabel lblPicture = new JLabel("");
		lblPicture.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\LOGOSoftware-Engineering.png"));
		lblPicture.setBounds(381, 126, 400, 350);
		contentPane.add(lblPicture);
	}
}
