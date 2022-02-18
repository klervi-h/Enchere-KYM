package encheres.buisness.bo;

public class Adresse {
	
	private int codePostale;
	private String  rue, ville;
	
	public Adresse () {}
	
	public Adresse(String rue, int codePostal, String ville) {
		this.rue = rue;
		this.codePostale = codePostal;
		this.ville = ville;
	}
	public int getCodePostale() {
		return codePostale;
	}
	public void setCodePostale(int codePostale) {
		this.codePostale = codePostale;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	@Override
	public String toString() {
		return "Adresse [rue=" + rue + ", codePostale=" + codePostale + ", ville=" + ville + "]";
	}
	


}
