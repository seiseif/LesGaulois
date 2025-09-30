package personnages;

import objets.Chaudron;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron = new Chaudron(0,0);
	
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
		return "Le druide " + nom + " : ";
	}
	
	public void fabriquerPotion(int quantite, int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		this.parler("J'ai concocte " + quantite + " dose do potion magique. Elle a une force de "+ forcePotion +".");
		
	}
	
	public void booster(Gaulois gaulois) {
		String nomGaulois = gaulois.getNom();
		Boolean contientPotion = chaudron.resterPotion();
		if (contientPotion) {
			
			if (nomGaulois == "Obélix") {
				this.parler("Non," + nomGaulois + " Non!... Et tu le sais tres bien!");
				
			}else {
				int forcePotion = chaudron.prendreLouche();
				gaulois.boirePotion(forcePotion);
				this.parler("Tiens "+ nomGaulois + " un peu de potion magique.");
				
			}
		}else {
			this.parler("Desole"+ nomGaulois + "il n'y a plus de potions");
		}
	}
}
