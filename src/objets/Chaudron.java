package objets;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;
	
	public Chaudron(int quantitePotion, int forcePotion) {
		this.quantitePotion = quantitePotion;
		this.forcePotion = forcePotion;
	}
	
	public void remplirChaudron(int quantite, int forcePotion) {
		quantitePotion = quantite;
		this.forcePotion = forcePotion;
	}
	
	public Boolean resterPotion() {
		if (quantitePotion>1 ) {
			return true;
		}else {
			return false;
		}
	}
	
	public int prendreLouche() {
		quantitePotion --;
		if (quantitePotion == 0) {
			forcePotion = 0;
		}
		return forcePotion;
	}
}
