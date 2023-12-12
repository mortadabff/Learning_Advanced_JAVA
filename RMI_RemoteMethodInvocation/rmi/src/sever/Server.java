package sever;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import rmi.BanqueRmiService;


public class Server {

	public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry(1099);
			BanqueRmiService od= new BanqueRmiService();
			Naming.rebind("rmi://localhost:1099/BK",od);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
