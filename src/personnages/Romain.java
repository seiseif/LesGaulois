package personnages;

import objets.Equipement;

public class Romain {
	private String nom;
	private int force;
	private Equipement equipements[] = { null, null };
	private int nbEquipement = 0;
	

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public int getForce() {
		return force;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le Romain " + nom + " : ";
	}

	private boolean isInvariantVerified() {
		return force >= 0;
	}

	/*
	 * public void recevoirCoup(int forceCoup) { force = force - forceCoup;
	 * isInvariantVerified(); if (force < 1) { parler("J'abondonne"); } else {
	 * parler("Aie"); }
	 * 
	 * }
	 */

	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		if (force == forceCoup) {
			System.out.println("Egalite");
		}
		forceCoup = CalculerResistanceEquipement(forceCoup);
		
		force -= forceCoup;
		if (force>0) {
			parler("Aïe");
			equipementEjecte = ejecterEquipement();
		}else {
			parler("J'abandonne...");
		}
		return equipementEjecte;
	}

	private int CalculerResistanceEquipement(int forceCoup) {
		String texte;
		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
			for (int i = 0; i < nbEquipement;i++) {
				if (equipements[i] != null) {
					if (equipements[i].equals(Equipement.BOUCLIER)) {
						resistanceEquipement += 8;
					}
					if (equipements[i].equals(Equipement.CASQUE)) {
						resistanceEquipement += 5;
					}
				}
				
			}
			texte +=resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		if (forceCoup<0) {
			forceCoup = 0;
		}
		return forceCoup;
	}

	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom + " s'envole sous la force du coup.");
		//TODO
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] != null) {
				equipementEjecte[nbEquipementEjecte] = equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
			}
		}
		return equipementEjecte;
	}

	public void sEquiper(Equipement equipement) {
		if (nbEquipement >= 2) {
			System.out.println("le soldat " + nom + " est déjà bien protégé !");
		} else {
			if (nbEquipement == 1) {
				if (equipement.toString() == equipements[0].toString()) {
					System.out.println("le soldat " + nom + " possede deja un " + equipement.toString());
				} else {
					equipements[1] = equipement;
					System.out.println("le soldat " + nom + " s'equipe avec un " + equipement);
					nbEquipement++;
				}
			} else {
				equipements[0] = equipement;
				System.out.println("le soldat " + nom + " s'equipe avec un " + equipement);
				nbEquipement++;
			}
		}

	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 4);
		Equipement casque = Equipement.CASQUE;
		Equipement casque2 = Equipement.CASQUE;
		Equipement casque3 = Equipement.BOUCLIER;
		minus.sEquiper(casque);
		System.out.println(minus.equipements[0]);
		minus.sEquiper(casque2);
		minus.sEquiper(casque3);
		minus.sEquiper(casque3);
	}

}
