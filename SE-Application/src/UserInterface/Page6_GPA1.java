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


public class Page6_GPA1 extends JFrame {

private JPanel contentPane;
	
	private Panel panel1st;
	private JLabel lblTerm1;
	private JLabel lblCredit1;
	private JTextField textC1;
	private JTextField textC2;
	private JTextField textC3;
	private JTextField textC4;
	private JTextField textC5;
	private JTextField textC6;
	private JTextField textResultC1Y1;
	private JLabel lblGrade1;
	private JTextField textG1;
	private JTextField textG4;
	private JTextField textG5;
	private JTextField textG2;
	private JTextField textG3;
	private JTextField textG6;
	
	private Panel panel2nd;
	private JLabel lblterm2;
	private JLabel lblCredit2;
	private JTextField textC7;
	private JTextField textC8;
	private JTextField textC9;
	private JTextField textC10;
	private JTextField textC11;
	private JTextField textC12;
	private JTextField textResultC2Y1;
	private JSeparator separator_1;
	private JLabel lblGrade2;
	private JTextField textG7;
	private JTextField textG8;
	private JTextField textG9;
	private JTextField textG10;
	private JTextField textG11;
	private JTextField textG12;
	
	private JLabel label;
	private JLabel label_1;
	private JLabel lblGpa;
	private JTextField textResult1;
	private JButton button;
	private JTextField textResultG1Y1;
	private JTextField textResultG2Y1;
	private JTextField textTerm1Y1;
	private JTextField textTerm2Y1;
	
	
	
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
	
	/**
	 * Create the frame.
	 */
	public Page6_GPA1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color (23, 147, 61));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel1st = new Panel();
		panel1st.setBackground(Color.WHITE);
		panel1st.setBounds(170, 36, 400, 422);
		contentPane.add(panel1st);
		panel1st.setLayout(null);
		
		JLabel lblterm1 = new JLabel("Term 1");
		lblterm1.setFont(new Font("Footlight MT Light", Font.BOLD, 30));
		lblterm1.setHorizontalAlignment(SwingConstants.CENTER);
		lblterm1.setBounds(145, 15, 110, 30);
		panel1st.add(lblterm1);
		
		lblCredit1 = new JLabel("Credit");
		lblCredit1.setFont(new Font("Wide Latin", Font.PLAIN, 20));
		lblCredit1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCredit1.setBounds(40, 75, 120, 30);
		panel1st.add(lblCredit1);
		
		textC1 = new JTextField();
		textC1.setHorizontalAlignment(SwingConstants.CENTER);
		textC1.setFont(new Font("Dialog", Font.PLAIN, 25));
		textC1.setBounds(50, 120, 100, 30);
		panel1st.add(textC1);
		textC1.setColumns(10);
		
		textC2 = new JTextField();
		textC2.setHorizontalAlignment(SwingConstants.CENTER);
		textC2.setFont(new Font("Dialog", Font.PLAIN, 25));
		textC2.setBounds(50, 160, 100, 30);
		panel1st.add(textC2);
		textC2.setColumns(10);
		
		textC3 = new JTextField();
		textC3.setHorizontalAlignment(SwingConstants.CENTER);
		textC3.setFont(new Font("Dialog", Font.PLAIN, 25));
		textC3.setBounds(50, 200, 100, 30);
		panel1st.add(textC3);
		textC3.setColumns(10);
		
		textC4 = new JTextField();
		textC4.setHorizontalAlignment(SwingConstants.CENTER);
		textC4.setFont(new Font("Dialog", Font.PLAIN, 25));
		textC4.setBounds(50, 240, 100, 30);
		panel1st.add(textC4);
		textC4.setColumns(10);
		
		textC5 = new JTextField();
		textC5.setHorizontalAlignment(SwingConstants.CENTER);
		textC5.setFont(new Font("Dialog", Font.PLAIN, 25));
		textC5.setBounds(50, 280, 100, 30);
		panel1st.add(textC5);
		textC5.setColumns(10);
		
		textC6 = new JTextField();
		textC6.setHorizontalAlignment(SwingConstants.CENTER);
		textC6.setFont(new Font("Dialog", Font.PLAIN, 25));
		textC6.setColumns(10);
		textC6.setBounds(50, 320, 100, 30);
		panel1st.add(textC6);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(198, 60, 2, 290);
		panel1st.add(separator);
		
		JLabel lblGrade1 = new JLabel("Grade");
		lblGrade1.setHorizontalAlignment(SwingConstants.CENTER);
		lblGrade1.setFont(new Font("Wide Latin", Font.PLAIN, 20));
		lblGrade1.setBounds(240, 75, 120, 30);
		panel1st.add(lblGrade1);
		
		textG1 = new JTextField();
		textG1.setHorizontalAlignment(SwingConstants.CENTER);
		textG1.setFont(new Font("Dialog", Font.PLAIN, 25));
		textG1.setColumns(10);
		textG1.setBounds(250, 120, 100, 30);
		panel1st.add(textG1);
		
		textG2 = new JTextField();
		textG2.setHorizontalAlignment(SwingConstants.CENTER);
		textG2.setFont(new Font("Dialog", Font.PLAIN, 25));
		textG2.setColumns(10);
		textG2.setBounds(250, 160, 100, 30);
		panel1st.add(textG2);
		
		textG3 = new JTextField();
		textG3.setHorizontalAlignment(SwingConstants.CENTER);
		textG3.setFont(new Font("Dialog", Font.PLAIN, 25));
		textG3.setColumns(10);
		textG3.setBounds(250, 200, 100, 30);
		panel1st.add(textG3);
		
		textG4 = new JTextField();
		textG4.setHorizontalAlignment(SwingConstants.CENTER);
		textG4.setFont(new Font("Dialog", Font.PLAIN, 25));
		textG4.setColumns(10);
		textG4.setBounds(250, 240, 100, 30);
		panel1st.add(textG4);
		
		textG5 = new JTextField();
		textG5.setHorizontalAlignment(SwingConstants.CENTER);
		textG5.setFont(new Font("Dialog", Font.PLAIN, 25));
		textG5.setColumns(10);
		textG5.setBounds(250, 280, 100, 30);
		panel1st.add(textG5);
		
		textG6 = new JTextField();
		textG6.setHorizontalAlignment(SwingConstants.CENTER);
		textG6.setFont(new Font("Dialog", Font.PLAIN, 25));
		textG6.setColumns(10);
		textG6.setBounds(250, 320, 100, 30);
		panel1st.add(textG6);
		
		JButton btnDoneT1 = new JButton("");
		btnDoneT1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int c1, c2, c3, c4, c5, c6;
				int SumC1;
			
				c1 = Integer.valueOf(textC1.getText());
				c2 = Integer.valueOf(textC2.getText());
				c3 = Integer.valueOf(textC3.getText());
				c4 = Integer.valueOf(textC4.getText());
				c5 = Integer.valueOf(textC5.getText());
				c6 = Integer.valueOf(textC6.getText());
			
				SumC1 = c1+c2+c3+c4+c5+c6;
				
				double g1, g2, g3, g4, g5, g6;
				double SumG1;
				
				g1 = Double.valueOf(textG1.getText());
				g2 = Double.valueOf(textG2.getText());
				g3 = Double.valueOf(textG3.getText());
				g4 = Double.valueOf(textG4.getText());
				g5 = Double.valueOf(textG5.getText());
				g6 = Double.valueOf(textG6.getText());
				
				SumG1 = ((g1*c1)+(g2*c2)+(g3*c3)+(g4*c4)+(g5*c5)+(g6*c6));
				
				textResultC1Y1.setText(String.valueOf(SumC1));
				textResultG1Y1.setText(String.valueOf(SumG1));
				
			}
		});
		btnDoneT1.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		btnDoneT1.setBackground(Color.WHITE);
		btnDoneT1.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\Donee.png"));
		btnDoneT1.setBounds(173, 359, 50, 50);
		panel1st.add(btnDoneT1);
		
		panel2nd = new Panel();
		panel2nd.setLayout(null);
		panel2nd.setBackground(Color.WHITE);
		panel2nd.setBounds(586, 36, 400, 422);
		contentPane.add(panel2nd);
		
		lblterm2 = new JLabel("Term 2");
		lblterm2.setHorizontalAlignment(SwingConstants.CENTER);
		lblterm2.setFont(new Font("Footlight MT Light", Font.BOLD, 30));
		lblterm2.setBounds(145, 15, 110, 30);
		panel2nd.add(lblterm2);
		
		lblCredit2 = new JLabel("Credit");
		lblCredit2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCredit2.setFont(new Font("Wide Latin", Font.PLAIN, 20));
		lblCredit2.setBounds(40, 75, 120, 30);
		panel2nd.add(lblCredit2);
		
		textC7 = new JTextField();
		textC7.setHorizontalAlignment(SwingConstants.CENTER);
		textC7.setFont(new Font("Dialog", Font.PLAIN, 25));
		textC7.setColumns(10);
		textC7.setBounds(50, 120, 100, 30);
		panel2nd.add(textC7);
		
		textC8 = new JTextField();
		textC8.setHorizontalAlignment(SwingConstants.CENTER);
		textC8.setFont(new Font("Dialog", Font.PLAIN, 25));
		textC8.setColumns(10);
		textC8.setBounds(50, 160, 100, 30);
		panel2nd.add(textC8);
		
		textC9 = new JTextField();
		textC9.setHorizontalAlignment(SwingConstants.CENTER);
		textC9.setFont(new Font("Dialog", Font.PLAIN, 25));
		textC9.setColumns(10);
		textC9.setBounds(50, 200, 100, 30);
		panel2nd.add(textC9);
		
		textC10 = new JTextField();
		textC10.setHorizontalAlignment(SwingConstants.CENTER);
		textC10.setFont(new Font("Dialog", Font.PLAIN, 25));
		textC10.setColumns(10);
		textC10.setBounds(50, 240, 100, 30);
		panel2nd.add(textC10);
		
		textC11 = new JTextField();
		textC11.setHorizontalAlignment(SwingConstants.CENTER);
		textC11.setFont(new Font("Dialog", Font.PLAIN, 25));
		textC11.setColumns(10);
		textC11.setBounds(50, 280, 100, 30);
		panel2nd.add(textC11);
		
		textC12 = new JTextField();
		textC12.setHorizontalAlignment(SwingConstants.CENTER);
		textC12.setFont(new Font("Dialog", Font.PLAIN, 25));
		textC12.setColumns(10);
		textC12.setBounds(50, 320, 100, 30);
		panel2nd.add(textC12);
		
		separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(198, 60, 2, 290);
		panel2nd.add(separator_1);
		
		lblGrade2 = new JLabel("Grade");
		lblGrade2.setHorizontalAlignment(SwingConstants.CENTER);
		lblGrade2.setFont(new Font("Wide Latin", Font.PLAIN, 20));
		lblGrade2.setBounds(240, 75, 120, 30);
		panel2nd.add(lblGrade2);
		
		textG7 = new JTextField();
		textG7.setHorizontalAlignment(SwingConstants.CENTER);
		textG7.setFont(new Font("Dialog", Font.PLAIN, 25));
		textG7.setColumns(10);
		textG7.setBounds(250, 120, 100, 30);
		panel2nd.add(textG7);
		
		textG8 = new JTextField();
		textG8.setHorizontalAlignment(SwingConstants.CENTER);
		textG8.setFont(new Font("Dialog", Font.PLAIN, 25));
		textG8.setColumns(10);
		textG8.setBounds(250, 160, 100, 30);
		panel2nd.add(textG8);
		
		textG9 = new JTextField();
		textG9.setHorizontalAlignment(SwingConstants.CENTER);
		textG9.setFont(new Font("Dialog", Font.PLAIN, 25));
		textG9.setColumns(10);
		textG9.setBounds(250, 200, 100, 30);
		panel2nd.add(textG9);
		
		textG10 = new JTextField();
		textG10.setHorizontalAlignment(SwingConstants.CENTER);
		textG10.setFont(new Font("Dialog", Font.PLAIN, 25));
		textG10.setColumns(10);
		textG10.setBounds(250, 240, 100, 30);
		panel2nd.add(textG10);
		
		textG11 = new JTextField();
		textG11.setHorizontalAlignment(SwingConstants.CENTER);
		textG11.setFont(new Font("Dialog", Font.PLAIN, 25));
		textG11.setColumns(10);
		textG11.setBounds(250, 280, 100, 30);
		panel2nd.add(textG11);
		
		textG12 = new JTextField();
		textG12.setHorizontalAlignment(SwingConstants.CENTER);
		textG12.setFont(new Font("Dialog", Font.PLAIN, 25));
		textG12.setColumns(10);
		textG12.setBounds(250, 320, 100, 30);
		panel2nd.add(textG12);
		
		JButton btnDoneT5 = new JButton("");
		btnDoneT5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c7, c8, c9, c10, c11, c12;
				int SumC2;
			
				c7 = Integer.valueOf(textC7.getText());
				c8 = Integer.valueOf(textC8.getText());
				c9 = Integer.valueOf(textC9.getText());
				c10 = Integer.valueOf(textC10.getText());
				c11 = Integer.valueOf(textC11.getText());
				c12 = Integer.valueOf(textC12.getText());
			
				SumC2 = c7+c8+c9+c10+c11+c12;
				
				double g7, g8, g9, g10, g11, g12;
				double SumG2;
			
				g7 = Double.valueOf(textG7.getText());
				g8 = Double.valueOf(textG8.getText());
				g9 = Double.valueOf(textG9.getText());
				g10 = Double.valueOf(textG10.getText());
				g11 = Double.valueOf(textG11.getText());
				g12 = Double.valueOf(textG12.getText());
			
				SumG2 = ((g7*c7)+(g8*c8)+(g9*c9)+(g10*c10)+(g11*c11)+(g12*c12));
				
				textResultC2Y1.setText(String.valueOf(SumC2));
				textResultG2Y1.setText(String.valueOf(SumG2));
			}
		});
		btnDoneT5.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\Donee.png"));
		btnDoneT5.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		btnDoneT5.setBackground(Color.WHITE);
		btnDoneT5.setBounds(172, 359, 50, 50);
		panel2nd.add(btnDoneT5);
		
		JPanel panelResultY1 = new JPanel();
		panelResultY1.setBounds(170, 490, 816, 250);
		contentPane.add(panelResultY1);
		panelResultY1.setLayout(null);
		
		textResult1 = new JTextField();
		textResult1.setEditable(false);
		textResult1.setHorizontalAlignment(SwingConstants.CENTER);
		textResult1.setFont(new Font("Dialog", Font.PLAIN, 25));
		textResult1.setBounds(360, 207, 100, 30);
		panelResultY1.add(textResult1);
		textResult1.setColumns(10);
		
		JLabel lblGPAX = new JLabel("GPAX");
		lblGPAX.setFont(new Font("Wide Latin", Font.PLAIN, 25));
		lblGPAX.setBounds(337, 177, 140, 30);
		panelResultY1.add(lblGPAX);
		
		textTerm1Y1 = new JTextField();
		textTerm1Y1.setHorizontalAlignment(SwingConstants.CENTER);
		textTerm1Y1.setFont(new Font("Dialog", Font.PLAIN, 25));
		textTerm1Y1.setEditable(false);
		textTerm1Y1.setColumns(10);
		textTerm1Y1.setBounds(510, 60, 100, 30);
		panelResultY1.add(textTerm1Y1);
		
		JLabel lblTerm1 = new JLabel("Term 1");
		lblTerm1.setFont(new Font("Wide Latin", Font.PLAIN, 20));
		lblTerm1.setBounds(12, 60, 127, 30);
		panelResultY1.add(lblTerm1);
		
		textTerm2Y1 = new JTextField();
		textTerm2Y1.setHorizontalAlignment(SwingConstants.CENTER);
		textTerm2Y1.setFont(new Font("Dialog", Font.PLAIN, 25));
		textTerm2Y1.setEditable(false);
		textTerm2Y1.setColumns(10);
		textTerm2Y1.setBounds(510, 120, 100, 30);
		panelResultY1.add(textTerm2Y1);
		
		JLabel lblTerm2 = new JLabel("Term 2");
		lblTerm2.setFont(new Font("Wide Latin", Font.PLAIN, 20));
		lblTerm2.setBounds(12, 120, 127, 30);
		panelResultY1.add(lblTerm2);
		
		textResultC1Y1 = new JTextField();
		textResultC1Y1.setBounds(190, 60, 100, 30);
		panelResultY1.add(textResultC1Y1);
		textResultC1Y1.setHorizontalAlignment(SwingConstants.CENTER);
		textResultC1Y1.setEditable(false);
		textResultC1Y1.setFont(new Font("Dialog", Font.PLAIN, 25));
		textResultC1Y1.setColumns(10);
		
		textResultC2Y1 = new JTextField();
		textResultC2Y1.setBounds(190, 120, 100, 30);
		panelResultY1.add(textResultC2Y1);
		textResultC2Y1.setHorizontalAlignment(SwingConstants.CENTER);
		textResultC2Y1.setFont(new Font("Dialog", Font.PLAIN, 25));
		textResultC2Y1.setEditable(false);
		textResultC2Y1.setColumns(10);
		
		textResultG1Y1 = new JTextField();
		textResultG1Y1.setBounds(350, 60, 100, 30);
		panelResultY1.add(textResultG1Y1);
		textResultG1Y1.setHorizontalAlignment(SwingConstants.CENTER);
		textResultG1Y1.setFont(new Font("Dialog", Font.PLAIN, 25));
		textResultG1Y1.setEditable(false);
		textResultG1Y1.setColumns(10);
		
		textResultG2Y1 = new JTextField();
		textResultG2Y1.setBounds(350, 120, 100, 30);
		panelResultY1.add(textResultG2Y1);
		textResultG2Y1.setHorizontalAlignment(SwingConstants.CENTER);
		textResultG2Y1.setFont(new Font("Dialog", Font.PLAIN, 25));
		textResultG2Y1.setEditable(false);
		textResultG2Y1.setColumns(10);
		
		JButton btnCheck1 = new JButton("");
		btnCheck1.setBounds(749, 182, 55, 55);
		panelResultY1.add(btnCheck1);
		btnCheck1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c1, c2, c3, c4, c5, c6;
				int SumC1;
			
				c1 = Integer.valueOf(textC1.getText());
				c2 = Integer.valueOf(textC2.getText());
				c3 = Integer.valueOf(textC3.getText());
				c4 = Integer.valueOf(textC4.getText());
				c5 = Integer.valueOf(textC5.getText());
				c6 = Integer.valueOf(textC6.getText());
			
				SumC1 = c1+c2+c3+c4+c5+c6;
				
				double g1, g2, g3, g4, g5, g6;
				double SumG1;
				
				g1 = Double.valueOf(textG1.getText());
				g2 = Double.valueOf(textG2.getText());
				g3 = Double.valueOf(textG3.getText());
				g4 = Double.valueOf(textG4.getText());
				g5 = Double.valueOf(textG5.getText());
				g6 = Double.valueOf(textG6.getText());
				
				SumG1 = ((g1*c1)+(g2*c2)+(g3*c3)+(g4*c4)+(g5*c5)+(g6*c6));
				
				int c7, c8, c9, c10, c11, c12;
				int SumC2;
			
				c7 = Integer.valueOf(textC7.getText());
				c8 = Integer.valueOf(textC8.getText());
				c9 = Integer.valueOf(textC9.getText());
				c10 = Integer.valueOf(textC10.getText());
				c11 = Integer.valueOf(textC11.getText());
				c12 = Integer.valueOf(textC12.getText());
			
				SumC2 = c7+c8+c9+c10+c11+c12;
				
				double g7, g8, g9, g10, g11, g12;
				double SumG2;
			
				g7 = Double.valueOf(textG7.getText());
				g8 = Double.valueOf(textG8.getText());
				g9 = Double.valueOf(textG9.getText());
				g10 = Double.valueOf(textG10.getText());
				g11 = Double.valueOf(textG11.getText());
				g12 = Double.valueOf(textG12.getText());
			
				SumG2 = ((g7*c7)+(g8*c8)+(g9*c9)+(g10*c10)+(g11*c11)+(g12*c12));
				
				double Result1;
				double resultC; 
				double resultG; 
				
				resultG = (g1*c1)+(g2*c2)+(g3*c3)+(g4*c4)+(g5*c5)+(g6*c6)+(g7*c7)+(g8*c8)+(g9*c9)+(g10*c10)+(g11*c11)+(g12*c12);
				resultC = SumC1+SumC2;
				Result1 = resultG/resultC;
				
				DecimalFormat result = new DecimalFormat("#.##");
				result.format(Result1);
				textResult1.setText(String.valueOf(result.format(Result1)) ); 
				
				double term1;
				double term2;
				
				term1 = SumG1 = ((g1*c1)+(g2*c2)+(g3*c3)+(g4*c4)+(g5*c5)+(g6*c6))/(SumC1);
				term2 = SumG2 = ((g7*c7)+(g8*c8)+(g9*c9)+(g10*c10)+(g11*c11)+(g12*c12))/(SumC2);
				
				DecimalFormat t1 = new DecimalFormat("#.##");
				t1.format(term1);
				textTerm1Y1.setText(String.valueOf(t1.format(term1)));
				DecimalFormat t2 = new DecimalFormat("#.##");
				t2.format(term2);
				textTerm2Y1.setText(String.valueOf(t2.format(term2)));
				 
			}
		});
		btnCheck1.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\Chack.png"));
		btnCheck1.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		btnCheck1.setBackground(SystemColor.menu);
		
		label = new JLabel("Credit");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Wide Latin", Font.PLAIN, 20));
		label.setBounds(177, 13, 120, 30);
		panelResultY1.add(label);
		
		label_1 = new JLabel("Grade");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Wide Latin", Font.PLAIN, 20));
		label_1.setBounds(337, 13, 120, 30);
		panelResultY1.add(label_1);
		
		lblGpa = new JLabel("GPA");
		lblGpa.setFont(new Font("Wide Latin", Font.PLAIN, 25));
		lblGpa.setBounds(497, 13, 110, 30);
		panelResultY1.add(lblGpa);
		
		JButton btnNew = new JButton("");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Page6_GPA2 gpa2 = new Page6_GPA2();
				gpa2.setVisible(true);
				setVisible(false);
				
				//keep data
				String A1 = textResultC1Y1.getText();
				String A2 = textResultC2Y1.getText();
				String B1 = textResultG1Y1.getText();
				String B2 = textResultG2Y1.getText();
				String R1 = textResult1.getText();
				gpa2.setA1(A1);
				gpa2.setA2(A2);
				gpa2.setB1(B1);
				gpa2.setB2(B2);
				gpa2.setR1(R1);
				
				
				
			}
		});
		btnNew.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		btnNew.setBackground(new Color (23, 147, 61));
		btnNew.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\new.png"));
		btnNew.setBounds(1050, 660, 55, 55);
		contentPane.add(btnNew);
	}
}
