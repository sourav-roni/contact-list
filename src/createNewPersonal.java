import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.DropMode;

@SuppressWarnings("unused")
public class createNewPersonal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6445456423543305247L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createNewPersonal frame = new createNewPersonal();
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
	public createNewPersonal() {
		setTitle("Add Personal Friend");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 764, 519);
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
		
		JLabel lblEnterTheName = new JLabel("Enter the Name of Your Personal Friend");
		lblEnterTheName.setBounds(35, 43, 312, 15);
		contentPane.add(lblEnterTheName);
		
		JLabel lblEnterTheMobile = new JLabel("<html>Enter the Mobile number of your Personal Friend<br>(Note Mobile Number should be valid)");
		lblEnterTheMobile.setBounds(35, 77, 352, 33);
		contentPane.add(lblEnterTheMobile);
		
		JLabel lblEnterTheEmail = new JLabel("Enter the E-mail ID of Your Personal Friend");
		lblEnterTheEmail.setBounds(35, 139, 352, 15);
		contentPane.add(lblEnterTheEmail);
		
		JLabel lblEnterTheContext = new JLabel("<html>Enter the Context of Acquaintance with Your Personal Friend <br> (100 characters Max.)");
		lblEnterTheContext.setBounds(35, 180, 447, 46);
		contentPane.add(lblEnterTheContext);
		
		JLabel lblEnterTheDate = new JLabel("<html>Enter the Date of Acquaintance with your Personal Friend<br>(Please Enter Date in (dd/MM/yyyy) format");
		lblEnterTheDate.setBounds(35, 248, 432, 29);
		contentPane.add(lblEnterTheDate);
		
		JLabel lblEnterTheSpecific = new JLabel("<html>Enter the Specific Events<br>(100 characters Max)");
		lblEnterTheSpecific.setBounds(38, 310, 385, 46);
		contentPane.add(lblEnterTheSpecific);
		
		JButton btnSaveContact = new JButton("Save Contact");
		btnSaveContact.setBounds(155, 407, 172, 40);
		try {
			image = ImageIO.read(getClass().getResource("/save.jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btnSaveContact.setIcon(new ImageIcon(image));
		contentPane.add(btnSaveContact);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(463, 405, 158, 44);
		try {
			image = ImageIO.read(getClass().getResource("/back.jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btnBack.setIcon(new ImageIcon(image));
		contentPane.add(btnBack);
		
		textField = new JTextField();
		textField.setBounds(483, 31, 259, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(483, 77, 259, 29);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(483, 132, 259, 29);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(485, 245, 257, 32);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setWrapStyleWord(true);
		textArea_1.setLineWrap(true);
		textArea_1.setBounds(483, 298, 259, 71);
		contentPane.add(textArea_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
        contentPane.add(textArea);
        textArea.setVisible(true);
		textArea.setBounds(483, 180, 259, 51);
	}
}
