package hiber_package;

public class Voiture {

	
	
	private String Immatricule;
	private String marque;
	private String couleur;
	
	
	public Voiture() {
		
	}
	public int getImmatricule() {
		return Immatricule;
	}
	public void setImmatricule(int immatricule) {
		Immatricule = immatricule;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	@Override
	public String toString() {
		return "Voiture [Immatricule=" + Immatricule + ", marque=" + marque + ", couleur=" + couleur
				+ ", getImmatricule()=" + getImmatricule() + ", getMarque()=" + getMarque() + ", getCouleur()="
				+ getCouleur() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
