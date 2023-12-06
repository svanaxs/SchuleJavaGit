import java.io.Serializable;

public class Dummy implements Serializable
{
	private int zahl;
	public Dummy(int zahl, String name)
	{
		super();
		this.zahl = zahl;
		this.name = name;
	}
	private String name;
	
	public int getZahl()
	{
		return zahl;
	}
	public void setZahl(int zahl)
	{
		this.zahl = zahl;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
}
