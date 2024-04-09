package histoire;

import personnages.*;

public class HistoireTP4 {
	public static void main(String[] arg) {
		Humain Prof = new Humain ("Prof", "kombucha", 54);
		Commercant marco = new Commercant("Marco", 20);
		Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", "whisky", 30, 20, 10);
		
		
        Prof.direBonjour();
        Prof.acheter("une boisson", 12);
        Prof.boire();
        Prof.acheter("un jeu", 2);
        Prof.acheter("kimono", 50);
        System.out.println("\n------------------------\n");
        marco.direBonjour();
        marco.seFaireExtorquer();
        marco.recevoir(15);
        marco.boire();
        System.out.println("\n------------------------\n");
        yakuLeNoir.direBonjour();
        yakuLeNoir.extorquer(marco);
        System.out.println("\n------------------------\n");
	}
}