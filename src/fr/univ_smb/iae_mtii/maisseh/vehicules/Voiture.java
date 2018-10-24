package fr.univ_smb.iae_mtii.maisseh.vehicules;

public class Voiture extends Vehicule {
	private Integer nbPortes;

	public Integer getNbPortes() {
		return nbPortes;
	}

	public void setNbPortes(Integer nbPortes) {
		this.nbPortes = nbPortes;
	}

	public Voiture(String marque, String couleur, String num_imat, Integer vitesse_inst, Integer nbPortes) {
		super(marque, couleur, num_imat, vitesse_inst);
		// TODO Auto-generated constructor stub
		this.nbPortes = nbPortes;
	}
	
	public String toString(){
		super.toString();
		return "Vehicule de marque: "
		+ this.getMarque()
		+ " de couleur " +this.getCouleur()
		+ " roulant a une vitesse de " + this.getVitesse_inst()
		+ " km/h.\n" // caractere de retour a la ligne
		+ " ce véhicule est une voiture"
		+ " qui a "+ this.getNbPortes() +" Portes "+"\n";
		}
}
