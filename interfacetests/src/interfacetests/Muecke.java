package interfacetests;

public class Muecke extends Tier implements Fliegen
{
	private boolean kannStechen;

	public Muecke(String name, boolean kannStechen)
	{
		super(name);
		this.kannStechen = kannStechen;
	}

	public boolean isKannStechen()
	{
		return kannStechen;
	}

	public void setKannStechen(boolean kannStechen)
	{
		this.kannStechen = kannStechen;
	}

	@Override
	public void fliegen()
	{
		System.out.println("TZZZ TZZZ");
	}
}
