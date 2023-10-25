package schule;

public class Lehrer extends Menschen
{
	private String fach;
	
	
	public  Lehrer()
	{
		super();
	}
	
	public  Lehrer(String name, int alter, String fach)
	{
		super(name,alter);
		this.fach = fach;
	}
	
	@Override
	public String toString()
	{
		return ("Name: " + super.getName() + " Alter: " + super.getAlter() + " Fach: " + fach + " Id: " + super.getId() );
	}
}