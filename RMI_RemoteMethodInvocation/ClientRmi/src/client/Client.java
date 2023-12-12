package client;

import java.rmi.Naming;

import rmi.IbanqueRemote;

public class Client {

	public static void main(String[] args) {
		try {
			IbanqueRemote stub=(IbanqueRemote) Naming.lookup("rmi://localhost:1099/BK");
			double res=stub.convertir(400);
			System.out.println(res);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
