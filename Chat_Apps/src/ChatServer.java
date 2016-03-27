import java.net.*;
import java.io.*;
import java.util.*;
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class ChatServer implements Remote,ServerRemote
{
	private static ChatServer rmi;
	private ClientRemote cr;
	Vector v=new Vector();

	public static void main(String args[])
	{

		System.setSecurityManager(new RMISecurityManager());
		try
		{
			rmi=new ChatServer();
			System.out.println("Registry is Created.");
			UnicastRemoteObject.exportObject(((ServerRemote)rmi));
			Naming.rebind("server",rmi);
			System.out.println("binding is completed.");
			System.out.println("Server is waiting for client requests....");
		}
		catch(java.rmi.UnknownHostException uhe)
		{
			System.out.println("Error.");
		}
		catch(RemoteException re)
		{
			System.out.println("Error."+re);
		}
		catch(MalformedURLException le)
		{
			System.out.println("Error."+le);
		}
	}
	public int registerClient(ClientRemote cr) throws RemoteException
	{
		int i=0;
		System.out.println("Client is requesting a connection.....");
		v.addElement(cr);
		i=v.indexOf(cr);
		System.out.println("Timer is started."+v.size());
		return i;
	}
	public void removeClient(int i) throws RemoteException
	{
		v.removeElementAt(i);
	}
	public void showText(String str) throws RemoteException
	{
		System.out.println(str);
		for(int i=0;i<v.size(); i++)
		{
			ClientRemote cr1=(ClientRemote)v.elementAt(i);
			if(cr1!=null)
			cr1.getString(str);
		}
	}
}

			