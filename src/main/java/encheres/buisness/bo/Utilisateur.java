package encheres.buisness.bo;

public class Utilisateur {

	private int noUtilisateur;
	private String pseudo, nom, prenom, email, motDePasse;
	private int telephone, credit;
	private Adresse adresse;

	public Utilisateur () {
	}

	public Utilisateur (String pseudonyme, String nomUtil, String prenomUtil,
			String emailUtil, int telephoneUtil, String rueUtil, int codePostaleUtil, String villeUtil, String modDePasseUtil) {

		this.pseudo = pseudonyme;
		this.nom = nomUtil;
		this.prenom = prenomUtil;
		this.email = emailUtil;
		this.motDePasse = modDePasseUtil;
		this.telephone = telephoneUtil;
		this.adresse = new Adresse(rueUtil, codePostaleUtil, villeUtil);	
	}

	public int getNoUtilisateur() {
		return noUtilisateur;
	}

	/*public void setNoUtilisateur(int noUtilisateur) {
			this.noUtilisateur = noUtilisateur;
		}*/

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Utilisateur [noUtilisateur=" + noUtilisateur + ", pseudo=" + pseudo + ", nom=" + nom + ", prenom="
				+ prenom + ", email=" + email + ", motDePasse=" + motDePasse + ", telephone=" + telephone + ", credit="
				+ credit + ", adresse=" + adresse + "]";
	}
	
}
