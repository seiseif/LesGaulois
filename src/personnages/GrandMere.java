package personnages;

import java.util.Random;

public class GrandMere extends Humain {

	private Humain[] memoire;
	private int nbConnaissances;
	private Random random;

	private enum TypeHumain {
		COMMERÇANT,
		RONIN,
		SAMURAI,
		TRAITRE,
		HUMAIN
	}

	public GrandMere(String nom) {
		super(nom, "tisane", 0);
		this.memoire = new Humain[5];
		this.nbConnaissances = 0;
		this.random = new Random();
	}

	protected void memoriser(Humain humain) {

		if (nbConnaissances >= 5) {
			parler("Oh ma tête ! Je ne peux plus retenir le nom d'une personne supplémentaire !");
			return;
		}

		memoire[nbConnaissances] = humain;
		nbConnaissances++;
	}

	private String humainHasard() {

		TypeHumain[] types = TypeHumain.values();
		TypeHumain choix = types[random.nextInt(types.length)];

		return choix.toString();
	}

	public void ragoter() {

		for (int i = 0; i < nbConnaissances; i++) {

			Humain h = memoire[i];

			if (h instanceof Traitre) {
				parler(h.getNom() + " ? Je SAIS que c'est un traître !");
			} else {
				parler(h.getNom() + " ? Je crois que c'est un " + humainHasard() + ".");
			}
		}
	}
}