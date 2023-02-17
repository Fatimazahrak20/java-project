package tppp3;

public class comptepayante extends compte{
    private final double taux_operation=5;
	public comptepayante(double solde, agencebancaire ag, client proprietaire) {
		super(solde, ag, proprietaire);
		
	}
	public void deposer(double sl) {
		this.setSolde(this.solde-taux_operation+sl);
	}
	public void retirer(double sl) {
		this.setSolde(this.solde-taux_operation-sl);
	}
	public String toString() {
		return "identifiant:"+this.identifiant+":payante :  solde= "+this.getSolde();
	}

}
