package personnages;

public class Ronin extends Humain {

	private int honneur;

	public Ronin(String nom, String boissonPreferee, int argent) {
		super(nom, boissonPreferee, argent);
		this.honneur = 1;
	}

	public void provoquer(Yakuza adversaire) {

		int force = honneur * 2;

		if (force >= adversaire.getReputation()) {

			int gain = adversaire.perdre();

			gagnerArgent(gain);
			honneur++;

			parler("J'ai gagné ce duel !");
		} else {

			int perte = getArgent();

			perdreArgent(perte);
			honneur--;

			adversaire.gagner(perte);

			parler("J'ai perdu ce duel... Quelle honte !");
		}
	}
}