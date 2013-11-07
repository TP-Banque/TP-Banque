
public class CompteCourant extends Compte {
	// variables
	private double decouvertMax;

	//  constructeur
	public CompteCourant(Client client, int numero, double solde, double dec_autorise)
	{
		super(client, numero, solde);
		decouvertMax = dec_autorise;
	}
//  constructeur vide
	public CompteCourant()
	{
		super();
		
	}


	// debite solde 
	public boolean debiter(double montant)
	{
		if(solde - montant >= decouvertMax)
		{
			solde -= montant;
			return true;
		}
		return false;
	}
}
