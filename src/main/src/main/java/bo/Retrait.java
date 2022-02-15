package bo;

public class Retrait {

		private Adresse adresseRetrait;

		
		public Retrait () {
		}
		
		public Retrait (String rueRetrait, int codePostalRetrait, String villeRetrait) {
			
					
			this.adresseRetrait = new Adresse();
			adresseRetrait.setRue(rueRetrait);
			adresseRetrait.setCodePostale(codePostalRetrait);
			adresseRetrait.setVille(villeRetrait);	
		}

		public Adresse getAdresseRetrait() {
			return adresseRetrait;
		}

		public void setAdresseRetrait(Adresse adresseRetrait) {
			this.adresseRetrait = adresseRetrait;
		}
		
		
		
}
