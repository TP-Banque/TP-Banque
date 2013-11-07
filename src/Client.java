import java.util.ArrayList;


public class Client {
	private static String nom;
	private static String prenom;
	private ArrayList<Compte> lesComptes;


	// constructeur avec attrbiut
	public Client (String unNom, String unPrenom){
		nom=unNom;
		prenom=unPrenom;
		lesComptes = new ArrayList<Compte>();
	}
	//constructeur vide
	public Client (){

	}


	//Retourne le solde général du client
	public double solde(){
		double solde = 0.0;
		for (Compte unCompte : lesComptes){
			solde += unCompte.getSolde();
		}
		return solde;

	}

	// Retourne si un de ces compte est dans le rouge
	public boolean CompteRouge(){
		for (Compte unCompte : lesComptes){
			if (unCompte.getSolde() < 0.0){
				return true;

			}
		}
		return false;



	}

	//Fonction ajouter compte 
	public 	void ajoutCompte(Compte unCompte){
		lesComptes.add(unCompte);


	}
	  public static String getNom() {
          return nom;
  }
  
  public static String getPrenom() {
          return prenom;
  }
  
  public void setNom(String unNom) {
          nom = unNom;
  }
  
  public void setPrenom(String unPrenom) {
          prenom = unPrenom;
  }
  
  public String toString() {
      return this.getNom() + " " + this.getPrenom();
}




}