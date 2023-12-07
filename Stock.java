package examentp;

public class Stock {
	OperationStock [] tabOp;
	int nbOp=0;
	public Stock(int max) {
		this.tabOp=new OperationStock[max];
		
	}
	void ajouterOp(OperationStock o) {
		if(nbOp<tabOp.length) {
			tabOp[nbOp]=o;
			nbOp++;
		}
	}
	public void affichOpAchat() {
		for(int i=0; i<nbOp;i++) {
			System.out.println(tabOp[i]);
		}
	}
	public double meilleurPrixVente(Article a) {
		double meilleur=0;
		for(int i=0; i<nbOp;i++) {
			if(tabOp[i] instanceof Vente&&tabOp[i].art.equals(a)) {
				Vente vente = (Vente)tabOp[i];
				double prixV = vente.getPrixVente();
				if(meilleur==0|| prixV<meilleur) {
					meilleur=prixV;
				}
			}
		}
		return meilleur;
		
	}
	
}
