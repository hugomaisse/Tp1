package fr.univ_smb.iae_mtii.maisseh.personnes;
import java.util.ArrayList;



import fr.univ_smb.iae_mtii.maisseh.vehicules.Vehicule;

public class Conducteur {
	private String Nom;
	private Integer Age;
	private Integer NumPerm;
	private ArrayList<Vehicule> vehiculesConduits  = new ArrayList<Vehicule>();
	
	public ArrayList<Vehicule> getVehiculesConduits() {
		return vehiculesConduits;
	}
	public void setVehiculesConduits(ArrayList<Vehicule> vehiculesConduits) {
		this.vehiculesConduits = vehiculesConduits;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public Integer getAge() {
		return Age;
	}
	public void setAge(Integer age) {
		Age = age;
	}
	public Integer getNumPerm() {
		return NumPerm;
	}
	public void setNumPerm(Integer numPerm) {
		NumPerm = numPerm;
	}
	public Conducteur(String Nom, Integer Age){
		this.Nom= Nom;
		this.Age = Age; 
	}
	public void ajouterVehicule(Vehicule v){
		this.vehiculesConduits.add(v);
	}
	public void  listingVehiculesConduits() {
		//System.out.println( this.toString() ); // on appelle la methode précédente
	for (int i=0; i < this.vehiculesConduits.size(); i++) {
		System.out.println(this.vehiculesConduits.get(i).toString());
		}
	}
}
