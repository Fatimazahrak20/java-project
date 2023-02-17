package tppp3;

import java.util.Arrays;

public class client {
	private  int nbcompte=0;
	private String nom;
	private String identifiant;
	private String prenom;
	private String adresse;
	private String codecl;
	private static int nbclient;
	private agencebancaire monagence;
	private compte mescomptes[];
	public client(String nom,String prenom,String adresse,String codecl,agencebancaire monagence) {
		this.nom=nom;
		this.prenom=prenom;
		this.adresse=adresse;
		this.codecl=codecl;
		this.monagence=monagence;
		
		nbclient++;
		mescomptes=new compte[40];
		this.identifiant=("client:"+nbclient);
		
	}
	public client(client cl ) {
		this.adresse=cl.adresse;
		this.codecl=cl.codecl;
		this.identifiant=cl.identifiant;
		this.mescomptes=cl.mescomptes;
		this.monagence=cl.monagence;
		this.nbcompte=cl.nbcompte;
		this.nom=cl.nom;
		this.prenom=cl.prenom;
		this.nbclient=cl.nbclient;
	}
	public String getCodecl() {
		return codecl;
	}
	public void setCodecl(String codecl) {
		this.codecl = codecl;
	}
	
	public compte getcompte(int i) {
		return mescomptes[i];
	}
	public void addcompte(compte cm) {
		 mescomptes[nbcompte]=cm;
		 ++nbcompte;
	}
	public void deposer(int i,double sol) {
		mescomptes[i].deposer(sol);
	}
	public void retirer(int i,double sol) {
		mescomptes[i].retirer(sol);
	}
	public int getNbcompte() {
		return nbcompte;
	}
	public void setNbcompte(int nbcompte) {
		this.nbcompte = nbcompte;
	}
	public String toString() {
		return "identifiant:"+this.identifiant+": nom : "+this.nom+"   prenom : "+this.prenom+"   code client : "+this.codecl+"   adresse : "+this.adresse;
	}
	public void  afficher() {
		System.out.println("identifiant:"+this.identifiant+": nom : "+this.nom+"   prenom : "+this.prenom+"   code client : "+this.codecl+"   adresse : "+this.adresse+"   mescomptes :");
		for(int i=0;i<nbcompte;i++) {
			System.out.println(mescomptes[i].toString());		}
		System.out.println("/////////////////////////////////////////////////////////////////");
	}
    
}
