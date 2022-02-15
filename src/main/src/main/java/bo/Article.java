package bo;

import java.util.Date;

public class Article {

	private int noArticle, prixInitial, prixVente, prixInit, noUtilisateur, noCategorie;
	private Date dateDebut, dateFin;
	private String nomArticle, description;
	private Retrait adresseRetrait;

	public Article () {

	}
	
	public Article (int prixInitialArt, int prixInitArt, int noCategorieArt, 
			String nomArticleVente, String descriptionArticle,
			Date dateDebutVente, Date dateFinVente, String rueRetrait, String villeRetrait, int codePostaleRetrait) {

		this.prixInitial = prixInitialArt;
		this.dateDebut = dateDebutVente;
		this.dateFin = dateFinVente;
		this.prixInit = prixInitArt;
		this.noCategorie = noCategorieArt;
		this.nomArticle = nomArticleVente;
		this.description = descriptionArticle;
		this.adresseRetrait = new Retrait(villeRetrait, codePostaleRetrait, rueRetrait);
	}

	public Retrait getAdresseRetrait() {
		return adresseRetrait;
	}

	public void setAdresseRetrait(Retrait adresseRetrait) {
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

	public int getPrixInit() {
		return prixInit;
	}

	public void setPrixInit(int prixInit) {
		this.prixInit = prixInit;
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
