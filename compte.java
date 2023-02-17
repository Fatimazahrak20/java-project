package tppp3;

public class compte {
	protected double solde;
    private static int codecompte;
    protected agencebancaire lagence;
    protected client proprietaire;
    protected String identifiant ;
    public compte() {}
    public compte(double solde ,agencebancaire ag,client proprietaire) {
    	this.solde=solde;
    	this.lagence=new agencebancaire(ag);
    	this.proprietaire=new client(proprietaire);
    	codecompte++;
    	this.identifiant=("compte :"+codecompte);
    }
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public double getCodecompte() {
		return codecompte;
	}
	public void setCodecompte(int codecompte) {
		this.codecompte = codecompte;
	}
	public agencebancaire getAgbancaire() {
		return lagence;
	}
	
	public void deposer(double sol) {
		this.solde+=sol;
	}
	public void retirer(double sol) {
		this.solde-=sol;
		
	}
	public String toString() {
		return " identifiant:"+this.identifiant+"solde : "+this.solde;
	}

}
