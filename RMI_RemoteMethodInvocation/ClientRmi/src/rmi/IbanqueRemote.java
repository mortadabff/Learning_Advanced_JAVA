package rmi;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import metier.Compte;

public interface IbanqueRemote extends Remote {
	public double convertir(double m) throws RemoteException;
	public Compte consulter(int  code) throws RemoteException;
	public List<Compte> liteComptes() throws RemoteException;

}
