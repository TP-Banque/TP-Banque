import java.util.ArrayList;


public class Banque {
	// variables
	private	ArrayList<Client> lesClients;
	
	// retourne client le plus riche de arrylist
	public Client PlusRiche()
	{
		// iniitialision du de la vaeiable au premier 
		Client clientRiche = lesClients.get(0);

		for(Client c : lesClients) {
			if(c.solde() >= clientRiche.solde()) {
				 clientRiche = c;
			}
		}

		return clientRiche;
	}
	
	
	//  retounr client etant dans le ouge
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
}
