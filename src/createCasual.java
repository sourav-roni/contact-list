import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;

@SuppressWarnings("unused")
public class createCasual extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8346688980814577415L;
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
					createCasual frame = new createCasual();
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
	public createCasual() {
		setTitle("Add casual Acquaintances");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 706, 516);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		BufferedImage image = null;
		try {
			image = ImageIO.read(getClass().getResource("/contactlist.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setIconImage(image);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterTheName = new JLabel("Enter the Name of Your Casual Acquaintance");
		lblEnterTheName.setBounds(31, 12, 340, 31);
		contentPane.add(lblEnterTheName);
		
		JLabel lblEnterTheMobile = new JLabel("Enter the Mobile Number of Your Casual Acquaintance");
		lblEnterTheMobile.setBounds(31, 50, 390, 31);
		contentPane.add(lblEnterTheMobile);
		
		JLabel lblEnterTheEmail = new JLabel("Enter the E-mail ID of Your Casual Acquaintance");
		lblEnterTheEmail.setBounds(31, 88, 340, 31);
		contentPane.add(lblEnterTheEmail);
		
		JLabel lblwhereAndWhen = new JLabel("<html>Where and When did you meet the  Casual Acquaintance.<br>(100 characters Max.)");
		lblwhereAndWhen.setBounds(31, 156, 413, 31);
		contentPane.add(lblwhereAndWhen);
		
		JLabel lblunderWhatCircumstances = new JLabel("<html>Under what circumstances did you meet the Casual Acquaintance.<br>(100 characters Max.)");
		lblunderWhatCircumstances.setBounds(31, 241, 413, 59);
		contentPane.add(lblunderWhatCircumstances);
		
		JLabel lblotherUsefulInformation = new JLabel("<html>Other Useful Information.<br> (100 characters Max.)");
		lblotherUsefulInformation.setBounds(31, 342, 362, 31);
		contentPane.add(lblotherUsefulInformation);
		
		JButton btnSaveContact = new JButton("Save Contact");
		btnSaveContact.setBounds(133, 432, 191, 38);
		try {
			image = ImageIO.read(getClass().getResource("/save.jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btnSaveContact.setIcon(new ImageIcon(image));
		contentPane.add(btnSaveContact);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBack.setBounds(418, 432, 176, 38);
		try {
			image = ImageIO.read(getClass().getResource("/back.jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btnBack.setIcon(new ImageIcon(image));
		contentPane.add(btnBack);
		
		textField = new JTextField();
		textField.setBounds(445, 12, 249, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(445, 50, 249, 25);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(445, 88, 249, 25);
		contentPane.add(textField_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(445, 138, 249, 68);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(445, 232, 249, 68);
		contentPane.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(445, 317, 249, 68);
		contentPane.add(textArea_2);
	}

}
