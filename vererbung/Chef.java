package vererbung;

public class Chef extends Mitarbeiter
{
	private double basisgehalt;
	
	public Chef()
	{
	}
	
	public Chef(double basisgehalt)
	{
		this.basisgehalt = basisgehalt;
	}
	
	public Chef(String name, Adresse adresse, double basisgehalt)
	{
		super(name, adresse);
		this.basisgehalt = basisgehalt;
	}
	
	public Chef(String name, double basisgehalt)
	{
		super(name);
		this.basisgehalt = basisgehalt;
	}
	
	@Override
		public double berechneEntgelt()
		{
			return basisgehalt;
		}
	
	
}
