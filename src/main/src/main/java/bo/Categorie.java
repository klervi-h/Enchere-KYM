package bo;

public class Categorie {
	
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
	
		
		
		
}
