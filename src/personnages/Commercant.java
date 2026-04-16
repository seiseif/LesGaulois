package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}

	public int seFaireExtorquer() {
		int somme = getArgent();
		perdreArgent(somme);

		parler("Tout mon argent m'a été volé ! Le monde est trop injuste !");
		return somme;
	}

	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler("Merci infiniment pour ces " + argent + " sous !");
	}
}