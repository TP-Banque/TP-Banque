
public class CompteEpargne extends Compte
{
	// variables
	private double tauxInteret; 
	// constructeur

	public CompteEpargne(Client client, int numero, double solde, double tauxInteret)
	{
		super(client, numero, solde);
		this.tauxInteret = tauxInteret; 
	}
}