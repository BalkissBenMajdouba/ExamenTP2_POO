package examentp;

public class Achat extends OperationStock {
	double prixAchat;
	int QtAch;
	
	public Achat(int idOp, Article art,double prixAchat,int QtAch) throws QteArticleException {
		super(idOp, art);
		this.prixAchat=prixAchat;
		this.QtAch=QtAch;
		mouvementerStock(art,QtAch);
	}

	@Override
	public String toString() {
		return super.toString()+" [prixAchat=" + prixAchat + ", QtiteAcheté=" + QtAch + "]";
	}

	//public boolean estMouvementable() {
		
	
	@Override 
	public void mouvementerStock(Article art, int qt) throws QteArticleException{
		if(estMouvementabe()==false) {
			throw new QteArticleException(1);
		}
		art.setQteStock(art.getQteStock()+qt);
		
	}

	@Override
	public boolean estMouvementabe() {
		if(art.getQteStock() + QtAch <= art.getStockMax()) {
			return true;
		}
		else return false;
		}
	

}
