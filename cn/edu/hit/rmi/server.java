package cn.edu.hit.rmi;
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
import java.net.*;

public class server extends UnicastRemoteObject implements AddInterface
{
	@Override
	public long getAdd(long a,long b) throws RemoteException
	{
		return a+b;
	}
	public server() throws RemoteException
	{
		super();
	}
	public static void main(String args[])
	{
		System.out.println("start");
		try{
		server s = new server();
		LocateRegistry.createRegistry(2005);
		Naming.rebind("//localhost:2005/server",s);

		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
