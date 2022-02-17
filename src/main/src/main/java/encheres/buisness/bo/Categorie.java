package encheres.buisness.bo;

public class Categorie {

/*
	private static String INFORMATIQUE = "informatique";
	private static String AMEUBLEMENT = "Ameublement";
	private static String VETEMENT = "vetements";
	private static String SPORTS_ET_LOISIRS = "sports et loisirs";
*/
	private int noCategorie;
	private String libelle;

	public Categorie() {
	}

	public Categorie(String libelleCat) {
		this.libelle=libelleCat;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getNoCategorie() {
		return noCategorie;
	}

	/*public void setNoCategorie(int noCategorie) {
			this.noCategorie = noCategorie;
		}*/

	@Override
	public String toString() {
		return "Categorie [noCategorie=" + noCategorie + ", libelle=" + libelle + "]";
	}



}
