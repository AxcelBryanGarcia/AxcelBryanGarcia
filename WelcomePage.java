import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WelcomePage extends JFrame {

	private JPanel contentPane;
	private JTextField txtWelcomeToNu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomePage frame = new WelcomePage();
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
	public WelcomePage() {
		setTitle("Book Rental");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 160));
		contentPane.setForeground(new Color(0, 0, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtWelcomeToNu = new JTextField();
		txtWelcomeToNu.setBounds(10, 76, 414, 77);
		txtWelcomeToNu.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcomeToNu.setFont(new Font("Times New Roman", Font.BOLD, 23));
		txtWelcomeToNu.setBackground(new Color(0, 0, 160));
		txtWelcomeToNu.setForeground(new Color(255, 255, 128));
		txtWelcomeToNu.setText("Welcome to NU Library System!");
		contentPane.add(txtWelcomeToNu);
		txtWelcomeToNu.setColumns(10);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin Log = new AdminLogin();
				LibrarianLogin log = new LibrarianLogin();
				log.setVisible(true);
				Log.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(10, 11, 89, 23);
		contentPane.add(btnNewButton);
	}

}
