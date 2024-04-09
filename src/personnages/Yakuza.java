package personnages;

public class Yakuza extends Humain {
    private String clan;
    private int reputation;
    private int honneur;

    public Yakuza(String nom, String clan, int argent, int reputation, int honneur) {
        super(nom, "whisky", argent);
        this.clan = clan;
        this.reputation = reputation;
        this.honneur = honneur;
    }

    public String getClan() {
        return clan;
    }

    public void extorquer(Commercant victime) {
    	parler(" Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
    	parler(" Marco, si tu tiens à la vie donne moi ta bourse !");
        int argentVolé = victime.seFaireExtorquer();
        gagnerArgent(argentVolé);
        parler(" J'ai piqué les " + argentVolé + " sous de " + victime.getNom() + ", ce qui me fait " + argent + " sous dans ma poche. HI ! HI !");
    }

    public int getReputation() {
        return reputation;
    }
    
    public void setArgent(int argent) {
        this.argent = argent;
    }

    public void augmenterReputation() {
        reputation++;
    }

    public int getHonneur() {
        return honneur;
    }
}