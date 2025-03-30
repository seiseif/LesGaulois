package objets;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;

	public Chaudron(int quantitePotion, int forcePotion) {
		this.quantitePotion = quantitePotion;
		this.forcePotion = forcePotion;
	}
	
	public void remplirChaudron(int quantite, int forcePotion) {
		this.quantitePotion = quantite;
		this.forcePotion = forcePotion;
		System.out.println("J'ain concocte"+quantite+"dose de potion magique. Elle a une force de: "+ forcePotion);
	}

	public boolean resterPotion() {
		return quantitePotion > 0;
	}

	public int prendreLouche() {
		if (quantitePotion > 0) {
			this.quantitePotion--;
			System.out.println("Une louche de potion est prise, il en reste " + quantitePotion);
			return forcePotion;
		} else {
			System.out.println("Le chaudron est vide !");
			return 0;
		}
	}
}
