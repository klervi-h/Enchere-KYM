package encheres.buisness.bo;

public class Adresse {
	
	private int codePostale;
	private String  rue, ville;
	
	public Adresse () {}
	
	public Adresse(String rueNew, int codePostaleNew, String villeNew) {
		this.rue = rueNew;
		this.codePostale = codePostaleNew;
		this.ville = villeNew;
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
		return "Adresse [codePostale=" + codePostale + ", rue=" + rue + ", ville=" + ville + "]";
	}
	


}
