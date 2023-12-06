package interfacetests;

public abstract class Flugmaschinen implements Fliegen
{
	private String bezeichnung;
	
	public Flugmaschinen(String bezeichnung)
	{
		super();
		this.bezeichnung = bezeichnung;
	}

	public String getBezeichnung()
	{
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung)
	{
		this.bezeichnung = bezeichnung;
	}

	@Override
	public abstract void fliegen();

}
