package examentp;

public abstract class OperationStock implements MouvementStock{
	int idOp;
	Article art;
	static int count=0;
	public OperationStock(int idOp, Article art) {
		super();
		this.idOp = count++;
		this.art = art;
		
	}
	@Override
	public String toString() {
		return getClass().getSimpleName()+"[idOp=" + idOp + ", art=" + art + "]";
	}

	
	
}
