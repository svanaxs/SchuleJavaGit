package interfacetests;

public class Biene extends Tier implements Fliegen
{
	private boolean istFleissig;

	

	public Biene(String name, boolean istFleissig)
	{
		super(name);
		this.istFleissig = istFleissig;
	}

	public boolean isIstFleissig()
	{
		return istFleissig;
	}

	public void setIstFleissig(boolean istFleissig)
	{
		this.istFleissig = istFleissig;
	}

	@Override
	public void fliegen()
	{
		System.out.println("SummmSummm");
	}
}
