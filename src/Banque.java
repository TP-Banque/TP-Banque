import java.util.ArrayList;


public class Banque {
	// variables
	private	ArrayList<Client> lesClients;



	// retourne le client le plus riche de l'arrylist
	public Client PlusRiche()
	{
		// initialisation du de la variable au premier 
		Client clientRiche = lesClients.get(0);

		for(Client c : lesClients) {
			if(c.solde() >= clientRiche.solde()) {
				clientRiche = c;
			}
		}

		return clientRiche;
	}


	//  retourne le  client etant dans le rouge
	public ArrayList<Client> dansLeRouge()
	{

		ArrayList<Client> INROUGE = new ArrayList<Client>();

		for(Client c : lesClients) {
			if(c.solde() < 0 ) {
				INROUGE.add(c);
			}
		}
		return INROUGE;
	}

	//Fonction ajouter Client 
	public void ajouterClient(Client unClient) {
		lesClients.add(unClient);
	}
	
	// afficher les clients
	 public static void toString() {
                for (Client unClient : lesClients) {
                        System.out.println(Client.getNom() + " " + Client.getPrenom() + " est un client de cette banque.");
                }
        }
}
