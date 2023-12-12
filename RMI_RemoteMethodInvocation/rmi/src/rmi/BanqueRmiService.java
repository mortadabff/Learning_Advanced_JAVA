package rmi;
import java.rmi.Remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import metier.Compte;

public class BanqueRmiService extends UnicastRemoteObject implements IbanqueRemote {
	public BanqueRmiService() throws RemoteException {
		super();
	}
	@Override
	public double convertir(double mt)throws RemoteException{
		return mt*11;
	}
	@Override
	public Compte consulter(int code) throws RemoteException{
		Compte c=new Compte(1,Math.random()*11000, new Date());
		return c;
		
	}
	
	@Override
	public List<Compte> liteComptes () throws RemoteException{
		List<Compte> liste =new ArrayList<Compte>();
		liste.add(new Compte(1,Math.random()*11000, new Date()));
		liste.add(new Compte(2,Math.random()*11000,new Date()));
		liste.add(new Compte(3,Math.random()*11000,new Date()));
		return null;
		
	}
	
}
