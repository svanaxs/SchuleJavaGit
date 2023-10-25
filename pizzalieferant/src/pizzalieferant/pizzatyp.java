package pizzalieferant;

public class pizzatyp
{
	private String name;
	private double preis;
	
	public String getName()
	{
		return name;
	}


	public void setName(String name)
	{
		this.name = name;
	}


	public void setPreis(double preis)
	{
		this.preis = preis;
	}
	public double getPreis()
	{
		return preis;
	}


	public pizzatyp(String name, double preis)
	{
		this.name = name;
		this.preis = preis;
	}


	@Override
	public String toString()
	{
		return name;
	}
	
	
}
