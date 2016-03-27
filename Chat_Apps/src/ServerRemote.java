import java.rmi.*;

public interface ServerRemote extends Remote
{
	public int registerClient(ClientRemote cr) throws RemoteException;
	
	public void removeClient(int i) throws RemoteException;

	public void showText(String str) throws RemoteException;
}