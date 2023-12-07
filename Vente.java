package examentp;

public class Vente extends OperationStock{
	
	double prixVente;
	int qteVendu;
	
	public Vente(int idOp, Article art, double prixVente,int qteVendu) throws QteArticleException {
		super(idOp, art);
		this.prixVente=prixVente;
		this.qteVendu=qteVendu;
		mouvementerStock(art, qteVendu);
	}
	

	public double getPrixVente() {
		return prixVente;
	}

	@Override
	public String toString() {
		return super.toString()+" [prixVente=" + prixVente + ", qteVendu=" + qteVendu + "]";
	}


	@Override
	public boolean estMouvementabe() {
		if(art.getQteStock()>=qteVendu) {
			return true;
		}
		else return false;
		
	
	}

	@Override
	public void mouvementerStock(Article a, int qte) throws QteArticleException {
		if(estMouvementabe()==false) {
			throw new QteArticleException(2);
		}
		art.setQteStock(art.getQteStock()-qte);
		
	}
		
	}

