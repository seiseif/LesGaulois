/**
 * 
 */
package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village = null;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public void setVillage(Village village) {
        this.village = village;
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
	 
	public void sePresenter() {
        System.out.print("Le Gaulois " + nom + " : ");
        if (village == null) {
            System.out.println("\"Bonjour, je m'appelle " + nom + ". Je voyage de villages en villages.\"");
        } else if (village.getChef() == this) {
            System.out.println("\"Bonjour, je m'appelle " + nom + ". Je suis le chef du village " + village.getNom() + ".\"");
        } else {
            System.out.println("\"Bonjour, je m'appelle " + nom + ". J'habite le village " + village.getNom() + ".\"");
        }
    }
	
	public static void main(String[]  args) {
		
	}


	
	
}
