package objet;

public class Organisateur {
	protected String nom;
	protected String prenom;
	private String motDePasse ;
	protected String id;
	
	public Organisateur(String nom, String prenom, String motDePasse, String id) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.motDePasse = motDePasse;
		this.id = id;
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
	
	
	
	
}
