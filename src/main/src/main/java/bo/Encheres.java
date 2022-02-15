package bo;

import java.util.Date;

public class Encheres {

	private int noUtilisateur, noArticle;
	private Date dateEnchere;
	private int montantEnchere;
	
	public Encheres(int noUtil, int noArt, Date date, int montant) {
		this.noUtilisateur = noUtil;
		this.noArticle = noArt;
		this.dateEnchere = date;
		this.montantEnchere = montant;
	}

	public int getNoUtilisateur() {
		return noUtilisateur;
	}

	public void setNoUtilisateur(int noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}

	public int getNoArticle() {
		return noArticle;
	}

	public void setNoArticle(int noArticle) {
		this.noArticle = noArticle;
	}

	public Date getDateEnchere() {
		return dateEnchere;
	}

	public void setDateEnchere(Date dateEnchere) {
		this.dateEnchere = dateEnchere;
	}

	public int getMontantEnchere() {
		return montantEnchere;
	}

	public void setMontantEnchere(int montantEnchere) {
		this.montantEnchere = montantEnchere;
	}
	
}
