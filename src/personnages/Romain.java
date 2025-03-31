package personnages;
import objets.Equipement;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
    private int nbEquipement = 0;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	
	public void sEquiper(Equipement equipement) {
        switch (nbEquipement) {
            case 2:
            	System.out.println("Le soldat " + nom + " est déjà bien protégé !");
                break;
            case 1:
                if (equipements[0] == equipement) {
                	System.out.println("Le soldat " + nom + " possède déjà un " + equipement + " !");
                } else {
                    ajouterEquipement(equipement);
                }
                break;
            case 0:
                ajouterEquipement(equipement);
                break;
        }
    }
	
	private void ajouterEquipement(Equipement equipement) {
        equipements[nbEquipement] = equipement;
        nbEquipement++;
        System.out.println(nom + " s'équipe avec un " + equipement + ".");
    }
	
	public void recevoirCoup(int forceCoup) {
		assert forceCoup > 0;
		this.force = this.force - forceCoup;
		if (this.force<1) {
			parler("J'abondonne");
		}
		else {
			prendreParole();
			parler("Aie");
		}
	}
	
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le Romain " + nom + " : ";
	}
	
	public static void main(String[]  args) {
		Romain minus = new Romain("Minus", 10);

        minus.sEquiper(Equipement.CASQUE);
        minus.sEquiper(Equipement.CASQUE); 
        minus.sEquiper(Equipement.BOUCLIER);
        minus.sEquiper(Equipement.CASQUE);
	}
}
