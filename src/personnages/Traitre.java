package personnages;

public class Traitre extends Samurai {

	private int niveauTraitrise;

	public Traitre(String nom, String boissonPreferee, int argent, String seigneur) {
		super(nom, boissonPreferee, argent, seigneur);
		this.niveauTraitrise = 0;
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon niveau de traîtrise est de " + niveauTraitrise + ".");
	}

	public void ranconner(Commercant commercant) {

		if (niveauTraitrise >= 3) {
			parler("Je ne peux plus rançonner, ma réputation est trop mauvaise !");
			return;
		}

		int somme = commercant.getArgent() * 2 / 10;

		commercant.perdreArgent(somme);
		gagnerArgent(somme);

		niveauTraitrise++;

		parler("Ah ah ! J'ai rançonné un commerçant de " + somme + " pièces !");
	}

	public void faireLeGentil(Humain humain) {

		if (niveauTraitrise > 0) {
			niveauTraitrise--;
		}

		int don = getArgent() / 20;

		if (don > 0) {
			perdreArgent(don);
			humain.gagnerArgent(don);
		}

		parler("Je fais ami-ami avec " + humain.getNom() + " !");
	}
}