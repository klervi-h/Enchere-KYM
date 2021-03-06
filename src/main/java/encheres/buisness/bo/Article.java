package encheres.buisness.bo;

import java.sql.Date;

public class Article {

	private int noArticle, prixInitial, prixVente, noUtilisateur, noCategorie;
	private Date dateDebut, dateFin;
	private String nomArticle, description;
	private Adresse adresseRetrait;

	public Article(){}

	public Article (int noArt, String nomArt, String description, Date debutVente, Date finVente, 
			int prixInit, int prixVente, int noUtil, int noCat) {
		this.noArticle=noArt;
		this.nomArticle = nomArt;
		this.description = description;
		this.dateDebut = debutVente;
		this.dateFin = finVente;
		this.prixInitial = prixInit;
		this.prixVente = prixVente;
		this.noUtilisateur = noUtil;
		this.noCategorie = noCat;
	}

	public Article ( 
			String nomArticleVente, String descriptionArticle, 
			int noCategorieArt, int prixInitArt,
			Date dateDebutVente, Date dateFinVente,
			String rueRetrait, int codePostaleRetrait, String villeRetrait, int noUtil) {
		
		this.nomArticle = nomArticleVente;
		this.description = descriptionArticle;
		this.noCategorie = noCategorieArt;
		this.prixInitial = prixInitArt;
		this.dateDebut = dateDebutVente;
		this.dateFin = dateFinVente;
		this.adresseRetrait = new Adresse(rueRetrait, codePostaleRetrait, villeRetrait);
		this.noUtilisateur = noUtil;
	}
	

	@Override
	public String toString() {
		return "Article [noArticle=" + noArticle + ", prixInitial=" + prixInitial + ", prixVente=" + prixVente
				+ ", noUtilisateur=" + noUtilisateur + ", noCategorie=" + noCategorie + ", dateDebut=" + dateDebut
				+ ", dateFin=" + dateFin + ", nomArticle=" + nomArticle + ", description=" + description
				+ ", adresseRetrait" + adresseRetrait;
	}

	public Adresse getAdresseRetrait() {
		return adresseRetrait;
	}

	public void setAdresseRetrait(Adresse adresseRetrait) {
		this.adresseRetrait = adresseRetrait;
	}

	public int getNoArticle() {
		return noArticle;
	}

	public void setNoArticle(int noArticle) {
		this.noArticle = noArticle;
	}

	public int getPrixInitial() {
		return prixInitial;
	}

	public void setPrixInitial(int prixInitial) {
		this.prixInitial = prixInitial;
	}

	public int getPrixVente() {
		return prixVente;
	}

	public void setPrixVente(int prixVente) {
		this.prixVente = prixVente;
	}

	public int getNoUtilisateur() {
		return noUtilisateur;
	}

	public void setNoUtilisateur(int noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}

	public int getNoCategorie() {
		return noCategorie;
	}

	public void setNoCategorie(int noCategorie) {
		this.noCategorie = noCategorie;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public String getNomArticle() {
		return nomArticle;
	}

	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}





}
