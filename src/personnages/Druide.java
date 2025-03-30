package personnages;
import objets.Chaudron;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron;
	
	
	public Druide(String nom, int force, Chaudron chaudron) {
		this.nom = nom;
		this.force = force;
		this.chaudron = chaudron;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le Druide " + nom + " : ";
	}
	
	public void fabriquerPotion(int quantite, int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
	}
	
	public void booster(Gaulois gaulois) {
		Boolean contientPotion = chaudron.resterPotion();
		String nomGaulois = gaulois.getNom();
		if (contientPotion) {
			if (nomGaulois == "Obelix") {
				this.parler("Non, "+nomGaulois+"Non!");
			}else {
				this.parler("Tiens"+nomGaulois);
				gaulois.boirePotion(chaudron.prendreLouche());
			}
		}
		else {
			this.parler("J'ai pas de potion");
		}
	}
}
