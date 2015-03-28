package cn.edu.hit.rmi;
import java.rmi.*;

public interface AddInterface extends Remote
{
	public long getAdd(long a,long b) throws RemoteException;

}