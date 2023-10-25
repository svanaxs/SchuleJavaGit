package pizzalieferant;

public class extras
{
	private String extra;
	private double preis;
	
	public String getExtra()
	{
		return extra;
	}

	public void setExtra(String extra)
	{
		this.extra = extra;
	}

	public void setPreis(double preis)
	{
		this.preis = preis;
	}
	
	public double getPreis()
	{
		return preis;
	}

	public extras(String extra, double preis)
	{
		super();
		this.extra = extra;
		this.preis = preis;
	}

	@Override
	public String toString()
	{
		return extra;
	}
	

}
