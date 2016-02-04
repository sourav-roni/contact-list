import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;

@SuppressWarnings("unused")
public class createNewProfesssionalFriend extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6892441009024482721L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createNewProfesssionalFriend frame = new createNewProfesssionalFriend();
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
	public createNewProfesssionalFriend() {
		setTitle("Add New Professional Friend");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 749, 498);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		BufferedImage image = null;
		try {
			image = ImageIO.read(getClass().getResource("/contactlist.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setIconImage(image);
		contentPane.setLayout(null);
		
		JLabel lblEnterTheName = new JLabel("Enter the Name of Your Professional Friend");
		lblEnterTheName.setBounds(28, 12, 376, 26);
		contentPane.add(lblEnterTheName);
		
		JLabel lblEnterTheMobile = new JLabel("Enter the Mobile Number of Your Professional Friend");
		lblEnterTheMobile.setBounds(28, 71, 376, 26);
		contentPane.add(lblEnterTheMobile);
		
		JLabel lblEnterTheEmail = new JLabel("Enter the E-mail  ID of Your Professional Friend");
		lblEnterTheEmail.setBounds(28, 137, 376, 26);
		contentPane.add(lblEnterTheEmail);
		
		JLabel lblEnterTheSpecific = new JLabel("<html>Enter the Specific common Interests<br> (100 characters Max.)");
		lblEnterTheSpecific.setBounds(38, 246, 339, 26);
		contentPane.add(lblEnterTheSpecific);
		
		textField = new JTextField();
		textField.setBounds(422, 13, 306, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(422, 72, 306, 26);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(422, 137, 306, 26);
		contentPane.add(textField_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(422, 217, 306, 95);
		contentPane.add(textArea);
		
		JButton btnSaveContact = new JButton("Save Contact");
		btnSaveContact.setBounds(75, 374, 260, 61);
		try {
			image = ImageIO.read(getClass().getResource("/save.jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btnSaveContact.setIcon(new ImageIcon(image));
		contentPane.add(btnSaveContact);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(440, 374, 227, 57);
		try {
			image = ImageIO.read(getClass().getResource("/back.jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btnNewButton.setIcon(new ImageIcon(image));
		contentPane.add(btnNewButton);
	}

}
