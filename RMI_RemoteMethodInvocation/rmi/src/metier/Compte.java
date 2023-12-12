package metier;
import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Compte implements Serializable {
	private int code;
	private double solde;
	private Date date ;
	public Compte (int code, double solde,Date date) {
		super();
		this.code=code ;
		this.solde=solde;
		this.date=date;
	}
	
	public Compte() {
		super();
	}

}
