import java.util.ArrayList;


public class Client {
	private String nom , prenom;
	private ArrayList<Compte> lesComptes;

	public Client (String unNom, String unPrenom){
		nom=unNom;
		prenom=unPrenom;
		lesComptes = new ArrayList<Compte>();
	}

	public Client (){

	}

	public double solde(){
		double solde = 0.0;
		for (Compte unCompte : lesComptes){
				solde =solde+unCompte.getSolde();
		}
		return solde;

	}


	public boolean CompteRouge(){
		for (Compte unCompte : lesComptes){
			if (unCompte.getSolde()<0.0){
				return true;

			}
		}
				return false;

		

	}

	public 	void ajoutCompte(Compte unCompte){
		lesComptes.add(unCompte);


	}




}