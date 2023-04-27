import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField textField;
	private JTextField txtPasswordLogin;
	private JPasswordField passwordField;
	private JTextField txtAdminLogin;
	private JCheckBox chckbxNewCheckBox_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setTitle("Book Rental");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Queen's Book Rental");
		lblNewLabel.setBounds(125, 11, 187, 39);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		contentPane.add(lblNewLabel);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(10, 92, 84, 19);
		txtUsername.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtUsername.setText("Username:");
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(102, 92, 225, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtPasswordLogin = new JTextField();
		txtPasswordLogin.setBounds(10, 136, 126, 26);
		txtPasswordLogin.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtPasswordLogin.setText("Password Login:");
		contentPane.add(txtPasswordLogin);
		txtPasswordLogin.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(146, 138, 215, 25);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBounds(146, 200, 135, 23);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String adminUser = textField.getText();
				String adminPassword = passwordField.getText();
				
				if(adminUser.equals("Admin_01") && adminPassword.equals("AdminOne") || //this is the set username and password for the admin so if you try to use other username and pass it it will automatically wrong
				   adminUser.equals("Admin_02") && adminPassword.equals("AdminTwo") || 
				   adminUser.equals("Admin_03") && adminPassword.equals("AdminThree")) 
				{
					
					int success = JOptionPane.showConfirmDialog(null,"SUCCESSFULLY LOGIN","", JOptionPane.OK_CANCEL_OPTION);
					if(success == JOptionPane.OK_OPTION) {
						WelcomePage welcomeMessage = new WelcomePage();
						welcomeMessage.setVisible(true);
						dispose();
					}
				}
				else if(!(adminUser.equals("Admin_01")) && adminPassword.equals("AdminOne") ||
						!(adminUser.equals("Admin_02")) && adminPassword.equals("AdminTwo") ||
						!(adminUser.equals("Admin_03")) && adminPassword.equals("AdminThree")) 
				{
					int Incorrect = JOptionPane.showConfirmDialog(null,"USERNAME INCORRECT","", JOptionPane.CLOSED_OPTION);
					if(Incorrect == JOptionPane.OK_OPTION) {
						HomePage Log = new HomePage(); 
						Log.setVisible(true); 
						dispose();
					}
				}
				else if(adminUser.equals("Admin_01") && !(adminPassword.equals("AdminOne")) ||
						adminUser.equals("Admin_02") && !(adminPassword.equals("AdminTwo")) ||
						adminUser.equals("Admin_03") && !(adminPassword.equals("AdminThree"))) 
				{
					int Incorrect = JOptionPane.showConfirmDialog(null,"PASSWORD INCORRECT","", JOptionPane.CLOSED_OPTION);
					if(Incorrect == JOptionPane.OK_OPTION) {
						HomePage Log = new HomePage(); 
						Log.setVisible(true);
						dispose();
					}
				}
				else if(!(adminUser.equals("Admin_01")) && !(adminPassword.equals("AdminOne")) ||
						!(adminUser.equals("Admin_02")) && !(adminPassword.equals("AdminTwo")) ||
						!(adminUser.equals("Admin_03")) && !(adminPassword.equals("AdminThree"))) 
				{
					int Incorrect = JOptionPane.showConfirmDialog(null,"USERNAME AND PASSWORD INCORRECT","", JOptionPane.CLOSED_OPTION);
					if(Incorrect == JOptionPane.OK_OPTION) {
						HomePage Log = new HomePage(); 
						Log.setVisible(true);
						dispose();
									}
								}
							}
	});
		btnNewButton.setForeground(Color.DARK_GRAY);
		contentPane.add(btnNewButton);
		
		txtAdminLogin = new JTextField();
		txtAdminLogin.setBounds(159, 55, 107, 26);
		txtAdminLogin.setFont(new Font("Times New Roman", Font.BOLD, 17));
		txtAdminLogin.setText("Admin Login");
		contentPane.add(txtAdminLogin);
		txtAdminLogin.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() { // I used this back button because if the user accidentally click the box for admin so they have chance to go back on home page
			public void actionPerformed(ActionEvent e) {
				HomePage Log = new HomePage();
				Log.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.setBounds(10, 21, 91, 23);
		contentPane.add(btnNewButton_1); 
		
		chckbxNewCheckBox_1 = new JCheckBox("Show Password");
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // the use of this the user will see the password frame
				if(chckbxNewCheckBox_1.isSelected()) {
					passwordField.setEchoChar((char)0);
				}
				else {
					passwordField.setEchoChar('*');
				}
			}
		});
		chckbxNewCheckBox_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		chckbxNewCheckBox_1.setBounds(146, 170, 142, 23);
		contentPane.add(chckbxNewCheckBox_1);}
		public void actionPerformed(ActionEvent e) {
			HomePage logins = new HomePage();
			logins.setVisible(true);
			dispose();
			{
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.BOLD, 15));
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox.setBounds(156, 170, 125, 23);
		contentPane.add(chckbxNewCheckBox);
		
				}
			
			}
}