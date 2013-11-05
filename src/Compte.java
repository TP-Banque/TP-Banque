
public class Compte{
	// variables
	private Client client;
	private int numero;
	protected double solde;

	// constructeur
	public Compte(Client client, int numero, double solde)
	{
		this.client = client;
		this.numero = numero;
		this.solde = solde;
	}

	// credite compte montant  en parametre
	public void crediter(double montant)
	{
		solde += montant;
	}
	
	// debite compte montant en parametre si superieur a 0
	public boolean debiter(double montant)
	{
		if(solde - montant >= 0)
		{
			solde -= montant;
			return true;
		}
		return false;
	}

	//retour le solde du compte 
	public double getSolde()
	{
		return solde;
	}

	// ajoute le montant  defini au compte defini et retourne  1/0
	public boolean transfert(int montant, Compte CompteATransferer)
	{
		if(debiter(montant) == true )
		{
			CompteATransferer.crediter(montant);
			return true;
		}
		return false;
	}
	// comppare  2 sold ede compte et retour 1/0
	public boolean comparer(Compte Compte)
	{
		if( solde <= Compte.getSolde())
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}
}