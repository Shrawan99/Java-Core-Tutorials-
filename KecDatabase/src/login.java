import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.Canvas;
import java.awt.Choice;


public class login extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		super("Login Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setBounds(71, 45, 95, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(71, 98, 70, 15);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(172, 96, 114, 19);
		contentPane.add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(172, 43, 114, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		setDefaultLookAndFeelDecorated(true);
	}
}
