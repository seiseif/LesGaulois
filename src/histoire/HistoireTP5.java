package histoire;

import personnages.*;

public class HistoireTP5 {

	public static void main(String[] args) {

		Traitre masako = new Traitre("Masako", "whisky", 100, "Miyamoto");

		Commercant kumi = new Commercant("Kumi", "saké", 50);
		Commercant chonin = new Commercant("Chonin", "thé", 50);
		Commercant marco = new Commercant("Marco", "café", 50);

		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 80, "Warsong");

		Commercant akimoto = new Commercant("Akimoto", "saké", 70);
		Commercant roro = new Commercant("Roro", "shochu", 60);

		masako.faireLeGentil(kumi);
		masako.ranconner(kumi);
		kumi.direBonjour();

		masako.ranconner(chonin);
		chonin.direBonjour();

		masako.ranconner(marco);
		marco.direBonjour();

		akimoto.direBonjour();
		akimoto.direBonjour();

		masako.direBonjour();
		masako.direBonjour();

		masako.direBonjour();
		masako.ranconner(kumi);

		yaku.direBonjour();

		masako.faireLeGentil(yaku);

		yaku.direBonjour();

		masako.direBonjour();

		roro.direBonjour();
	}
}