package personnages;

public class Humain {
	private String nom;
	private String boissonPref;
	private int argent;
	
	public String getNom() {
		return nom;
	}
	public String getboissonPref( ) {
		return boissonPref;
	}
	public Humain(String nom, String boissonPref, int argent) {
		this.nom = nom;
		this.argent = argent;
		this.boissonPref = boissonPref;
	}
	protected void parler(String texte) {
		System.out.println("''" + texte + "''");
	}
	private void boire() {
		parler("Mmmmm, un bon verre de " + boissonPref + "! GLOUPS !");
	}
	private void direBonjour() {
		parler(" Bonjour ! Je m'appelle " + nom + "et j'aime boire du " + boissonPref);
	}
	protected void gagnerArgent(int gain) {
		this.argent += gain; 
	}
	protected void perdreArgent(int perte) {
		this.argent -= perte;
	}
	public void acheter(String bien, int prix) {
		perdreArgent();
		gagnerArgent();
	}
}