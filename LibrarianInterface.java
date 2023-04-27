import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class LibrarianInterface extends JFrame {

	private JPanel contentPane;
	private JTextField txtLibrarianList;
	private JTextField txtAuthorsName;

	private JTextField txtGaryB;
	private JTextField txtCorinneHoisington;
	private JTextField txtProgrammingConcepts;

	private JTextField txtTitleOfThe;
	private JTextField txtSystemAnalysisAnd;
	private JTextField txtNumberCopyOf;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	int num1Copies = 3;
	int num2Copies = 3;
	int num3Copies = 3;

	static JButton book1 = new JButton();
	static JButton book2 = new JButton();
	static JButton book3 = new JButton();

	static boolean bookOne = false;
	static boolean bookTwo = false;
	static boolean bookThree = false;

	private JButton btnNewButton;
	private JButton btnNewButton_1;

	static boolean disposeFrame = false;

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarianInterface frame = new LibrarianInterface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LibrarianInterface() {
		setTitle("Book rental");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 892, 348);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Queen's Book Rental");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(363, 10, 190, 41);
		contentPane.add(lblNewLabel);

		txtLibrarianList = new JTextField();
		txtLibrarianList.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtLibrarianList.setText("Librarian list");
		txtLibrarianList.setHorizontalAlignment(SwingConstants.CENTER);
		txtLibrarianList.setBounds(393, 45, 118, 20);
		contentPane.add(txtLibrarianList);
		txtLibrarianList.setColumns(10);

		txtAuthorsName = new JTextField();
		txtAuthorsName.setHorizontalAlignment(SwingConstants.CENTER);
		txtAuthorsName.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtAuthorsName.setText("Author's Name");
		txtAuthorsName.setBounds(10, 93, 140, 30);
		contentPane.add(txtAuthorsName);
		txtAuthorsName.setColumns(10);

		txtGaryB = new JTextField();
		txtGaryB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		txtGaryB.setHorizontalAlignment(SwingConstants.CENTER);

		txtGaryB.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtGaryB.setText("* Gary B. Shelly\r\n");
		txtGaryB.setBounds(10, 132, 162, 30);
		contentPane.add(txtGaryB);
		txtGaryB.setColumns(10);

		txtCorinneHoisington = new JTextField();
		txtCorinneHoisington.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		txtCorinneHoisington.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtCorinneHoisington.setText("* Corinne Hoisington");
		txtCorinneHoisington.setHorizontalAlignment(SwingConstants.CENTER);
		txtCorinneHoisington.setBounds(10, 173, 162, 34);
		contentPane.add(txtCorinneHoisington);
		txtCorinneHoisington.setColumns(10);

		txtProgrammingConcepts = new JTextField();
		txtProgrammingConcepts.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		txtProgrammingConcepts.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtProgrammingConcepts.setText("* Rosauro E. Manuel\r\n");
		txtProgrammingConcepts.setHorizontalAlignment(SwingConstants.CENTER);
		txtProgrammingConcepts.setBounds(10, 217, 162, 34);
		contentPane.add(txtProgrammingConcepts);
		txtProgrammingConcepts.setColumns(10);

		txtTitleOfThe = new JTextField();
		txtTitleOfThe.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtTitleOfThe.setText("Title of the book");
		txtTitleOfThe.setHorizontalAlignment(SwingConstants.CENTER);
		txtTitleOfThe.setBounds(342, 93, 182, 30);
		contentPane.add(txtTitleOfThe);
		txtTitleOfThe.setColumns(10);

		txtSystemAnalysisAnd = new JTextField();
		txtSystemAnalysisAnd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});

//		JButton book1 = new JButton("System Analysis and Design");
		book1.setText("System Analysis and Design");
		book1.setHorizontalAlignment(SwingConstants.CENTER);
		book1.setBounds(329, 132, 224, 30);
		book1.setBackground(Color.WHITE);
		contentPane.add(book1);

//		JButton book2 = new JButton("Android Application");
		book2.setText("Android Application");
		book2.setHorizontalAlignment(SwingConstants.CENTER);
		book2.setBounds(329, 173, 224, 34);
		book2.setBackground(Color.WHITE);
		contentPane.add(book2);

//		JButton book3 = new JButton("Programming Concepts and Logic Formulation");
		book3.setText("Programming Concepts and Logic Formulation");
		book3.setHorizontalAlignment(SwingConstants.CENTER);
		book3.setBounds(290, 217, 313, 34);
		book3.setBackground(Color.WHITE);
		contentPane.add(book3);

		book1.addActionListener(e -> {
			book1.setForeground(Color.RED);
			book2.setForeground(Color.BLACK);
			book3.setForeground(Color.BLACK);

			bookOne = true;
			bookTwo = false;
			bookThree = false;
		});

		book2.addActionListener(e -> {
			book2.setForeground(Color.RED);
			book1.setForeground(Color.BLACK);
			book3.setForeground(Color.BLACK);

			bookOne = false;
			bookTwo = true;
			bookThree = false;
		});

		book3.addActionListener(e -> {
			book3.setForeground(Color.RED);
			book1.setForeground(Color.BLACK);
			book2.setForeground(Color.BLACK);

			bookOne = false;
			bookTwo = false;
			bookThree = true;
		});

		txtNumberCopyOf = new JTextField();
		txtNumberCopyOf.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtNumberCopyOf.setBackground(new Color(255, 255, 255));
		txtNumberCopyOf.setText("Number copy of books");
		txtNumberCopyOf.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumberCopyOf.setBounds(631, 94, 224, 30);
		contentPane.add(txtNumberCopyOf);
		txtNumberCopyOf.setColumns(10);

		textField = new JTextField();
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		textField.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText(Integer.toString(num1Copies));
		textField.setBounds(683, 135, 118, 26);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		textField_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText(Integer.toString(num2Copies));
		textField_1.setBounds(683, 181, 118, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		textField_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_2.setText(Integer.toString(num3Copies));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setBounds(683, 222, 118, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (num1Copies < 1) {
					JOptionPane.showMessageDialog(null, "No copies available.", "", JOptionPane.INFORMATION_MESSAGE);
				} else if (num2Copies < 1) {
					JOptionPane.showMessageDialog(null, "No copies available.", "", JOptionPane.INFORMATION_MESSAGE);
				} else if (num3Copies < 1) {
					JOptionPane.showMessageDialog(null, "No copies available.", "", JOptionPane.INFORMATION_MESSAGE);
				}

				if (bookOne == false && bookTwo == false && bookThree == false) {
					JOptionPane.showMessageDialog(null, "Please select a book", "Select",
							JOptionPane.INFORMATION_MESSAGE);
				}

				if (bookOne && num1Copies >= 1) {
					num1Copies -= 1;
					textField.setText(Integer.toString(num1Copies));
					JOptionPane.showMessageDialog(null, "Book Rented Succesfully", "Success",
							JOptionPane.INFORMATION_MESSAGE);
					rentAgain();
				} else if (bookTwo && num2Copies >= 1) {
					num2Copies -= 1;
					textField_1.setText(Integer.toString(num2Copies));
					JOptionPane.showMessageDialog(null, "Book Rented Succesfully", "Success",
							JOptionPane.INFORMATION_MESSAGE);
					rentAgain();
				} else if (bookThree && num3Copies >= 1) {
					num3Copies -= 1;
					textField_2.setText(Integer.toString(num3Copies));
					JOptionPane.showMessageDialog(null, "Book Rented Succesfully", "Success",
							JOptionPane.INFORMATION_MESSAGE);
					rentAgain();
				}
				if (disposeFrame) {
					dispose();
				}
			}
		});
		btnNewButton.setBounds(393, 262, 112, 36);
		contentPane.add(btnNewButton);

		btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBounds(25, 21, 89, 23);
		contentPane.add(btnNewButton_1);
	}

	public static void rentAgain() {
		int choice = JOptionPane.showConfirmDialog(null, "Do you want to rent again?", "Confirmation",
				JOptionPane.YES_NO_OPTION);
		if (choice == JOptionPane.YES_OPTION) {
			book1.setForeground(Color.BLACK);
			book2.setForeground(Color.BLACK);
			book3.setForeground(Color.BLACK);

			bookOne = false;
			bookTwo = false;
			bookThree = false;
		} else {
			HomePage call = new HomePage();
			call.show();
			disposeFrame = true;
		}
	}

}
