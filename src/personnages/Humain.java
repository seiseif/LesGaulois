package personnages;

public class Humain {

	private String nom;
	private String boissonPreferee;
	private int argent;

	private Humain[] memoire;
	private int nbConnaissances;

	public Humain(String nom, String boissonPreferee, int argent) {
		this.nom = nom;
		this.boissonPreferee = boissonPreferee;
		this.argent = argent;
		this.memoire = new Humain[30];
		this.nbConnaissances = 0;
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

	public void repondre(Humain humain) {
		direBonjour();
	}

	public void faireConnaissanceAvec(Humain humain) {
		direBonjour();
		humain.repondre(this);
		memoriser(humain);
		humain.memoriser(this);
	}

	private void memoriser(Humain humain) {
		if (nbConnaissances < 30) {
			memoire[nbConnaissances] = humain;
			nbConnaissances++;
		}
	}

	public void listerConnaissances() {
		for (int i = 0; i < nbConnaissances; i++) {
			System.out.println("- " + memoire[i].getNom());
		}
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