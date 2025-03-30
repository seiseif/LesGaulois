/**
 * 
 */
package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
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

	private String prendreParole() {
		return "Le Gaulois " + nom + " : ";
	}
	
	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
		System.out.println(nom + " boit une potion de force " + forcePotion);
	}
	
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + "]";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + "frappe" + romain.getNom());
		romain.recevoirCoup((force*effetPotion) / 3);
		if (this.effetPotion>1) {
			this.effetPotion--;
		}
	}
	 	
	public static void main(String[]  args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Romain seif = new Romain("Seif", 8);
		asterix.frapper(seif);
	}


	
	
}
