import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setTitle("Book Rental");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 483, 331);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Queen's Book Rental");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBounds(137, 66, 180, 42);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Admin Login");
		btnNewButton.setBackground(new Color(128, 128, 192));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() { //the used of this is when you click the admin in you will go to the AdminLogin
			public void actionPerformed(ActionEvent e) { 
				AdminLogin name = new AdminLogin();
				name.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(103, 108, 247, 31);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Librarian Login");
		btnNewButton_1.addActionListener(new ActionListener() { // the used of this is when you click the librarian log in you will go to the LibrarianLogin
			public void actionPerformed(ActionEvent e) {
				LibrarianLogin log = new LibrarianLogin();
				log.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_1.setBackground(new Color(128, 128, 192));
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.setBounds(103, 150, 247, 31);
		contentPane.add(btnNewButton_1);
	}
}
