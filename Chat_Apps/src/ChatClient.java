import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.rmi.*;
import java.rmi.server.*;

public class ChatClient extends JFrame implements ActionListener,ClientRemote
{
	JTextField str;
	JButton send;
	JTextArea area;
	JScrollPane scroll;
	JLabel label1,label2,label3;
	GridBagLayout gbl;
	GridBagConstraints gbc;
	ServerRemote ser;
	private static String name="";
	int i=0;

	public ChatClient()
	{
		setSize(350,350);
		gbl=new GridBagLayout();
		gbc=new GridBagConstraints();
		getContentPane().setLayout(gbl);

		gbc.gridx=1;
		gbc.gridy=1;
		label1=new JLabel("CHAT ROOM");
		label1.setFont(new Font("Arial",Font.BOLD,20));
		getContentPane().add(label1,gbc);

		gbc.gridx=1;
		gbc.gridy=2;
		label2=new JLabel("message display Area..");
		getContentPane().add(label2,gbc);

		gbc.gridx=1;
		gbc.gridy=3;
		area=new JTextArea(10,30);
		getContentPane().add(area,gbc);

		gbc.gridx=1;
		gbc.gridy=4;
		label3=new JLabel("Enter Message");
		getContentPane().add(label3,gbc);

		str=new JTextField(30);
		gbc.gridx=1;
		gbc.gridy=5;
		getContentPane().add(str,gbc);

		send=new JButton("send");
		gbc.gridx=1;
		gbc.gridy=6;
		getContentPane().add(send,gbc);

		send.addActionListener(this);

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				try
				{
					ser.removeClient(i);
				}

			catch(Exception e)
			{
				System.out.println("Errorr.."+e);

			}
				System.exit(0);
			}
		});
		try
		{
			System.setSecurityManager(new RMISecurityManager());
			UnicastRemoteObject.exportObject(this);		
			ser=(ServerRemote)Naming.lookup("server");
		}
		catch(Exception e)
		{
			System.out.println("Error::"+e);
		}
		try
		{
			i=ser.registerClient(this);
		}
		catch(Exception e)
		{
			System.out.println("error..."+e);
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			ser.showText(name+":"+str.getText());
		}
		catch(Exception e)
		{
			System.out.println("error:"+e);
		}
	}
	public void getString(String str) throws RemoteException
	{

		area.append(str+"\n");
	}
	public static void main(String arg[])
	{
		name=arg[0];
	
		ChatClient cc=new ChatClient();
		cc.show();
		cc.setTitle(name);
}
}