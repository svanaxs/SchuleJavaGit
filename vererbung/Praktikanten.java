package vererbung;

public class Praktikanten extends Mitarbeiter
{
	private double hungerlohn;
	
	public Praktikanten()
	{
	}
	
	public Praktikanten(double hungerlohn)
	{
		this.hungerlohn = hungerlohn;
	}
	
	public Praktikanten(String name, Adresse adresse, double hungerlohn)
	{
		super(name, adresse);
		this.hungerlohn = hungerlohn;
	}
	
	public Praktikanten(String name,double hungerlohn)
	{
		super(name);
		this.hungerlohn = hungerlohn;
	}
	
	
	@Override
	public double berechneEntgelt()
	{
		return hungerlohn;
	}
		
	
	
}
