package fr.univ_smb.iae_mtii.maisseh.vehicules;
import fr.univ_smb.iae_mtii.maisseh.personnes.Conducteur;

public class Vehicule {
	private String marque;
	private String couleur;
	private String num_imat;
	private Integer vitesse_inst;
	private Conducteur Conducteur;
	
	public Conducteur getConducteur() {
		return Conducteur;
	}
	public void setConducteur(Conducteur conducteur) {
		Conducteur = conducteur;
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
	public String getNum_imat() {
		return num_imat;
	}
	public void setNum_imat(String num_imat) {
		this.num_imat = num_imat;
	}
	public Integer getVitesse_inst() {
		return vitesse_inst;
	}
	public void setVitesse_inst(Integer vitesse_inst) {
		this.vitesse_inst = vitesse_inst;
	}
	public Vehicule(String marque, String couleur, String num_imat, Integer vitesse_inst) {
		super();
		this.marque = marque;
		this.couleur = couleur;
		this.num_imat = num_imat;
		this.vitesse_inst = vitesse_inst;
	}
	public String toString(){
		return "Vehicule de marque: "
		+ this.getMarque()
		+ " de couleur " +this.getCouleur()
		+ " roulant a une vitesse de " + this.getVitesse_inst()
		+ " km/h.\n"; // caractere de retour a la ligne
		}
	public void afficherCaracteristiques() {
		System.out.println( this.toString() ); // on appelle la methode précédente
		
			
		}
	
}
