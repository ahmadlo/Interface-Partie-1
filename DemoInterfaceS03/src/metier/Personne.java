package metier;

import service.Isport;

public class Personne implements Isport {
	private String nom;
	

	/**
	 * @param nom
	 */
	public Personne(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public void Courir() {
		System.out.println(this.nom + " sait courir ");

	}

	@Override
	public void Nager() {
		System.out.println(this.nom + " sait nager ");

	}

}
