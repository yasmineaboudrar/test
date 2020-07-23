package hiber_package;
import java.util.*;
public class Personne {

	
	private int id;
	private String nom;
	private Date ddn;
	private List<Voiture> voitures;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Date getDdn() {
		return ddn;
	}
	public void setDdn(Date ddn) {
		this.ddn = ddn;
	}
	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", ddn=" + ddn + ", voitures=" + voitures + "]";
	}
	
	
	
}
