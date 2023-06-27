package n1exercici1;

public abstract class Instrument {

	// Tots els instruments tenen com a atributs el seu nom, i el seu preu.
	private String nom;
	private float preu;

	public Instrument(String nom, float preu) {
		super();
		this.nom = nom;
		this.preu = preu;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getPreu() {
		return preu;
	}

	public void setPreu(float preu) {
		this.preu = preu;
	}
		
	
	abstract void tocar();

	
	
	

}
