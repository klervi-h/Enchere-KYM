package encheres.buisness.bo;

import java.util.Date;

public class Article {

	private int noArticle, prixInitial, prixVente, noUtilisateur, noCategorie;
	private Date dateDebut, dateFin;
	private String nomArticle, description;
	private Retrait adresseRetrait;

	public Article(){}

	public Article (int noArt, String nomArt, String description, java.sql.Date debutVente, java.sql.Date finVente, int prixInit, int prixVente, int noUtil, int noCat) {
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

	public Article (int prixInitialArt, int prixInitArt, int noCategorieArt, 
			String nomArticleVente, String descriptionArticle,
			Date dateDebutVente, Date dateFinVente, String rueRetrait, String villeRetrait, int codePostaleRetrait) {

		this.prixInitial = prixInitialArt;
		this.dateDebut = dateDebutVente;
		this.dateFin = dateFinVente;
		this.prixInitial = prixInitArt;
		this.noCategorie = noCategorieArt;
		this.nomArticle = nomArticleVente;
		this.description = descriptionArticle;
		this.adresseRetrait = new Retrait(villeRetrait, codePostaleRetrait, rueRetrait);
	}

	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("no article : " + noArticle);
		chaine.append("	nom article "+ nomArticle);
		chaine.append("	description" + description);
		chaine.append("	debut "+ dateDebut);
		chaine.append("	fin "+dateFin);
		chaine.append("	prix init "+prixInitial);
		chaine.append("	prix vente" + prixVente);
		chaine.append("	no utilisateur" + noUtilisateur);
		chaine.append("	no catégorie :"+ noCategorie);
		return chaine.toString();
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
