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
	
	
	public void recevoirCoup(int forceCoup) {
		assert forceCoup > 0;
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
	
	public static void main(String[]  args) {
		Romain minus = new Romain("Minus", -6);
		minus.parler("Hey");
	}
}
