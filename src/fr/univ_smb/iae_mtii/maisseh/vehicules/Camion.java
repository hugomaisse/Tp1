package fr.univ_smb.iae_mtii.maisseh.vehicules;

public class Camion extends Vehicule{
	private Integer categorie;

	public Integer getCategorie() {
		return categorie;
	}

	public void setCategorie(Integer categorie) {
		this.categorie = categorie;
	}

	public Camion(String marque, String couleur, String num_imat, Integer vitesse_inst, Integer categorie) {
		super(marque, couleur, num_imat, vitesse_inst);
		// TODO Auto-generated constructor stub
		this.categorie= categorie;
	}
	public String toString(){
		super.toString();
		return "Vehicule de marque: "
		+ this.getMarque()
		+ " de couleur " +this.getCouleur()
		+ " roulant a une vitesse de " + this.getVitesse_inst()
		+ " km/h.\n" // caractere de retour a la ligne
		+ " ce véhicule est un Camion "
		+ " qui est de catégorie : "+ this.getCategorie() +"\n";
		}
}
