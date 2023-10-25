package pizzalieferant;

public class groesse
{
	private String groesse;
	private double preis;
	
	public double getPreis()
	{
		return preis;
	}
	
	public String getGroesse()
	{
		return groesse;
	}

	public void setGroesse(String groesse)
	{
		this.groesse = groesse;
	}

	public void setPreis(double preis)
	{
		this.preis = preis;
	}
	
	public groesse(String groesse, double preis)
	{
		super();
		this.groesse = groesse;
		this.preis = preis;
	}

	@Override
	public String toString()
	{
		return groesse;
	}
	


}
