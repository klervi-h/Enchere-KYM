package encheres.buisness.bll;

import encheres.buisness.bo.Article;
import encheres.buisness.bo.Utilisateur;
import encheres.dal.ArticleDAO;
import encheres.dal.DALException;
import encheres.dal.DAOFactory;


public class ArticleManager {
	
private ArticleDAO articleDAO;

	/**
	 * Le constructeur permet d'initialiser la variable membre avisDAO pour 
	 * permettre une communication avec la base de données. 
	 */
	public ArticleManager() {
		this.articleDAO=DAOFactory.getArticleDao();
	}
	//Modif MAT ajout constructeur
	public Article afficherParId(int id) throws BusinessException
	{
		Article article = null;
		
		BusinessException exception = new BusinessException();

		try {
			article = this.articleDAO.selectById(id);
		} catch (DALException e) 
		{

			e.printStackTrace();
		}
		return article;
	}
	
	/**
	 * @param description
	 * @param note
	 * @return un objet Article en cas de succcès
	 * @throws BusinessException 
	 */
	public void ajouter(Article article/*String nomArticleVente, String descriptionArticle, int noCategorieArt, int prixInitArt,
			Date dateDebutVente, Date dateFinVente,   String rueRetrait, int codePostaleRetrait, String villeRetrait, int noUtil*/) throws BusinessException
	{
		BusinessException exception = new BusinessException();
		
		//Article article = new Article(nomArticleVente,descriptionArticle,noCategorieArt,prixInitArt,dateDebutVente,dateFinVente,rueRetrait,codePostaleRetrait, villeRetrait, noUtil);
		
		try {
			this.articleDAO.insert(article);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		/*
		this.validerNom(article,exception);
		this.validerDescription(article,exception);
		//TODO faire les validator d'insertion d'article
		this.validerRetraits(article,exception);
		this.valider

		if(!exception.hasErreurs())
		{
			this.articleDAO.insert(article);
		}
		
		if(exception.hasErreurs())
		{
			throw exception;
		}*/
		
	}
	
	
	/**
	 * Cette méthode permet de vérifier les règles à respecter sur la variable membre note.
	 * En cas d'erreur, le code d'erreur est enregistré dans l'objet businessException.
	 * @param avis
	 * @param businessException 
	 */
/*	private void validerNom(Article article, BusinessException businessException)
	{
		if(article.getNomArticle().length()>30)
		{
			businessException.ajouterErreur(CodesResultatBLL.REGLE_AVIS_NOTE_ERREUR);
		}
	}*/
	
	/**
	 * Cette méthode permet de vérifier les règles à respecter sur la variable membre description.
	 * En cas d'erreur, le code d'erreur est enregistré dans l'objet businessException.
	 * @param avis
	 * @param businessException
	 */
/*	private void validerDescription(Avis avis, BusinessException businessException)
	{
		if(avis.getDescription()==null  || avis.getDescription().equals("")|| avis.getDescription().length()>150)
		{
			businessException.ajouterErreur(CodesResultatBLL.REGLE_AVIS_DESCRIPTION_ERREUR);
		}
	}*/
}