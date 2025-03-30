package personnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public int getForce() {
		return force;
	}
	
	public void recevoirCoup(int forceCoup) {
		this.force = this.force - forceCoup;
		if (this.force<1) {
			parler("J'abondonne");
		}
		else {
			prendreParole();
			parler("Aie");
		}
	}
	
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le Romain " + nom + " : ";
	}

}
