package tppp3;

public class applicationbancaire {,
	public static void main(String args[]) {
		agencebancaire ag;
		ag=new agencebancaire("agadir");
		client cl[];
		cl=new client[4];
		cl[0]=new client("client 1","client 1","adresse 1","E000001",ag);
		compteepargne ce1=new compteepargne(1000,ag,cl[0]);
		cl[0].addcompte(ce1);
		
		cl[1]=new client("client 2","client 2","adresse 2","E000002",ag);
		comptepayante ce2=new comptepayante(2500,ag,cl[1]);
		cl[1].addcompte(ce2);
		
		cl[2]=new client("client 3","client 3","adresse 3","E000003",ag);
		comptepayante ce3=new comptepayante(0,ag,cl[2]);
		comptepayante ce4=new comptepayante(3000,ag,cl[2]);
		cl[2].addcompte(ce3);
		cl[2].addcompte(ce4);
		
		cl[3]=new client("client 4","client 4","adresse 4","E000004",ag);
		comptepayante ce5=new comptepayante(0,ag,cl[3]);
		compteepargne ce6=new compteepargne(2300,ag,cl[3]);
		cl[3].addcompte(ce5);
		cl[3].addcompte(ce6);
		for(int i=0;i<4;i++) {
			ag.addclient(cl[i]);
			for(int j=0;j<cl[i].getNbcompte();j++) {
				ag.addcompte(cl[i].getcompte(j));
			}
		}
		for(int i=0;i<4;i++) {
			cl[i].afficher();
		}
		//cl[1].afficher();
		cl[1].deposer(0, 1000);
        //cl[1].afficher();
		
		cl[2].afficher();
		cl[2].retirer(1, 1000);
		cl[2].afficher();
		
		ag.afficher();
		compteepargne a=new compteepargne();
		for(int i=0;i<agencebancaire.getNbcompte();i++) {
    	  if(ag.getcompte(i) instanceof compteepargne ) {
    		  a=(compteepargne) ag.getcompte(i);
    		  a.calculeinteret();;
    	  }
    	}
		ag.afficher();
		
		
	}
	

}
