import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.JTextPane;

import java.awt.Color;
import java.awt.SystemColor;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;

import javax.swing.JTextArea;

public class Chat extends JFrame {

	private JPanel contentPane;
	private final JButton button = new JButton("New button");
	private JTextField textField;
	public static JTextArea textArea_1;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chat frame = new Chat();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		try
		{
			Chat ms=new Chat();
			Naming.rebind("Pirate",(Remote) ms);
			textArea_1.setText("Server Ready");
	    }
	    catch(RemoteException RE)
	    {
			System.out.println("Remote Server Error:"+ RE.getMessage());
			System.exit(0);
		}
		catch(Exception ME)
		{
			JOptionPane.showMessageDialog(null, "Invalid URL");
		}
	}

	public Chat() {
		super("Time Pass");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 422, 289);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField.setBounds(36, 183, 219, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		final JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		textArea_1.setBounds(36, 40, 230, 109);
		contentPane.add(textArea_1);
		
		JButton btnNewButton = new JButton("Send");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String message=textField.getText();
				 textArea_1.setText(message);
			}
		});
		btnNewButton.setBounds(276, 184, 95, 29);
		contentPane.add(btnNewButton);
		
		
		
		
		setResizable(false);
	}
}
