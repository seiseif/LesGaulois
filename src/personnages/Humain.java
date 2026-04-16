package personnages;

public class Humain {

	private String nom;
	private String boissonPreferee;
	private int argent;

	public Humain(String nom, String boissonPreferee, int argent) {
		this.nom = nom;
		this.boissonPreferee = boissonPreferee;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	protected void parler(String texte) {
		System.out.println(nom + " : " + texte);
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonPreferee);
	}

	public void boire() {
		parler("Mmm, un bon verre de " + boissonPreferee + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			perdreArgent(prix);
			parler("J'achète " + bien + " pour " + prix + ".");
		} else {
			parler("Je n'ai pas assez d'argent pour acheter " + bien + " !");
		}
	}

	protected void gagnerArgent(int gain) {
		argent += gain;
	}

	protected void perdreArgent(int perte) {
		argent -= perte;
	}
}