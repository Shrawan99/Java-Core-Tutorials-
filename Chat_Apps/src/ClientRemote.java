import java.rmi.*;

public interface ClientRemote extends Remote
{
	public void getString(String str) throws RemoteException;
}