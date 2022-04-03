package objet;

public class Participant {
	
	private String id ;
	protected String nom ;
	protected String prenom ;
	private String motDePasse ;
	private Profil profil;
	
	

	public Participant(String id, String nom, String prenom, String motDePasse, Profil profil) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.motDePasse = motDePasse;
		this.setProfil(profil);
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


	public String getMotDePasse() {
		return motDePasse;
	}


	public void setMotDePasse(String motDePasse) {
		
		this.motDePasse = motDePasse;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}
	
	public Profil getProfil() {
		return profil;
	}


	public void setProfil(Profil profil) {
		this.profil = profil;
	}

	@Override
	public String toString() {
		return "+"
				+ "Nom : "+ nom
				+ "Prénom : " + prenom
				+ "ID : " + id;
	}
	
	public void consulterProfil() {
		
	}
	
	public void completerProfil() {
		
	}
	
	public boolean validerCompte() {
		return true;
	}

	public boolean validerLaisserPasser() {
			return false;
	}
	
	public boolean validerLpAvecModif() {
		return true;
	}
	
	public void annulerLaisserPasser() {
			
	}

	
	
	
}
