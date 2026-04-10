package village_gaulois;

import personnages.Gaulois;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private Gaulois chef;
	private Gaulois[] villageois;

	public Village(String nom, Gaulois chef, final int NB_VILLAGEOIS_MAX) {
		this.nom = nom;
		this.chef = chef;
		chef.setVillage(this);
		this.villageois = new Gaulois[NB_VILLAGEOIS_MAX];
	}

	public String getNom() {
		return nom;
	}

	public Gaulois getChef() {
		return chef;
	}
	
	public String getChefNom() {
		return chef.getNom();
	}

	public void ajouterVillageois(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		gaulois.setVillage(this);
		nbVillageois++;

	}

	public Gaulois trouverVillageois(int numVillageois) {
		if (numVillageois - 1 >= nbVillageois) {
			System.out.println("Il n’y a pas autant d’habitants dans notre village !");
			return null;
		}
		if (villageois[numVillageois - 1] != null) {
			return villageois[numVillageois - 1];

		}

		return null;
	}

	public void afficherVillage() {
		System.out.println("Dans le village " + nom + " du chef " + chef + " vivent les légendaires gaulois :");
		for (int i = 0; i < villageois.length; i++) {
			Gaulois gaulois = villageois[i];
			if (gaulois != null) {
				System.out.println("-" + gaulois.getNom());
			}
		}
	}

	public static void main(String[] args) {
		Gaulois abracourcix = new Gaulois("Abracourcix", 6);
		Village village = new Village("Village des Irreductibles", abracourcix, 30);
		Gaulois asterix = new Gaulois("Asterix", 8);
		Gaulois obelix = new Gaulois("Obelix", 25);
		
		village.ajouterVillageois(asterix);
		abracourcix.sePresenter();
		asterix.sePresenter();
		obelix.sePresenter();

	}
}
