package examentp;

public class Main {

	public static void main(String[] args)  {
		Article a1=new Article (1,"TV",30,100);
		Article a2=new Article (2,"LAveVaisselle",5,20);
		
		Stock st = new Stock(20);
		Achat ac1;
		  try {
	  
	    	ac1= new Achat(2, a1, 700, 20);
			Achat ac2= new Achat(2, a2, 1600, 15);
			Vente ac3= new Vente(2, a1, 800, 18);
			Vente ac4= new Vente(2, a2, 1800, 10);
			Vente ac5= new Vente(2, a2, 1900, 5);
			st.ajouterOp(ac1);
			st.ajouterOp(ac2);
			st.ajouterOp(ac3);
			st.ajouterOp(ac4);
			st.ajouterOp(ac5);
			
			} catch (QteArticleException e) {
				e.alert();
				e.printStackTrace();
			}
			
		
	    st.affichOpAchat();
	}

}
