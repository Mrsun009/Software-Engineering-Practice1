package UserInterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import Array.Array;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

		
	
	public class Page5_Vote extends JFrame {
		private JPanel contentPane;
		private JTable table;
		private JTextField textstudentid;
		private JTextField textName;
		private JComboBox comboBoxActivity;
		private JComboBox comboBoxGender;
		private JComboBox comboBoxAccept;
		private ArrayList<Array> Array = new ArrayList<Array>();
	
		//ARRAY
		ArrayList<Array>  ClassArray;
		String header[] = new String[] { "Activity", "Student ID", "Name", "Gender", "Accept"};
		DefaultTableModel dtm;
	
		int row,col;
		private JTable table_1;
		
		public Page5_Vote() {
			initComponents();
			ClassArray = new ArrayList<>();
			dtm = new DefaultTableModel(header,0);
			
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
			btnHome.setBounds(554, 683, 55, 55);
			contentPane.add(btnHome);
			table_1.setModel(dtm);
			this.setLocationRelativeTo(null);
	}

	

	/**
	 * Launch the application.
	 */
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page5_Vote frame = new Page5_Vote();
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
		public void initComponents() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color (23, 147, 61));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(200, 110, 800, 560);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panelAdd = new JPanel();
		panelAdd.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panelAdd.setBounds(12, 10, 776, 166);
		panel.add(panelAdd);
		panelAdd.setLayout(null);
		
		JLabel lblActivity = new JLabel("Activity");
		lblActivity.setVerticalAlignment(SwingConstants.BOTTOM);
		lblActivity.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
		lblActivity.setBounds(40, 10, 80, 25);
		panelAdd.add(lblActivity);
		
		//data 
		Array data = new Array("Activity", "StudentID", "Name", "Gender", "Accept");
		
		JComboBox comboBoxActivity = new JComboBox();
		comboBoxActivity.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
		comboBoxActivity.addItem("Hackathon 2019");
		comboBoxActivity.addItem("Bar camp 2019");
		comboBoxActivity.setBounds(160, 10, 300, 25);
		panelAdd.add(comboBoxActivity);
		
		JLabel lblStudentID = new JLabel("Student ID");
		lblStudentID.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
		lblStudentID.setBounds(40, 40, 110, 20);
		panelAdd.add(lblStudentID);
		
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
		
		textstudentid.setBackground(UIManager.getColor("Button.background"));
		textstudentid.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		textstudentid.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
		textstudentid.setHorizontalAlignment(SwingConstants.LEFT);
		textstudentid.setBounds(160, 40, 150, 25);
		panelAdd.add(textstudentid);
		textstudentid.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
		lblName.setBounds(40, 70, 56, 20);
		panelAdd.add(lblName);
		
		textName = new JTextField();
		textName.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		textName.setBackground(UIManager.getColor("Button.background"));
		textName.setBounds(160, 70, 400, 25);
		panelAdd.add(textName);
		textName.setHorizontalAlignment(SwingConstants.LEFT);
		textName.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
		textName.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
		lblGender.setBounds(40, 100, 70, 20);
		panelAdd.add(lblGender);
		
		JComboBox comboBoxGender = new JComboBox();
		comboBoxGender.addItem("Male");
		comboBoxGender.addItem("Female");
//		comboBoxGender.setSelectedIndex(0);
		comboBoxGender.setBounds(160, 100, 100, 25);
		panelAdd.add(comboBoxGender);
		
		JLabel lblAccept = new JLabel("Accept");
		lblAccept.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
		lblAccept.setBounds(40, 130, 70, 25);
		panelAdd.add(lblAccept);
		
		JComboBox comboBoxAccept = new JComboBox();
		comboBoxAccept.addItem("Join");
		comboBoxAccept.addItem("Not Join");
		comboBoxAccept.setBounds(160, 130, 100, 25);
		panelAdd.add(comboBoxAccept);
		
		JPanel panelbutton = new JPanel();
		panelbutton.setLayout(null);
		panelbutton.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panelbutton.setBounds(12, 173, 776, 80);
		panel.add(panelbutton);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Activity = comboBoxActivity.getSelectedItem().toString();
				String StudentID = textstudentid.getText();
				String Name = textName.getText();
				String Gender = comboBoxGender.getSelectedItem().toString();
				String Accept = comboBoxAccept.getSelectedItem().toString();
				ClassArray.add(new Array(Activity,StudentID,Name,Gender,Accept));
				dtm.setRowCount(0); //Reset data model
				for(int i = 0; i < ClassArray.size(); i++) {
					Object[] objs = { ClassArray.get(i).getActivity(),ClassArray.get(i).getStudentID(),ClassArray.get(i).getName(),ClassArray.get(i).getGender(),ClassArray.get(i).getAccept()};
					dtm.addRow(objs);
				}
				//reset
				clearField();
			}

			private void clearField() {
				// TODO Auto-generated method stub
				comboBoxActivity.setSelectedIndex(0);
				textstudentid.setText("");
				textName.setText("");
				comboBoxGender.setSelectedIndex(0);
				comboBoxAccept.setSelectedIndex(0);
				
				
			}
		});
		btnAdd.setVerticalAlignment(SwingConstants.TOP);
		btnAdd.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		btnAdd.setBounds(57, 25, 120, 30);
		panelbutton.add(btnAdd);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dialogButton = JOptionPane.YES_NO_OPTION;
				int dialogResult = JOptionPane.showConfirmDialog(null, "Delete this data", "Delete",dialogButton);
				if(dialogResult == 0 ) {
					dtm.removeRow(row);
					ClassArray.remove(row);
					dtm.setRowCount(0); //reset table and populate again with array
					for (int i = 0; i< ClassArray.size(); i++) {
						Object[] objs = { ClassArray.get(i).getActivity(),ClassArray.get(i).getStudentID(),ClassArray.get(i).getName(),ClassArray.get(i).getGender(),ClassArray.get(i).getAccept()};
						dtm.addRow(objs);
					}
					clearField();
				}else {
					
				}
			}

			private void clearField() {
				// TODO Auto-generated method stub
				
			}
		});
		btnDelete.setBounds(211, 25, 120, 30);
		panelbutton.add(btnDelete);
		btnDelete.setVerticalAlignment(SwingConstants.TOP);
		btnDelete.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			private Object updatedActivity;
			private  String updatedStudentID;
			private Object updatedName;
			private Object updatedGender;
			private String updatedAccept;

			public void actionPerformed(ActionEvent e) {
				
				String Activity = comboBoxActivity.getSelectedItem().toString();
				String StudentID = (textstudentid.getText());
				String Name = textName.getText();
				String Gender = comboBoxGender.getSelectedItem().toString();
				String Accept = comboBoxAccept.getSelectedItem().toString();
				ClassArray.get(row).setActivity(Activity);
				ClassArray.get(row).setStudentID(StudentID);
				ClassArray.get(row).setName(Name);
				ClassArray.get(row).setGender(Gender);
				ClassArray.get(row).setAccept(Accept);
				dtm.setRowCount(0); // Reset table and repopulated
				for (int i = 0; i< ClassArray.size(); i++) {
					Object[] objs = { ClassArray.get(i).getActivity(),ClassArray.get(i).getStudentID(),ClassArray.get(i).getName(),ClassArray.get(i).getGender(),ClassArray.get(i).getAccept()};
					dtm.addRow(objs);
				
				}
			}
		});
		btnUpdate.setBounds(445, 25, 120, 30);
		panelbutton.add(btnUpdate);
		btnUpdate.setVerticalAlignment(SwingConstants.TOP);
		btnUpdate.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = JOptionPane.showInputDialog(btnSearch,"Search Student ID");
				String studentid = null;
				
				  for(Array arr : ClassArray) { 
					  if( (arr.getStudentID()).equals(input) ) {
						  studentid = arr.getStudentID(); 
					  } 
				  }

				  if(studentid != null) { 
					  System.out.println(studentid);
					  JOptionPane.showMessageDialog(btnSearch, "Found !" , "Search Student ID",3);
					  
					  textstudentid.setText(studentid); 
					  
					  String StudentID = studentid; 
				  for (int j = 0; j<(comboBoxAccept.getItemCount()); j++){
					  if(comboBoxAccept.getItemAt(j).equals(StudentID)) {
						  comboBoxAccept.setSelectedIndex(j); }
					  } 
				  }else {
				  JOptionPane.showMessageDialog(btnSearch,"Not Found !","Search Student ID",2); 
				  }
				 
				  
				
			}

		});
		btnSearch.setVerticalAlignment(SwingConstants.TOP);
		btnSearch.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		btnSearch.setBounds(597, 25, 120, 30);
		panelbutton.add(btnSearch);
		
		JPanel panelshowdata = new JPanel();
		panelshowdata.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panelshowdata.setBounds(12, 250, 776, 300);
		panel.add(panelshowdata);
		panelshowdata.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(Color.BLACK, 3));
		scrollPane.setBounds(0, 0, 776, 300);
		
		table_1 = new JTable();
		table_1.setFont(new Font("Century Schoolbook", Font.PLAIN, 16));
		table_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Activity", "Student ID", "Name", "Gender", "Accept"
			}
		));
		scrollPane.setViewportView(table_1);
		panelshowdata.add(scrollPane);
	}
}
