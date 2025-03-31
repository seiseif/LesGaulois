package personnages;

public class Village {
    private String nom;
    private Gaulois chef;
    private Gaulois[] villageois;
    private int nbVillageois = 0; 
    private static final int NB_VILLAGEOIS_MAX = 10; 

    public Village(String nom, Gaulois chef) {
        this.nom = nom;
        this.chef = chef;
        this.villageois = new Gaulois[NB_VILLAGEOIS_MAX];
    }

    public String getNom() {
        return nom;
    }

    public Gaulois getChef() {
        return chef;
    }

    public void ajouterVillageois(Gaulois gaulois) {
        if (nbVillageois < NB_VILLAGEOIS_MAX) {
            villageois[nbVillageois] = gaulois;
            nbVillageois++;
            gaulois.setVillage(this);
        } else {
            System.out.println("Le village est plein !");
        }
    }

    public Gaulois trouverVillageois(int numVillageois) {
        if (numVillageois >= 0 && numVillageois < nbVillageois) {
            return villageois[numVillageois];
        } else {
            System.out.println("Il n'y a pas autant d'habitants dans notre village !");
            return null;
        }
    }

    public void afficherVillageois() {
        System.out.println("Dans le village \"" + nom + "\" du chef " + chef.getNom());
        
        if (nbVillageois == 0) {
            System.out.println("Il n'y a pas encore de villageois.");
        } else {
            System.out.println("vivent les légendaires gaulois :");
            for (int i = 0; i < nbVillageois; i++) {
                System.out.println("- " + villageois[i].getNom());
            }
        }
    }
    
    public static void main(String[] args) {
    	
        Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
        Village village = new Village("Village des Irréductibles", abraracourcix);

        
        Gaulois asterix = new Gaulois("Astérix", 8);
        village.ajouterVillageois(asterix);

        Gaulois obelix = new Gaulois("Obélix", 25);
        village.ajouterVillageois(obelix);

        
        village.afficherVillageois();

        
        Gaulois doublepolemix = new Gaulois("DoublePolémix", 4);

        
        abraracourcix.sePresenter();
        asterix.sePresenter();
        doublepolemix.sePresenter();
    }
}

