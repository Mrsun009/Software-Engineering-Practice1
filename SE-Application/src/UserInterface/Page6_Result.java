package UserInterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.Console;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import java.awt.SystemColor;


public class Page6_Result extends JFrame {

private JPanel contentPane;
	
	private Panel panel1st;
	private JLabel lblTerm1;
	private JTextField textGPA1st;
	private JLabel lblGrade1;
	private JTextField textGPA2nd;
	
	private JTextField textResult;
	private JButton button;
	private JLabel lblTGPA3rd;
	private JLabel lblTGPA4th;
	private JTextField textGPA3rd;
	private JTextField textGPA4th;
	
	private String A1;
	private String A2;
	private String A3;
	private String A4;
	private String A5;
	private String A6;
	private String A7;
	private String A8;
	private String B1;
	private String B2;
	private String B3;
	private String B4;
	private String B5;
	private String B6;
	private String B7;
	private String B8;
	private String R1;
	private String R2;
	private String R3;
	private String R4;
	
	private String GPAX;
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page6_GPA1 frame = new Page6_GPA1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public String getA1() {
		return A1;
	}
	public void setA1(String ca1) {
		this.A1 = ca1;
	}
	public String getA2() {
		return A2;
	}
	public void setA2(String ca2) {
		this.A2 = ca2;
	}
	public String getA3() {
		return A3;
	}
	public void setA3(String ca3) {
		this.A3 = ca3;
	}
	public String getA4() {
		return A4;
	}
	public void setA4(String ca4) {
		this.A4 = ca4;
	}
	public String getA5() {
		return A5;
	}
	public void setA5(String ca5) {
		this.A5 = ca5;
	}
	public String getA6() {
		return A6;
	}
	public void setA6(String ca6) {
		this.A6 = ca6;
	}
	public String getA7() {
		return A7;
	}
	public void setA7(String ca7) {
		this.A7 = ca7;
	}
	public String getA8() {
		return A8;
	}
	public void setA8(String ca8) {
		this.A8 = ca8;
	}
	
	
	public String getB1() {
		return B1;
	}
	public void setB1(String gb1) {
		this.B1 = gb1;
	}
	public String getB2() {
		return B2;
	}
	public void setB2(String gb2) {
		this.B2 = gb2;
	}
	public String getB3() {
		return B3;
	}
	public void setB3(String gb3) {
		this.B3 = gb3;
	}
	public String getB4() {
		return B4;
	}
	public void setB4(String gb4) {
		this.B4 = gb4;
	}
	public String getB5() {
		return B5;
	}
	public void setB5(String gb5) {
		this.B5 = gb5;
	}
	public String getB6() {
		return B6;
	}
	public void setB6(String gb6) {
		this.B6 = gb6;
	}
	public String getB7() {
		return B7;
	}
	public void setB7(String gb7) {
		this.B7 = gb7;
	}
	public String getB8() {
		return B8;
	}
	public void setB8(String gb8) {
		this.B8 = gb8;
	}
	
	
	
	public String getR1() {
		return R1;
	}
	public void setR1(String r1) {
		this.R1 = r1;
		textGPA1st.setText(String.valueOf(R1));
	}
	public String getR2() {
		return R2;
	}
	public void setR2(String r2) {
		this.R2 = r2;
		textGPA2nd.setText(String.valueOf(R2));
	}
	public String getR3() {
		return R3;
	}
	public void setR3(String r3) {
		this.R3 = r3;
		textGPA3rd.setText(String.valueOf(R3));
	}
	public String getR4() {
		return R4;
	}
	public void setR4(String r4) {
		this.R4 = r4;
		textGPA4th.setText(String.valueOf(R4));
	}
	public String getGPAX() {
		return GPAX;
	}
	
	public void Calculate() {
		String a1 = A1;
		String a2 = A2;
		String a3 = A3;
		String a4 = A4;
		String a5 = A5;
		String a6 = A6;
		String a7 = A7;
		String a8 = A8;
		
		int A1 = Integer.parseInt(a1);
		int A2 = Integer.parseInt(a2);
		int A3 = Integer.parseInt(a3);
		int A4 = Integer.parseInt(a4);
		int A5 = Integer.parseInt(a5);
		int A6 = Integer.parseInt(a6);
		int A7 = Integer.parseInt(a7);
		int A8 = Integer.parseInt(a8);
		
		String b1 = B1;
		String b2 = B2;
		String b3 = B3;
		String b4 = B4;
		String b5 = B5;
		String b6 = B6;
		String b7 = B7;
		String b8 = B8;
		
		int B1 = Integer.parseInt(b1);
		int B2 = Integer.parseInt(b2);
		int B3 = Integer.parseInt(b3);
		int B4 = Integer.parseInt(b4);
		int B5 = Integer.parseInt(b5);
		int B6 = Integer.parseInt(b6);
		int B7 = Integer.parseInt(b7);
		int B8 = Integer.parseInt(b8);
		
		int SumCredit = (A1+A2+A3+A4+A5+A6+A7+A8);
		int SumGrade = (B1+B2+B3+B4+B5+B6+B7+B8);
		
		int GPAX = ( SumGrade / SumCredit );
		textResult.setText(String.valueOf(GPAX));
	}
	
	
	
	/**
	 * Create the frame.
	 */
	public Page6_Result() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color (23, 147, 61));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelResult = new JPanel();
		panelResult.setBounds(170, 50, 816, 617);
		contentPane.add(panelResult);
		panelResult.setLayout(null);
		
		textResult = new JTextField();
		textResult.setEditable(false);
		textResult.setHorizontalAlignment(SwingConstants.CENTER);
		textResult.setFont(new Font("Dialog", Font.PLAIN, 25));
		textResult.setBounds(554, 188, 100, 30);
		panelResult.add(textResult);
		textResult.setColumns(10);
		
		JLabel lblGPAX = new JLabel("GPAX");
		lblGPAX.setFont(new Font("Wide Latin", Font.PLAIN, 25));
		lblGPAX.setBounds(531, 158, 140, 30);
		panelResult.add(lblGPAX);
		
		JLabel lblGPA1st = new JLabel("GPA 1st");
		lblGPA1st.setFont(new Font("Wide Latin", Font.PLAIN, 20));
		lblGPA1st.setBounds(20, 80, 150, 30);
		panelResult.add(lblGPA1st);
		
		JLabel lblTGPA2nd = new JLabel("GPA 2nd");
		lblTGPA2nd.setFont(new Font("Wide Latin", Font.PLAIN, 20));
		lblTGPA2nd.setBounds(20, 140, 160, 30);
		panelResult.add(lblTGPA2nd);
		
		textGPA1st = new JTextField();
		textGPA1st.setBounds(215, 80, 100, 30);
		panelResult.add(textGPA1st);
		textGPA1st.setHorizontalAlignment(SwingConstants.CENTER);
		textGPA1st.setEditable(false);
		textGPA1st.setFont(new Font("Dialog", Font.PLAIN, 25));
		textGPA1st.setColumns(10);
		
		textGPA2nd = new JTextField();
		textGPA2nd.setBounds(215, 140, 100, 30);
		panelResult.add(textGPA2nd);
		textGPA2nd.setHorizontalAlignment(SwingConstants.CENTER);
		textGPA2nd.setFont(new Font("Dialog", Font.PLAIN, 25));
		textGPA2nd.setEditable(false);
		textGPA2nd.setColumns(10);
		
		JButton btnCheck1 = new JButton("");
		btnCheck1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCheck1.setBounds(749, 549, 55, 55);
		panelResult.add(btnCheck1);
		btnCheck1.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\Chack.png"));
		btnCheck1.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		btnCheck1.setBackground(SystemColor.menu);
		
		lblTGPA3rd = new JLabel("GPA 3rd");
		lblTGPA3rd.setFont(new Font("Wide Latin", Font.PLAIN, 20));
		lblTGPA3rd.setBounds(20, 200, 150, 30);
		panelResult.add(lblTGPA3rd);
		
		lblTGPA4th = new JLabel("GPA 4th");
		lblTGPA4th.setFont(new Font("Wide Latin", Font.PLAIN, 20));
		lblTGPA4th.setBounds(20, 260, 150, 30);
		panelResult.add(lblTGPA4th);
		
		textGPA3rd = new JTextField();
		textGPA3rd.setHorizontalAlignment(SwingConstants.CENTER);
		textGPA3rd.setFont(new Font("Dialog", Font.PLAIN, 25));
		textGPA3rd.setEditable(false);
		textGPA3rd.setColumns(10);
		textGPA3rd.setBounds(215, 200, 100, 30);
		panelResult.add(textGPA3rd);
		
		textGPA4th = new JTextField();
		textGPA4th.setHorizontalAlignment(SwingConstants.CENTER);
		textGPA4th.setFont(new Font("Dialog", Font.PLAIN, 25));
		textGPA4th.setEditable(false);
		textGPA4th.setColumns(10);
		textGPA4th.setBounds(215, 260, 100, 30);
		panelResult.add(textGPA4th);
		
		JButton btnHome = new JButton("");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Page3_Home home = new Page3_Home();
				home.setVisible(true);
				setVisible(false);
			}
		});
		btnHome.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\PowerOff.png"));
		btnHome.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		btnHome.setBackground(new Color(23, 147, 61));
		btnHome.setBounds(1055, 660, 55, 55);
		contentPane.add(btnHome);
	}
}
