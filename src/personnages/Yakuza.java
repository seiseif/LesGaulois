package personnages;

public class Yakuza extends Humain {

	private String clan;
	private int reputation;

	public Yakuza(String nom, String boissonPreferee, int argent, String clan) {
		super(nom, boissonPreferee, argent);
		this.clan = clan;
		this.reputation = 0;
	}

	public int getReputation() {
		return reputation;
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je fais partie du clan " + clan + ".");
	}

	public int perdre() {
		int somme = getArgent();
		perdreArgent(somme);
		reputation--;

		parler("J'ai perdu le duel... Mon honneur est bafoué !");
		return somme;
	}

	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation++;

		parler("J'ai gagné le duel ! Ma réputation augmente !");
	}
}