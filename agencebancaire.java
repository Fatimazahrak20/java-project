package tppp3;

import java.util.Arrays;

public class agencebancaire {
	private String  adresse;
	private static int nbcompte;
	private static int nbclient;
	private static int nbagence;
	private client lesclients[];
	private compte lescomptes[];
	public agencebancaire(String adresse) {
		this.adresse=adresse;
		nbagence++;
		this.lesclients=new client[30];
		lescomptes=new compte[20];
		
		
	}
	public agencebancaire(agencebancaire ag) {
		this.adresse=ag.adresse;
		this.lesclients=ag.lesclients;
		this.lescomptes=ag.lescomptes;
		this.nbagence=ag.nbagence;
		this.nbcompte=ag.nbcompte;
		this.nbclient=ag.nbclient;
	}
	public compte getcompte(int i) {
		return lescomptes[i];
		
	}
	public client getclient(int i) {
		return lesclients[i];
	}
	public void addcompte(compte cm) {
		lescomptes[nbcompte]=cm;
		++nbcompte;
	}
	public void addclient(client cl) {
		lesclients[nbclient]=cl;
		++nbclient;
	}
	public static int getNbcompte() {
		return nbcompte;
	}
	
	public static int getNbclient() {
		return nbclient;
	}
    public String toString() {
    	return "adresse  :"+this.adresse+"  comptes :"+Arrays.toString(lescomptes)+"     clientes : "+Arrays.toString(lesclients);
    }
    public void afficher() {
    	System.out.println("AGENCE :"+this.adresse+"    les comptes :");
    	for(int i=0;i<nbcompte;i++) {
    		System.out.println(this.lescomptes[i].toString());
    	}
    	System.out.println("les clients : ");
    	for(int i=0;i<nbclient;i++) {
    		System.out.println(this.lesclients[i].toString());
    	}
    }
    
}
