package test_fonctionnel;
import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;
import objets.Chaudron;

public class TestGaulois {
	
	public static void main(String[]  args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
        Gaulois obelix = new Gaulois("Obelix", 16);
        Romain brutus = new Romain ("Brutus", 14);
        Chaudron chaudron = new Chaudron(0,0);
        Druide panoramix = new Druide ("Panoramix", 2, chaudron);
        panoramix.fabriquerPotion(4, 2);
        panoramix.booster(obelix);
        panoramix.booster(asterix);
        
        
        int i = 0;
        while (i < 3) {
            asterix.frapper(brutus);
            i++;
        }
	}
}
