package personnages;

public class Humain {
	private String nom;
	private String boissonPref;
	protected int argent;
	
	public String getNom() {
		return nom;
	}
    public int getArgent() {
        return argent;
    }
	public String getboissonPref( ) {
		return boissonPref;
	}
	public Humain(String nom, String boissonPref, int argent) {
		this.nom = nom;
		this.argent = argent;
		this.boissonPref = boissonPref;
	}
	public void parler(String texte) {
		System.out.println("''" + texte + "''");
	}
	public void boire() {
		parler(" Mmmmm, un bon verre de " + boissonPref + "! GLOUPS !");
	}
	public void direBonjour() {
		parler(" Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonPref);
	}
	protected void gagnerArgent(int gain) {
		this.argent += gain; 
	}
	protected void perdreArgent(int perte) {
		this.argent -= perte;
	}
    public void acheter(String bien, int prix) {
        if (argent >= prix) {
            System.out.println(" J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
            perdreArgent(prix);
        } else {
            System.out.println(" Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
        }
    }
}