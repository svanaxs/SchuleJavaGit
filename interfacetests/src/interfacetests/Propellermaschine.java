package interfacetests;

public class Propellermaschine extends Flugmaschinen
{
	private int anzahlProbeller;
	
	public Propellermaschine(String bezeichnung, int anzahlProbeller)
	{
		super(bezeichnung);
		this.anzahlProbeller = anzahlProbeller;
	}

	public int getAnzahlProbeller()
	{
		return anzahlProbeller;
	}

	public void setAnzahlProbeller(int anzahlProbeller)
	{
		this.anzahlProbeller = anzahlProbeller;
	}

	@Override
	public void fliegen()
	{
		System.out.println("Brummmmmm");
	}
}
