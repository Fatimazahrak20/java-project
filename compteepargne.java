package tppp3;

public class compteepargne extends compte{
	public double taux=6;

	public double getTaux() {
		return taux;
	}
	public void setTaux(double taux) {
		this.taux = taux;
	}
	public compteepargne(double solde, agencebancaire ag, client cl) {
		super(solde, ag, cl);
		
	}
	public compteepargne() {
		super();
	}
	public void calculeinteret() {
		 this.setSolde( this.getSolde()*(1+taux/100) );
		
	}
	public String toString() {
		return "identifiant:"+this.identifiant+":epargne :  solde= "+this.getSolde();}
	

}
