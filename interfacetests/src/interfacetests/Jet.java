package interfacetests;

public class Jet extends Flugmaschinen
{
	private double schubkraft;
	
	public Jet(String bezeichnung, double schubkraft)
	{
		super(bezeichnung);
		this.schubkraft = schubkraft;
	}

	public double getSchubkraft()
	{
		return schubkraft;
	}

	public void setSchubkraft(double schubkraft)
	{
		this.schubkraft = schubkraft;
	}

	@Override
	public void fliegen()
	{
		System.out.println("Zisch");
	}

}
