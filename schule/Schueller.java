package schule;

public class Schueller extends Menschen
{
	private int klasse;
	private int jahresbeitrag = 5;
	
	
	public  Schueller()
	{
		super();
	}
	
	public  Schueller(int klasse)
	{
		this.klasse = klasse;
	}
	
	public  Schueller(String name, int alter, int klasse)
	{
		super(name,alter);
		this.klasse = klasse;
	}
	
	public double Beitragrechner()
	{
		
		return  (double) super.getAlter() / klasse * jahresbeitrag;
		
	}
	
	@Override
	public String toString()
	{
		return ("Name: " + super.getName() + " Alter: " + super.getAlter() + " Klasse: " + klasse + " Beitrag: " + Beitragrechner() + " Id: " + super.getId() );
	}
	
}