import java.util.ArrayList;


public class Client {
	private String nom , prenom;
	private ArrayList<Compte> lesCompte;

	public Client (String unNom, String unPrenom){
		nom=unNom;
		prenom=unPrenom;
		lesCompte = new ArrayList<Compte>();
	}
	
	public Client (){
	
	}

	public  solde(){



	}


	public boolean CompteRouge(){
		
		if (lesCompte.fonctionDuCompte<0){
			return true;

		}
		else {
			return false;

		}
		
	}

		public 	void ajoutCompte(Compte unCompte){
			lesCompte.add(unCompte);
		
		
		}
		
//		 public boolean add(E o){
//		      ensureCapacity(size+1);
//		      elementData[size++] = o;
//		      return true;
//		   }


	}