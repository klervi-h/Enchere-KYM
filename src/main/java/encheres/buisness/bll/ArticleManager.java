package encheres.buisness.bll;

import encheres.buisness.bo.Article;
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
	}

	public void update(Article article/*String nomArticleVente, String descriptionArticle, int noCategorieArt, int prixInitArt,
				Date dateDebutVente, Date dateFinVente,   String rueRetrait, int codePostaleRetrait, String villeRetrait, int noUtil*/) throws BusinessException
	{
		BusinessException exception = new BusinessException();


		try {
			this.articleDAO.update(article);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}



