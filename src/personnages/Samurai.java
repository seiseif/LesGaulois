package personnages;

public class Samurai extends Humain {

	private String seigneur;

	public Samurai(String nom, String boissonPreferee, int argent, String seigneur) {
		super(nom, boissonPreferee, argent);
		this.seigneur = seigneur;
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis au service de " + seigneur + ".");
	}
	
	public void boire(String boisson) {
		parler("Hmmm, j'apprécie particulièrement le " + boisson + " !");
	}
}