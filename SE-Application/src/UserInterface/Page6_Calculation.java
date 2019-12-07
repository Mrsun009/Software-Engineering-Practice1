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
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Optional;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.border.MatteBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.ComponentOrientation;
import java.awt.Dimension;

public class Page6_Calculation extends JFrame {

	private JPanel contentPane;
	private JTextField textPoint;
	private JTextField textStandard;
	
	String[] Grade = {"Grade A", "Grade B+", "Grade B", "Grade C+", "Grade C", "Grade D+", "Grade D", "Grade F"};
	JComboBox comboBoxGrade = new JComboBox(Grade);
	
	
		
	/**
	 * Launch the application.
	 */	
	public static void main(String[] args) {		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page6_Calculation frame = new Page6_Calculation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	/*
	 * Create the frame.
	 */
	public Page6_Calculation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color (23, 147, 61));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel GradeCalculation = new JLabel("Grade Calculation");
		GradeCalculation.setHorizontalAlignment(SwingConstants.CENTER);
		GradeCalculation.setFont(new Font("DialogInput", Font.BOLD, 40));
		GradeCalculation.setBounds(366, 50, 450, 80);
		contentPane.add(GradeCalculation);
		
		JLabel lbl1st = new JLabel("");
		lbl1st.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\Fresher.png"));
		lbl1st.setBounds(241, 130, 100, 80);
		contentPane.add(lbl1st);
		
		JLabel lblFresher = new JLabel("Fresher");
		lblFresher.setHorizontalAlignment(SwingConstants.CENTER);
		lblFresher.setFont(new Font("DialogInput", Font.BOLD, 30));
		lblFresher.setBounds(216, 200, 150, 50);
		contentPane.add(lblFresher);
		
		JLabel lbl2nd = new JLabel("");
		lbl2nd.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\Sophomore.png"));
		lbl2nd.setBounds(441, 130, 100, 80);
		contentPane.add(lbl2nd);
		
		JLabel lblSophomore = new JLabel("sophomore");
		lblSophomore.setHorizontalAlignment(SwingConstants.CENTER);
		lblSophomore.setFont(new Font("DialogInput", Font.BOLD, 30));
		lblSophomore.setBounds(407, 200, 170, 50);
		contentPane.add(lblSophomore);
		
		JLabel lbl3rd = new JLabel("");
		lbl3rd.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\Junior.png"));
		lbl3rd.setBounds(641, 130, 100, 80);
		contentPane.add(lbl3rd);
		
		JLabel lblJunior = new JLabel("Junior");
		lblJunior.setHorizontalAlignment(SwingConstants.CENTER);
		lblJunior.setFont(new Font("DialogInput", Font.BOLD, 30));
		lblJunior.setBounds(616, 200, 150, 50);
		contentPane.add(lblJunior);
		
		JLabel lbl4th = new JLabel("");
		lbl4th.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\Senior.png"));
		lbl4th.setBounds(841, 130, 100, 80);
		contentPane.add(lbl4th);
		
		JLabel lblSenior = new JLabel("Senior");
		lblSenior.setFont(new Font("DialogInput", Font.BOLD, 30));
		lblSenior.setHorizontalAlignment(SwingConstants.CENTER);
		lblSenior.setBounds(816, 200, 150, 50);
		contentPane.add(lblSenior);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(191, 250, 800, 2);
		contentPane.add(separator);
		
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
		btnHome.setBounds(12, 13, 55, 55);
		contentPane.add(btnHome);
		
		JButton btnNext = new JButton("");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Page6_GPA1 gpa1 = new Page6_GPA1();
				gpa1.setVisible(true);
				setVisible(false);
			}
		});
		btnNext.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\Play.png"));
		btnNext.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		btnNext.setBackground(new Color(23, 147, 61));
		btnNext.setBounds(566, 685, 55, 55);
		contentPane.add(btnNext);
		
		JPanel panel = new JPanel();
		panel.setBounds(191, 265, 800, 398);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JComboBox comboBoxGrade = new JComboBox();
		comboBoxGrade.setMinimumSize(new Dimension(35, 25));
		comboBoxGrade.setBorder(new LineBorder(new Color(171, 173, 179), 0));
		comboBoxGrade.setModel(new DefaultComboBoxModel(new String[] {"Grade A", "Grade B+", "Grade B", "Grade C+", "Grade C", "Grade D+", "Grade D", "Grade F"}));
		comboBoxGrade.setFont(new Font("JasmineUPC", Font.BOLD, 40));
		comboBoxGrade.setBounds(325, 61, 150, 65);
		panel.add(comboBoxGrade);
		
		JButton btnGradePoint = new JButton("Grade Point");
		btnGradePoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Grade = comboBoxGrade.getSelectedItem().toString();
                switch( Grade ) {
					case "Grade A" :
						textPoint.setText("4");
						textStandard.setText("Excellent");
						break;
					case "Grade B+" :
						textPoint.setText("3.5");
						textStandard.setText("Very Good");
						break;
					case "Grade B" :
						textPoint.setText("3");
						textStandard.setText("Good");
						break;
					case "Grade C+" :
						textPoint.setText("2.5");
						textStandard.setText("Fairly Good");
						break;
					case "Grade C" :
						textPoint.setText("2");
						textStandard.setText("Fair");
						break;
					case "Grade D+" :
						textPoint.setText("1.5");
						textStandard.setText("Poor");
						break;
					case "Grade D" :
						textPoint.setText("1");
						textStandard.setText("Very Poor");
						break;
					case "Grade F" :
						textPoint.setText("0");
						textStandard.setText("Fail");
						default:
			}	
			}
		});
		btnGradePoint.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		btnGradePoint.setFont(new Font("JasmineUPC", Font.BOLD, 30));
		btnGradePoint.setBounds(325, 172, 150, 35);
		panel.add(btnGradePoint);
		
		textPoint = new JTextField();
		textPoint.setEditable(false);
		textPoint.setHorizontalAlignment(SwingConstants.CENTER);
		textPoint.setFont(new Font("JasmineUPC", Font.BOLD, 50));
		textPoint.setBounds(175, 290, 150, 65);
		panel.add(textPoint);
		textPoint.setColumns(10);
		
		textStandard = new JTextField();
		textStandard.setEditable(false);
		textStandard.setHorizontalAlignment(SwingConstants.CENTER);
		textStandard.setFont(new Font("JasmineUPC", Font.BOLD, 45));
		textStandard.setColumns(10);
		textStandard.setBounds(450, 290, 200, 65);
		panel.add(textStandard);
		
		JLabel lblStandard = new JLabel("Standard");
		lblStandard.setFont(new Font("JasmineUPC", Font.BOLD, 30));
		lblStandard.setBounds(505, 247, 90, 30);
		panel.add(lblStandard);
		
		JLabel lblPoint = new JLabel("Point");
		lblPoint.setFont(new Font("JasmineUPC", Font.BOLD, 30));
		lblPoint.setBounds(225, 247, 52, 30);
		panel.add(lblPoint);
		
		
	}
}
