package fr.univ_smb.iae_mtii.maisseh.vehicules;
import fr.univ_smb.iae_mtii.maisseh.vehicules.Voiture;
import fr.univ_smb.iae_mtii.maisseh.personnes.Conducteur;
import fr.univ_smb.iae_mtii.maisseh.vehicules.Camion;


public class VehiculeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voiture V1 = new Voiture("Renault", "jaune", "12-AB-30", 200 , 5);
		Voiture V4 = new Voiture("peugeot", "noir", "32-RB-70", 150 , 3);
		Camion V2 = new Camion("mercedes", "rouge","30-DF-45", 90, 1);
		Camion V3 = new Camion("mercedes", "bleu","34-JH-49", 90, 2);
		//Camion V3 = ;
		
		
		V1.setCouleur("violet");
		V1.setNbPortes(1);
		Conducteur C1 = new Conducteur("Holmes",23);
		Conducteur C2 = new Conducteur("Calvin",45);
		V1.setConducteur(C1);
		System.out.println(V1.getConducteur().getNom());
		
//		V1.afficherCaracteristiques();
//		V2.afficherCaracteristiques();
//		V3.afficherCaracteristiques();
		C1.ajouterVehicule(V1);
		C1.ajouterVehicule(V2);
		C2.ajouterVehicule(V3);
		C2.ajouterVehicule(V4);
//		System.out.println(C1.getVehiculesConduits());
		C1. listingVehiculesConduits();
		C2. listingVehiculesConduits();
	}

	
	

	
}
