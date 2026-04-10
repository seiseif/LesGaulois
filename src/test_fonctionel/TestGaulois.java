package test_fonctionel;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

import java.util.Iterator;

import objets.Chaudron;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 16);
		Romain brutus = new Romain("Brutus", 14);
		Druide panoramix = new Druide("Panoramix", 2);

		panoramix.fabriquerPotion(4, 3);
		panoramix.booster(obelix);
		panoramix.booster(asterix);

		int i = 0;
		while (i < 3) {
			asterix.frapper(brutus);
			i++;
		}
	}

}
