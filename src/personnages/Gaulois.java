package personnages;

import objets.Equipement;
import village_gaulois.Village;
import java.util.logging.Logger;

public class Gaulois {
	private String nom;
	private int force;
	private int nb_trophees;
	private int effetPotion = 1;
	private Village village = null;
	private Equipement[] trophees = new Equipement[100];
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	/*
	 * private String prendreParole() { return "Le Gaulois " + nom + " : "; }
	 */

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	/*
	 * public String toString() { return "Gaulois [nom=" + nom + ", force=" + force
	 * + "]"; }
	 */

	/*
	 * public void frapper(Romain romain) { System.out.println(nom +
	 * " envoie un grand coup dans la machoire de " + romain.getNom());
	 * romain.recevoirCoup((force * effetPotion) / 3); effetPotion--; }
	 */

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] trophees = romain.recevoirCoup((force / 2) * effetPotion);
		effetPotion--;
		if (effetPotion < 1) {
			effetPotion = 1;
		}
		for (int i = 0; trophees != null && i < trophees.length; i++, nb_trophees++) {
			this.trophees[nb_trophees] = trophees[i];
		}
		return;
	}

	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
	}

	public void setVillage(Village village) {
		this.village = village;
	}

	public void sePresenter() {
		if (village != null) {
			if (nom == village.getChefNom()) {
				parler("Bonjour, je m'appelle " + nom + ". Je suis le chef du village : " + village.getNom() + ".");
			} else {
				parler("Bonjour, je m'appelle " + nom + ". J'habite le village : " + village.getNom() + ".");
			}

		}
		if (village == null) {
			parler("Bonjour, je m'appelle " + nom + ". Je voyage de villages en villages.");
		}
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix.toString());

	}

}
