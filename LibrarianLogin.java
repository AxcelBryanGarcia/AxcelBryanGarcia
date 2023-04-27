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
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LibrarianLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtLibrarianLogin;
	private JTextField txtUsername;
	private JTextField textField;
	private JTextField txtPassword;
	private JPasswordField passwordField;
	private JCheckBox chckbxNewCheckBox;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarianLogin frame = new LibrarianLogin();
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
	public LibrarianLogin() {
		setTitle("Book Rental");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Queen's Book Rental");
		lblNewLabel.setBounds(122, 35, 190, 42);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		contentPane.add(lblNewLabel);
		
		txtLibrarianLogin = new JTextField();
		txtLibrarianLogin.setBounds(156, 80, 113, 24);
		txtLibrarianLogin.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtLibrarianLogin.setBackground(Color.WHITE);
		txtLibrarianLogin.setText("Librarian Login");
		contentPane.add(txtLibrarianLogin);
		txtLibrarianLogin.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(10, 109, 86, 21);
		txtUsername.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtUsername.setText("Username:");
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(106, 111, 195, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(10, 142, 86, 20);
		txtPassword.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtPassword.setText("Password:");
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(106, 142, 195, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textField.getText();
				String password = passwordField.getText();
			
			
				
				if(username.equals("Librarian_01") && password.equals("LibOne") || ////this is the set username for librarian and password for the librarian so if you try to use other username and pass it it will automatically wrong
				   username.equals("Librarian_02") && password.equals("LibTwo") ||
				   username.equals("Librarian_03") && password.equals("LibThree")) 
				{
					
						int success = JOptionPane.showConfirmDialog(null,"SUCCESSFULLY LOGIN","", JOptionPane.OK_CANCEL_OPTION);
						if(success == JOptionPane.OK_OPTION) {
							LibrarianInterface books = new LibrarianInterface();
							books.setVisible(true);
							dispose();
						}		
						
				}
				else if(!(username.equals("Librarian_01")) && password.equals("LibOne") ||
					    !(username.equals("Librarian_02")) && password.equals("LibTwo") ||
					    !(username.equals("Librarian_03")) && password.equals("LibThree")) 
				{
					    
							int Incorrect = JOptionPane.showConfirmDialog(null,"USERNAME INCORRECT","", JOptionPane.CLOSED_OPTION);
							if(Incorrect == JOptionPane.OK_OPTION) {
								LibrarianLogin Log = new LibrarianLogin();
								Log.setVisible(true);
								dispose();
							}
				}
				else if(username.equals("Librarian_01") && !(password.equals("LibOne")) ||
						username.equals("Librarian_02") && !(password.equals("LibTwo")) ||
						username.equals("Librarian_03") && !(password.equals("LibThree"))) 
				{	
					
							int Incorrect = JOptionPane.showConfirmDialog(null,"PASSWORD INCORRECT","", JOptionPane.CLOSED_OPTION);
								if(Incorrect == JOptionPane.OK_OPTION) {
									LibrarianLogin Log = new LibrarianLogin();
									Log.setVisible(true);
									dispose();
						}
					
				}
				else if(!(username.equals("Librarian_01")) && !(password.equals("LibOne")) ||
						!(username.equals("Librarian_02")) && !(password.equals("LibTwo")) ||
					    !(username.equals("Librarian_03")) && !(password.equals("LibThree"))) 
			 	{
				 	int Incorrect = JOptionPane.showConfirmDialog(null,"USERNAME AND PASSWORD INCORRECT","",JOptionPane.CLOSED_OPTION);
					if(Incorrect == JOptionPane.OK_OPTION) { 
						LibrarianLogin Log = new LibrarianLogin(); 
						Log.setVisible(true); 
						dispose(); 
				}
			}
		
		}		
	});
		btnNewButton.setBounds(156, 209, 89, 23);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		contentPane.add(btnNewButton);
		
		chckbxNewCheckBox = new JCheckBox("Show Password");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //The use of this the user will see the password frame
				if(chckbxNewCheckBox.isSelected()) {
					passwordField.setEchoChar((char)0);
				}
				else {
					passwordField.setEchoChar('*');
				}
			}
		});
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.BOLD, 15));
		chckbxNewCheckBox.setBounds(135, 169, 125, 23);
		contentPane.add(chckbxNewCheckBox);
		
		btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				HomePage Log = new HomePage();
				Log.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.setBounds(7, 11, 105, 30);
		contentPane.add(btnNewButton_1);
		
	}

}
