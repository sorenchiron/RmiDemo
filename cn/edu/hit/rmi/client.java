package cn.edu.hit.rmi;
import java.rmi.*;
import java.rmi.registry.*;

public class client
{
	public static void main(String arg[])
	{
		//System.setSecurityManager( new RMISecurityManager());
		try
		{
			AddInterface s = (AddInterface) Naming.lookup("//localhost:2005/server");
			System.out.println(s.getAdd(1,2));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}