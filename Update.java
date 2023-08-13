import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Update extends JFrame implements ActionListener {

	public JPanel contentPane;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public JTextField textField_4;
	public JTextField textField_6;
	public JTextField textField_7;
	public JTextArea textArea;
	public JButton btnNewButton,btnNewButton_1,btnNewButton_2,btnNewButton_1_1;

	 
	String url="jdbc:mysql://localhost:3306/harshu",user="root",pass="darshan@123";
	Connection con;
	PreparedStatement ps;
	
	public void createconnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				con=DriverManager.getConnection(url,user,pass);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public Update() {
		createconnection();
		setTitle("Update");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Address Book System");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
		
		JLabel lblNewLabel_1 = new JLabel("Adrress No");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblNewLabel_3 = new JLabel("E-Mail");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblNewLabel_4 = new JLabel("Mobile No");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblNewLabel_5 = new JLabel("Mobile No-2");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblNewLabel_6 = new JLabel("Per-Address");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblNewLabel_7 = new JLabel("Pincode");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblNewLabel_8 = new JLabel("State");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		textArea = new JTextArea();
		
		btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		btnNewButton_2 = new JButton("Update");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		btnNewButton_1_1 = new JButton("Search");
		btnNewButton_1_1.setForeground(new Color(0, 51, 204));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		btnNewButton.addActionListener(this);
		btnNewButton_1.addActionListener(this);
		btnNewButton_1_1.addActionListener(this);
		btnNewButton_2.addActionListener(this);
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(38)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_4)
							.addComponent(lblNewLabel_5)
							.addComponent(lblNewLabel_6)
							.addComponent(lblNewLabel_7)
							.addComponent(lblNewLabel_8)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(39)
							.addComponent(btnNewButton_1)
							.addGap(28)
							.addComponent(btnNewButton_2))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(53)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField)
								.addComponent(textArea)
								.addComponent(textField_7, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
								.addComponent(textField_6, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
								.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
								.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
								.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
								.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
							.addGap(18)
							.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(114, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
					.addGap(106))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(25)
					.addComponent(lblNewLabel)
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1_1))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_6)
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_7)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_8)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_2)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		setVisible(true);
	}
	
	public void serachid(int addno)
	{
		try {
			ps=con.prepareStatement("select * from address where addno=?");
			ps.setInt(1, addno);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				textField_1.setText(rs.getString(2));
				textField_2.setText(rs.getString(3));
				textField_3.setText(rs.getString(4));
				textField_4.setText(rs.getString(5));
				textArea.setText(rs.getString(6));
				textField_6.setText(""+rs.getInt(7));
				textField_7.setText(rs.getString(8));
			}
			else {
				JOptionPane.showMessageDialog(this, "Invalid No..");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void update(Pojo obj)
	{
		try {
			ps=con.prepareStatement("update address set name=?,email=?,mobno=?,mobno2=?,address=?,pincode=?,state=? where addno=? ");	
			ps.setString(1, obj.getNm());
			ps.setString(2, obj.getEm());
			ps.setString(3, obj.getMob());
			ps.setString(4, obj.getMob2());
			ps.setString(5, obj.getAdd());
			ps.setInt(6, obj.getPin());
			ps.setString(7, obj.getState());
			ps.setInt(8, obj.getAddno());
			int ans=ps.executeUpdate();
			if(ans>0)
			{
				JOptionPane.showMessageDialog(this, "Record Update..");
			}
			else {
				JOptionPane.showMessageDialog(this, "record not found.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	public static void main(String[] args) {
		 new Update();
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnNewButton)
		{
			new Dashbord();
			dispose();
		}
		else if(e.getSource()==btnNewButton_1)
		{
			textArea.setText("");
			textField.setText("");
			textField_1.setText("");
			textField_2.setText("");
			textField_3.setText("");
			textField_4.setText("");
			textField_6.setText("");
			textField_7.setText("");
		}
		
		else if(e.getSource()==btnNewButton_1_1)
		{
			
			int addno=Integer.parseInt(textField.getText());
			serachid(addno);
			
		}
		else if(e.getSource()==btnNewButton_2)
		{
			int addno=Integer.parseInt(textField.getText());
			String nm=textField_1.getText();
			String em=textField_2.getText();
			String mob=textField_3.getText();
			String mob2=textField_4.getText();
			String add=textArea.getText();
			int pin=Integer.parseInt(textField_6.getText());
			String state=textField_7.getText();
			
			Pojo obj=new Pojo(addno, nm, em, mob, mob2, add, pin, state);
			update(obj); 
			
		}
		
	}
}
